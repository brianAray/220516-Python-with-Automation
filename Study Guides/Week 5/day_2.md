# Week 5 - Day 2 - Java
A study guide to help you know what to research and where to find information for the topics this week. This should not be treated as your only source of information but as a jump off point to create your own research documents. Collaborate with your team and your batch mates to get a wide range of topics covered quickly. The training course is fast so make sure you take your time to understand the underlying knowledge with the technologies you will see during training.

<br>

---
# Pillars of OOP
- https://richardeng.medium.com/a-simple-explanation-of-oop-46a156581214
- https://backend.turing.edu/module1/lessons/four_pillars_of_oop
- https://info.keylimeinteractive.com/the-four-pillars-of-object-oriented-programming
- https://stackify.com/oops-concepts-in-java/
- https://howtodoinjava.com/java/oops/object-oriented-programming/
## Questions
- What is OOP?
- What are the pillars of OOP?
- How is Inheritance implemented in Java?
- How is Encapsulation implemented in Java?
- How is Abstraction implemented in Java?
- How is Polymorphism implemented in Java?
- What is the difference between method overloading and overriding?

---
# Java (continued)

## Access and Non-access Modifiers
- https://www.geeksforgeeks.org/access-and-non-access-modifiers-in-java/
- https://www.javatpoint.com/access-modifiers
- https://www.tutorialspoint.com/java/java_nonaccess_modifiers.htm
- https://dzone.com/articles/access-and-non-access-modifiers-in-java

### Questions
- What is a modifier in Java?
- What are 4 access modifiers in Java?
- What makes default unique to the other access modifiers?
- What is the difference between the private and protected access modifier?
- What are 3 non-access modifiers?
- What does the `static` modifier mean?
- Do you need to instantiate an object to use a `static` variable?
- When should you use `static`?
- What is the `final` modifier used for?
- What happens when you make a variable, method, or class `final`? What is the difference between them?
- Can you make a `static` variable `final`?

---
## Arrays, Var-args, for-each loops
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
- https://www.w3schools.com/java/java_arrays.asp
- https://www.baeldung.com/java-varargs
- https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
- https://www.geeksforgeeks.org/for-each-loop-in-java/
- https://www.programiz.com/java-programming/enhanced-for-loop

### Questions
- What is an array?
- How do you create an array in Java?
- Can you have different data types in an array?
- How do you access an element in an array?
- How do you get the length of an array?
- How do you add an element to an array?
- What is the notation for a `varargs` parameter?
- Why is `varargs` useful?
- Can you have multiple `varargs`?
- Where does a `vararg` need to be when placed as a parameter?
- What is the difference between a `for` and `for-each` loop?
- What is the syntax for declaring a `for-each` loop?

---
## String API
- https://docs.oracle.com/javase/tutorial/java/data/strings.html
- https://www.javatpoint.com/java-string
- https://winterbe.com/posts/2015/03/25/java8-examples-string-number-math-files/
- https://www.w3schools.com/java/java_strings.asp
### Questions
- Is a String a primitive or an object?
- What are the two ways to make a String, and which is recommended?
- What is the String pool?
- Why is the String pool useful?
- Where is the String pool in memory?
- Why shouldn't you use the `new` keyword when making a String?

---
## Interfaces
- https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
- https://www.baeldung.com/java-interfaces
- https://www.geeksforgeeks.org/interfaces-in-java/
- https://www.w3schools.com/java/java_interface.asp

### Questions
- What is an interface an example of in terms of OOP?
- What should an interface be used for?
- How do you connect a class to an interface?
- Can you create an object using an interface?
- Does an interface method have a body?
- What modifiers are applied by default to an interface method?
- Can interfaces have attributes?
- Can interfaces have constructors?
- Why should you use an interface?
- Can a class have multiple interfaces?

---
## Abstract Classes
- https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
- https://www.geeksforgeeks.org/abstract-classes-in-java/
- https://www.javatpoint.com/abstract-class-in-java

### Questions
- What does making a class abstract prevent you from doing?
- What should you use abstract classes for?
- How do you make a class abstract?
- Can it have non-abstract methods?
- Can it have constructors?
- Can it have static methods?
- Can you make an abstract class final? 
  - Why would this be an odd thing to do?
- How does a class use an abstract class?
  - What is the syntax?

---
## Exception Hierarchy
- https://rollbar.com/blog/java-exceptions-hierarchy-explained/
- https://www.geeksforgeeks.org/exceptions-in-java/
- https://programmers.io/java-exceptions-hierarchy-handling-and-throwing-exceptions/

### Questions
- What is the difference between an Error and an Exception in Java?
- What interface does Errors and Exceptions inherit?
- What happens if an exception or error occurs in a Java program?

---
## Checked vs Unchecked Exceptions
- https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/?ref=lbp
- https://howtodoinjava.com/java/exception-handling/checked-vs-unchecked-exceptions-in-java/
- https://www.baeldung.com/java-checked-unchecked-exceptions

### Questions
- What is a Checked and Unchecked exception, and their differences?
- Which type of exception do you have to handle?
- Typically, why is an exeption Checked or Unchecked?

---
## Exception Handling and Declarations
- https://stackify.com/specify-handle-exceptions-java/
- https://www.w3schools.com/java/java_try_catch.asp
- https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html
- https://rollbar.com/blog/how-to-use-the-throws-keyword-in-java-and-when-to-use-throw/

### Questions
- What is the difference between `throw` and `throws` for exceptions?
- When should you use `throw` or `throws`?
- How do you declare a method will throw an exception?
- How do you throw an exception?
- What is a `try... catch`?
- How do you catch an exception?
- Should you catch all exceptions?
- Can a method throw multiple exceptions?
- Can you catch multiple exceptions?
- When should you use a `try... catch` block?

---
## Multi-catch Blocks
- https://www.javatpoint.com/multiple-catch-block-in-java
- https://www.geeksforgeeks.org/multicatch-in-java/

### Questions
- What is a multi-catch block?
- Should you use `catch(Exception e)` when declaring a multi-catch block?
- Why would you want to use a multi-catch block instead of just catching all exceptions in one catch?

---
## Custom Exceptions
- https://www.baeldung.com/java-new-custom-exception
- https://stackify.com/java-custom-exceptions/
- https://www.javatpoint.com/custom-exception

### Questions
- What is the syntax for creating a custom exception?
- Why would you want to create a custom exception?
- What classes can you extend when making a custom exception?
  - How does it change the behavior of the exception?

---
<br>
