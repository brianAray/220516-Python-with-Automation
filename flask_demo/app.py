from flask import Flask, request

app = Flask(__name__)


@app.route('/', methods=["GET"])
def hello():
    return 'Hello Buddy'

@app.route('/greet', methods=["GET"])
def greet():
    return "Greeting!"

@app.route('/greet/<name>', methods=["GET"])
def greet_person(name):
    return f"Hello {name}"

@app.route('/blog/<int:post_id>', methods=["GET"])
def get_blog_post(post_id):
    return f"This is the blog {post_id}"

@app.route('/person', methods=["GET", "POST"])
def person_interaction():
    if request.method == "POST":
        person = {
            "name": request.form['name'],
            "age": request.form['age']
        }
        return person
    else:
        return "Hello Person people"


if __name__ == "__main__":
    app.run()