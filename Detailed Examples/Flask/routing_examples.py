from flask import Flask

app = Flask(__name__)

# by default, if you do not provide a methods=[] with the method you want to use
# it will assume it is a GET method
@app.route('/decorator')
def hello():
    return "Hello"

# Another way of writing the above without the decorator is
# The difference is the URL is a different endpoint, if it was in the
# decorator then you do not need to have a , separating the argument provided
# You also have to provide the function explicitly
# It is a lot more code to write for no additional functionality
# IT IS NOT GOOD CODE TO WRITE EXTRA CODE FOR NO REASON
def hello_no_decorator():
    return "Hello"
app.add_url_rule('/', 'nodecorator', hello_no_decorator)


# This is a variable URL rule
# The route is expecting a variable after the url like '/hello/Mike'
# The < > tells Flask that this is a variable name and we can reference it
# in our function as if it were given to us in Python code
@app.route('/hello/<name>')
def hello_name(name):
    # If you use variable URLs make sure to put the variable name matching
    # in the function parameters!!!
    return f"Hello {name}"

# So what else can we provide in a URL for Flask and Python?
# Here are some examples:

# This is how you specify an integer is expected
# syntax:       <int:var_name>
# Don't forget the angle brackets <> and to reference it in the function parameter
@app.route('/blog/<int:post_id>')
def show_blog(post_id):
    return f"Blog number {post_id}"

# This is how you specify a float is expected
# syntax:       <float:var_name>
# Don't forget the <> and to reference it in the function parameter
@app.route('/version/<float:version_num>')
def version(version_num):
    return f"Version number {version_num}"


# If you don't know what is happening here, check out simplest_example.py for more info
if __name__ == '__main__':
    app.run(debug=True)