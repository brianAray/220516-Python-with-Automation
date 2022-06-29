# Testing 

Every application should be thoroughly tested before it is sent to a production environment. There are 4 major types of testing that are traditionally conducted: 

- UAT (User Acceptance Testing) 

- System Testing 

- Integration Testing 

- Unit Testing 

  Together, these types of testing make up what is known as the testing pyramid, where UAT is the least abundant and unit testing is the most abundant. 

## Unit Testing: 

- The most micro level of testing 
- Test each component, standalone, without its dependencies (e.g. OJDBC, etc.) 
- Usually requires mocking 
- Mocking entails intercepting a method in order to return stubs/mock data instead of hitting your database, another layer of your application, etc. 
- E.g. Mockito, Spring MVC Test Framework 

## Integration Testing:

- Testing components with their dependencies 
- Ensuring that components work with each other correctly 

## System Testing:

- Test the application’s flow as a whole 
- Ensure that the entire application flows without error 

## User Acceptance Testing:

- Testing that all requirements/user stories are met 
- Simulates an end user to guarantee that users can actually do all of the tasks they’re supposed to be able to do 
- Has two forms: 
    - Alpha Testing: testing done in-house simulating an end user 
    - Beta Testing: testing done out-of-house, usually by actual end users 

# Testing Strategies 

- Positive Testing: Test that the feature behaves correctly when used correctly. This is also called “happy path” testing.
- Negative Testing: Test that the feature behaves in a correct manner in response to incorrect use.
- Alternate Path Testing: Test that the feature behaves correctly when the user takes an alternate path (e.g. hitting the ENTER key versus clicking a button) 

## Functional vs Nonfunctional Testing

- Functional Testing: Any test that validates the actions that your application must perform 
- Non-Functional Testing: Test the app’s metrics and vulnerabilities. Examples include: 
    - Security testing such as penetration testing 
    - Performance testing such as load testing (how does the app behave under certain loads of connections, etc.) 
    - Stress testing (how the does app behave with near maximum loads, or even beyond maximum loads?) 
    - Spike testing (how does the app behave under a certain leap of user count?) 
    - Ramp up testing (how does the app perform with a gradual increase of users?) 
    - Ramp down testing (how does the app perform with a gradual decrease of users?) 
    - Usability testing (Can my app even be used by users? For example, a website can be functional, but is it really usable if I have white text on a white background? Methinks not.) 

## More on Functional Testing: Strategies 

- Exploratory Testing: Entails assuming requirements and validations off of current behavior of the application.
- Exhaustive Testing: Entails testing every possible permutation of your application (e.g. every possible route the end user could take, from button clicks to options to different combinations of selected options); it’s not feasible to pay for this type of testing. 
- Boundary Testing: Entails testing edge cases/extreme ends. For example, when testing some method that deals with numbers, perhaps you’d check that the application works correctly when the minimum and maximum values were entered, as well as testing that numbers below the minimum value and above the maximum value don’t break your application. 
- Equivalency Partitioning: Entails dividing up the test values in some equivalent manner (so perhaps you’d testing every 25 numbers or so when testing a method that deals with numeric calculations). This is more practical than testing every single number ever (an impossibility in most cases) .
- Manual Testing: You test and track results through direct use of the application.
- Smoke Testing: A wide approach where all areas of the software application are tested without getting in too deep.
- Regression Testing: Entails running old test suites to ensure that newly added functionality did not break old functionality. 
- Sanity Testing: Narrow regression testing with a deep focus on one or more small set of areas of functionality.
- Blackbox Testing: Entails writing tests that do not require the actual code of the application to be written 
- Whitebox Testing: Entails writing tests that are based around the actual source code of the application. Usually aims for code coverage as a goal.
