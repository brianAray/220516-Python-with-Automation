from flask import Flask
# The above statement imports the Flask object from the flask module
# This is not available to you by default, this is why pip is required 
# to install it from PyPi (the online Python package repository)

# The Flask constructor takes in the name of the current module (__name__)
# as an argument, from now we will be using app as its reference after instantiating it
app = Flask(__name__)


# The route() function of the Flask class is a decorator
# A decorator can be distinguished by the use of an @ prefixing it
# This tell the application which URL should call the associated function

# The second parameter is methods=["GET"] which is the options of the route
# We are indicating what HTTP method it is expected and it needs to be in a list

# The URL of '/' indicates the domain name by default, you are provided the domain name
# When you run the program, most likely it will be something like:

#  * Serving Flask app 'app' (lazy loading)
#  * Environment: production
#    WARNING: This is a development server. Do not use it in a production deployment.
#    Use a production WSGI server instead.
#  * Debug mode: off
#  * Running on http://127.0.0.1:5000 (Press CTRL+C to quit)

# However this will vary so look in the terminal to see where it was run to know

@app.route('/', methods=["GET"])
def hello():
    return 'Hello World'

# When the server receives a hit to that URL, it calls the function defined below it
# So when you go to the domain name, as remember a '/' indicates just domain name
# as a '/' is required before any parameter for a URL
# It will call the function hello(), which returns a string 'Hello World'
# To the browser that put in that URL, on the page, if not HTML is provided, it will
# Just show the text in the browser web page
# If you look at the HTML using inspect (f12 or right click > inspect) you will see
# in the body of the HTML tag <body>Hello World</body>


# Finally in order to run the server, we need to tell Python that this is a runnable
# Script. Previously you may not have seen this but this is how we can tell Python
# That this file should be run and not referenced as an import
# This checks to make sure that we are in a main file which is done automatically
# If you run python file from this file
# Only if you run this file will the web server run, if you run a different file without
# This then the web server will not run
if __name__ == '__main__':
    app.run()

# app.run() can be provided arguments if you want the server to run with different
# functionalities. These are:
# app.run(host, port, debug, options)

# host: The hostname to listen on, it defaults to 127.0.0.1 (localhost)
#       If you want to have it available externally use 0.0.0.0

# port: defaults to 5000, the port number that the web server is running on
#       Only one process can run on a port at a time so make sure nothing else
#       is running on the port. A common error is not stopping a previous flask
#       server that was running before running the new one.
#       Make sure to close the server when you are done with it, you can do this
#       by going to the terminal it is running in and pressing (ctrl + c)

# debug: defaults to false
#        If you set this to true then you are provided with additional information
#        relating to debugging and development. This is handy when you are creating
#        The server and you are dealing with errors and you don't know why or what
#        it is

# options: To be forwarded to underlying Wekzeug server
#           This is the server that is running under the hood of Flask, it is not
#           essential to know what this does but if you want to know more here is
#           a link
#           https://werkzeug.palletsprojects.com/en/2.1.x/serving/