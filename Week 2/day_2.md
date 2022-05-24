# Week 2 - Day 2 - REST / SQL
A study guide to help you know what to research and where to find information for the topics this week. This should not be treated as your only source of information but as a jump off point to create your own research documents. Collaborate with your team and your batch mates to get a wide range of topics covered quickly. The training course is fast so make sure you take your time to understand the underlying knowledge with the technologies you will see during training.

<br>

---
# Useful Tools

### [EC2](https://jsonview.com/) and [AWS Free](https://jsonview.com/) 

Hosting applications no longer is not done on a local machine that communicates directly to a user. We will cover this at a later time too, but I recommend getting more comfortable with it now. Amazon EC2, a way to host a server on a remote system. Make sure that if you do decide to try it out early that you use a free tier system, there are guides online but I will link it just in case.

<br>

---
# Flask Handlers

## HTTP Handlers
- https://flask.palletsprojects.com/en/1.1.x/reqcontext/
- https://www.bogotobogo.com/python/python-REST-API-Http-Requests-for-Humans-with-Flask.php

### Questions
- How do you specify methods in a route?
- How do you handle requests in Flask?
- How would you get the body of a request as a JSON?
- What method should handle creating new data?

---
## Error / Exception Mapping
- https://flask.palletsprojects.com/en/1.1.x/errorhandling/
- https://flask.palletsprojects.com/en/1.1.x/blueprints/#error-handlers
- https://flask.palletsprojects.com/en/1.1.x/patterns/errorpages/#errorpages
- https://blog.miguelgrinberg.com/post/the-flask-mega-tutorial-part-vii-error-handling
- https://opensource.com/article/17/3/python-flask-exceptions

### Questions
- What function do you use to handle errors?
- What is the generic exceptions for HTTP?
- How would you handle a specific error code?
- How do you return your own error html page?
- How do you handle multiple errors with the same function?

<br>

---

# REST
- https://restfulapi.net/
- https://en.wikipedia.org/wiki/Representational_state_transfer
- https://www.redhat.com/en/topics/api/what-is-a-rest-api

---
## Resource Identifiers
- https://restfulapi.net/resource-naming/
- https://www.tutorialspoint.com/restful/restful_addressing.htm

### Questions
- What is a resource and could be some examples of a resource in REST?
- What is a Resource Identifier?
- What is a URL?
- What is a URI?
- What are some rules behind creating a RESTful URL?
- How do you specify a "singleton" resource?
- What is the syntax for query parameters in a URI?

---
## Verbs
- https://hub.packtpub.com/what-are-rest-verbs-and-status-codes-tutorial/
- https://www.mscharhag.com/api-design/http-idempotent-safe
- https://www.restapitutorial.com/lessons/idempotency.html

### Questions
- What methods are needed for a RESTful API?
- What is Idempotency?
- What is safety for a REST Verb?
- Is DELETE idempotent?
- Is POST safe?

---
## Constraints
- https://restfulapi.net/rest-architectural-constraints/
- https://www.geeksforgeeks.org/rest-api-architectural-constraints/
- https://www.techtarget.com/searchapparchitecture/tip/The-6-non-negotiable-REST-architecture-constraints
  
### Questions
- What are the 6 essential constraints of REST?
- How do you create a Uniform Interface?
- What is a Statelesss server?
- How does cacheable messages improve network efficiency?
  
<br>

---