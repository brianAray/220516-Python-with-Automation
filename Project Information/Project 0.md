# Project 0 - Foundation

## Due Date
Start: May 20th 2022 
End: May 31st 2022

## Description
Your job is to create an webservice that allows the following:
- Users can join the service on a website
- Users can create multiple accounts
- Users can input a request to your service
  - (Optional) Allow multiple versions of services
- Users can view their previous requests
- Users can close their accounts

### Examples of Services
- Banking
- Shopping
- Travel

## Purpose
- More experience with automation, websites, and database interaction
- Testing experience and ensuring a working product
- Presenting your product to someone who hasn't worked on it

## Requirements
1. Create user stories for each feature you are to implement
2. Your application is interacted with using a website and Flask as the server
3. Data should be stored in a database
4. Unit tests must exist and cover all methods you have made
5. Your server is tested using Postman
6. All requests to the application and their results should be logged in a central file.

## Business Rules
- Accounts must be uniquely identified
- Users must access their account using a unique username and password
- Users must be uniquely identified
- The automation service should provide some form of end result

## Testing Requirements
- All service methods must have:
    - One positive test
    - Multiple negative tests
- All API methods must have:
    - a Happy path test using Postman
    - Alternate Path tests using Postman