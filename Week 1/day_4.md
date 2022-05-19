# Week 1 - Day 4 - Python / Flask
A study guide to help you know what to research and where to find information for the topics this week. This should not be treated as your only source of information but as a jump off point to create your own research documents. Collaborate with your team and your batch mates to get a wide range of topics covered quickly. The training course is fast so make sure you take your time to understand the underlying knowledge with the technologies you will see during training.

<br>

# Useful Tools

### [pytest, tox, and GitHub Actions](https://www.youtube.com/watch?v=DhUpxWjOhME)

This guide goes over the whole process of setting up a project in Python for production alongside automated testing. While it is not needed right now, being aware of how you should structure your project now and getting used it it will save you days of refactoring!

<br>


---
# Modules
- https://docs.python.org/3/tutorial/modules.html
- https://www.w3schools.com/python/python_modules.asp
- https://www.programiz.com/python-programming/modules
- https://www.geeksforgeeks.org/python-modules/

---
## `import`
- https://docs.python.org/3.9/reference/import.html
- https://www.geeksforgeeks.org/import-module-python/
- https://www.w3schools.com/python/gloss_python_module_import_from.asp

### Questions
- What is the `import` statement?
  - What does it do in Python?
  - Where should it be placed?
- What does the `from import` statement do?
  - Where is it used?
  - What does the `from import *` statement do?
  - Should you do `from import *`?
- How can you locate modules?
- How do you rename modules?
- What is the namespace of a module?
- What do you do if you have modules with the same name?
- What do you do if you have different modules but same class name?

<br>

---
# PyPi & Pip

## PyPi
- https://pypi.org/
- https://en.wikipedia.org/wiki/Python_Package_Index
  
### Questions
- What is PyPi?
- What is it used for?
- What is its alternate name?
- What package manager uses it by default?
- How do you use PyPi?
- How do you upload packages to PyPi?
- How do you download packages or dependencies to your project?

---
## pip
- https://en.wikipedia.org/wiki/Pip_(package_manager) 
- https://pypi.org/project/pip/
  
### Questions
- What is pip?
- How do you install pip?
- How do you install packages with pip?
- How do you uninstall packages with pip?
- How do you get a list of all your packages?
- What is a requirements.txt file?
- How do you use a requirements.txt file with pip?

<br>

---
# Unit Testing (pytest)
- https://quintagroup.com/cms/python/python-unit-testing
- https://www.geeksforgeeks.org/unit-testing-python-unittest/
- https://en.wikipedia.org/wiki/Unit_testing
- https://www.guru99.com/unit-testing-guide.html
  
---
## pytest
- https://docs.pytest.org/en/7.1.x/contents.html
- https://www.guru99.com/pytest-tutorial.html
- https://www.tutorialspoint.com/what-is-pytest-and-what-are-its-advantages
- https://www.softwaretestinghelp.com/pytest-tutorial/

### Questions
- What is pytest?
- Why use pytest over unittest?
- How do you get to use pytest with your project?
- What are the different ways you can name a test file?
- What are 3 ways you can run a test?
- What is an assert?
- Why do we use an assert?
- What is the syntax for using an assert?
- What is the syntax for writing a unit test function?
- What is parametrization?
- Why do we use parametrization?

---
## Fixtures
- https://docs.pytest.org/en/latest/explanation/fixtures.html
- https://www.tutorialspoint.com/pytest/pytest_fixtures.htm
- https://www.lambdatest.com/blog/end-to-end-tutorial-for-pytest-fixtures-with-examples/
- https://towardsdatascience.com/make-your-python-tests-efficient-with-pytest-fixtures-3d7a1892265f

### Questions
- What are fixtures?
- Why even use a pytest fixture?
- How do you use a pytest fixture?
- Where do you add a pytest fixture in your project?
- When would you avoid using a fixture?

## Questions
- What is unit testing?
- What is TDD?
- Why do we unit test?
- Should you unit test?
- What are the advantages of unit tests?
- What are the disadvantages of unit tests?
- What testing framework comes with Python?


---
## Some helpful commands for pytest
### Stop the Testing Process

- `pytest -x` tells it to stop after the first failure
- `pytest -maxfail = 2` will make it stop after two failures, this can be whatever you want

### Run Specific Tests

- Run all tests in a module
    - `pytest test_module.py`
- Run all test in a directory
    - `pytest directory_name/`
- Run a specific test from a file
    - `pytest test_file.py::test_func_name`

The `pytest` documentation is helpful, and if you are confused or what more details then it is  your friend

<br>

---
# Virtual Environment
- https://docs.python.org/3/tutorial/venv.html
- https://realpython.com/python-virtual-environments-a-primer/
- https://docs.python-guide.org/dev/virtualenvs/
- https://www.dataquest.io/blog/a-complete-guide-to-python-virtual-environments/

## Questions
- What is a virtual environment?
- What is `virtualenv`?
- Why would you use a virtual environment?
- Are there alternatives to a virtual environment?
- How do you create a Python virtual environment?
- How do you activate a virtual environment?
- How do you deactivate a virtual environment?
- How do you delete a virtual environment?
- Should you make a virtual environment for each Python project you make?

<br>

---