
from flask import render_template


def get_homepage():
    return render_template("index.html")