from flask import Flask, render_template
# In this example, we are bringing in the render_template
# How it is used is shown below

app = Flask(__name__)

# We can provide our own HTML with flask so when a browser hits an endpoint we are listening for
# We can return HTML that can be rendered
@app.route('/text')
def text_html():
    # As it is text that is returned through our function and that is displayed on the browser
    # If we add in HTML tags and have the right syntax, it will be displayed as HTML
    return "<h1>Hello There</h1><p>I was provided through Flask!</p>"

# If you want to wrote more than just strings of HTML, we provide templates using the
# render_template() function and providing a html file from our Python app
# in the directory templates, there is a file named 'hello.html' which is returned to the browser
# To be rendered
# Make sure to have the render_template imported right at the top!
@app.route("/hello_html")
def hello_html():
    return render_template('hello.html')
# You may notice that it is not the file path instead it is the name of the file
# This is important, if you do not name the folder that you provide the html as templates
# Then render_template() will not know where it is!


# However, templates in Flask can do more than just provide simple static files
# We can do rendering before providing it to the browser
# Let's use the variable urls we have worked with already
@app.route("/greet/<input_name>")
def greet(input_name):
    return render_template('greet.html', name=input_name)
    # The parameters are important, the name you give the keyword in the parameter
    # needs to match the name of the html value wrapped in {{ }}
    # in this example the html has {{ name }} so in the function call we say name=input_name

# There are more ways you can use render_templates and if you are interested, here are some notes
# https://www.tutorialspoint.com/flask/flask_templates.htm

if __name__ == '__main__':
    app.run()
