# Introduction
This project is to provide a deeply commented demo of **Flask**. It should not be used as your only source of guidance with **Flask** (If you are, then you are **seriously** missing out on the wealth of resources out there). **Flask** is a package that provides a fast and easy startup for web servers with Python. It provides with us a bunch of useful methods and objects that let us create web servers right off the bat with very little boiler plate code.

The files all contain comments explaining how they work but to minimize duplicate comments and notes, the simpler examples will have the more indepth comments and notes. Proceed through them and make sure you write your own versions, **not** just copy and paste. The only way to learn coding is typing it yourself, use the notes and examples as a stepping stone to become more comfortable with the Flask.

<br>

> If you want to know more about Flask, here are the [docs](https://flask.palletsprojects.com/en/2.1.x) <br> Remember to match your version of Flask with the version of the docs, It may change from the time of writing this so **always check!**

<br>

# Preparing the Environment

Before you begin working with **Flask** or more importantly, any Python project, make sure you create a new folder and a new virtual environemnt using either the `virtualenv` package or doing it manually. Either way, make sure it is there and you are not working with the default Python environment.

The required packages are in the file directory under than name `requirements.txt` which can be used to install the required packages using `pip` in the terminal **not** a python file. Again, make sure that you are inside a virtual environment for your package before you do this. You will know you are by checking your terminal and above your device name there will be `(venv)` or whatever is the name of your virtual environment.

```
(.venv)
Bravo@LAPTOP-SFSUNP5A MINGW64 ~/Programming/Notes/Python/pythonDeepComments/flask
```

Knowing this, you are free to install the requirements with pip in the terminal

```
pip install -r requirements.txt
```

This is all we need to start working with Flask. If you do not want to use the requirments.txt or you haven't pulled from this repo that's perfectly fine too! In that case, you will need to name the package with `pip` directly like so

```
pip install flask
```

# Notes
While the code here will go into more depth than required in some parts, it's key to be comfortable with the underlying ideas of **HTML**, **HTTP**, **REST** and **JSON**. You may not have covered these topics yet and that's fine, you don't need it for **Flask** but as a web developer these are essential to understand and the sooner you do, the easier all of this will become as these ideas are built on over and over.

Some of the examples will also greatly aid with the use of **Postman**, if you have not installed it yet or have not used it at all then this is a great time to get familiar with it. A link to the site is [here](https://www.postman.com/). Instead of using a browser, try using **Flask** alongside with **Postman** to hit two birds with one stone. 

Here are some resources to help get a better understanding of them:

### [HTML](https://www.w3schools.com/html/html_intro.asp)

### [HTTP](https://www.techtarget.com/whatis/definition/HTTP-Hypertext-Transfer-Protocolhttps://www.tutorialspoint.com/http/http_overview.htm)

### [REST](https://www.infoq.com/articles/rest-introduction/)

> REST has a **LOT** of different guides, don't just use one resource like the above, keep reading up on it until it clicks!

### [POSTMAN](https://www.postman.com/)

> This is a link to the website, if you want examples then a link is posted above but if you are too lazy to look up then here you [go](https://www.youtube.com/watch?v=oHg5SJYRHA0)

### [JSON](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Objects/JSON)
