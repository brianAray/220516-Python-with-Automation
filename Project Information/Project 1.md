# Project 1

## Due Date
6 / 20 / 2022
## Description
As an assigned pair (or trio), you are tasked with creating an expense reimbursement system for a small company/group. This program will allow employees to create reimbursement requests for their business expenditures, while also providing a way to track the amount of money they have spent.

## Purpose
- Increase your development experience
- Improve your Automation ability
- Improve your overall Testing ability

### Key Features
- Employees must be able to:
    - Login to their account with a unique username and a password
    - Submit reimbursement requests with a description and a dollar amount 
        - (Optional) Have categories for your requests
    - See ongoing and previous requests
    - Cancel ongoing requests
        - (Optional) Update ongoing requests

- Managers must be able to:
    - Have the same options as an employee
    - Approve / decline reimbursement requests
        - (Optional) provide a reason why

### Business Rules
- Employees reimburesment requests must be between $1 and $1000 per request
- Employee reimburesment request comments must be no longer than 100 characters
- Employee reimbursement requests must be in numeric form

### Requirements
- Follow Behavior Driver Development and Test Driven Development practices
- You must produce and utilize the following documentation:
    - Test Strategy
    - Test Plan
    - Test Suite / Case
    - Test Results
    - Requirement Traceability Matrix
    - User Stories
    - Acceptance Criteria
- User stories in a Kanban Board must be used
    - Functionality should reflect your user stories.
- Your data should be stored in a Postgres database
- Implement logging for your application that can be accessed and viewed

### Testing Requirements
- All Database interaction methods must meet the following testing requirements:
    - Unit tests for methods that can be unit tested
- All Service methods must meet the following testing requirements:
    - Mocking and stubbing should be included in your testing
    - Methods must have one positive test
    - Business logic must have negative tests
    - All service method tests must be unit tests
- All API methods must meet the following testing requirements:
    - One positive test for each method in Postman
    - Each type of failure for a method must have a negative test in Postman
    - Happy path test using Postman
    - Alternate path test using Postman

- Your application should meet the following integration test requirements:
    - User story functions must have an End to End (E2E) test
    - Features must have a feature file
      - Feature files must have tests using Behave
- You must also have a consistently updated test report with:
    - Defect report
        - Bugs present in the application
            - What is their priority?
            - What is their severity?
    - Test Results
        - Pytest results
        - Postman results
        - Behave results

### Key Notes
- The priority is to make sure the requirements are reached
- A Testing report is required to finish the project
- Everything else is optional, if you have time here are some features you can include
  - Host website on an S3 bucket
  - Python running on EC2 instance
  - Encrypt passwords in the database
