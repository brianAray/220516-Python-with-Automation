from flask import Flask, request
# We import one extra package for this page as its important when dealing with HTTP requests
# It is used below

app = Flask(__name__)

# This example will work best with Postman
# If you have not used Postman or you are not comfortable with it, here is a resource for you
# https://www.guru99.com/postman-tutorial.html

# Specifically though, we just want to send specific methods to our Flask server that will
# require a bit too much work using a browser but if you want a good practice to get more
# comfortable with JavaScript, Fetch API, and HTML then implement these yourselves in your browser!

# The HTTP protocol provides some defined methods like the following
# GET
# Sends data in unecrypted from to the server, common
#
# POST
# Used to send data in the body of a HTTP request
#
# PUT
# Used to update a resource on the server side with provided data in the body of the request
#
# DELETE
# Removes all representations of the resource given by a URL
#
# These methods make up CRUD (Create, Read, Update, and Delete) which are used in database management
#
# By default, Flask assumes that any route is a GET method but to apply a different Method we can
# do the following

# This endpoint has two methods available, POST or GET in the list provided
# If it is a PUT method, for example, it will not work
# In order to know what method was sent, we can check using the request object imported
# Check right at the top to see how it is is imported
@app.route('/register', methods = ['POST', 'GET'])
def login():
    # request refers to the HTTP request sent to us by the browser
    # request.method returns the value of the method used, we can check this and 
    # run different code depending on it
    if request.method == 'POST':
        # The request is is based around the assumption you are using forms in your
        # HTML to submit data, if you do not know how to use forms in postman
        # follow this link:
        # https://learning.postman.com/docs/sending-requests/requests/
        # Go to the part about sending data in a body
        if valid_login(request.form['username'], request.form['password']):
            return f"{request.form['username']} and {request.form['password']}"
    else:
        return "register user page"

def valid_login(username, password):
    # This is a boolean shortcut
    # we check if username and password are true
    # boolean with a string checks if it is empty or not
    # empty string = False
    # 'and' checks that they are both True, if either are False then it returns True
    
    # THIS IS NOT AN IMPLEMENTATION OF VALIDATING LOGIN
    # IT IS A SIMPLE EXAMPLE TO SHOW FUNCTIONALITY
    # I BETTER NOT SEE THIS IN YOUR CODE!

    # But the boolean shortcut is cool, shorter than doing an if-else
    return username and password


# An example of how a delete route could be structured
# The implementation is useless but the structure is straightforward
# make your own routes and get comfortable with the syntax
@app.route('/delete/<int:user_id>', methods=['DELETE'])
def delete_user(user_id):
    if user_id:
        print(f"User {user_id} has been deleted!")
    else:
        print(f"Invalid user id provided: {user_id}")

if __name__ == '__main__':
    app.run()