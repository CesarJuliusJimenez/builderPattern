## Problem Scenario
Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

```
public User(String firstName, String lastName, String email,
          String address, String phone, int age) {
    // ...
}
```
However, you encounter challenges:

<li>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
<li>Optional fields: Not all customers provide complete information, but the constructor forces them to.
<li>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields. </li>
<br>
Implement solution using the Builder Pattern to address the issue.

## Class Diagram
![Assigment 1 (9)](https://github.com/CesarJuliusJimenez/builderPattern/assets/116608904/fd47254c-ecc8-4ac3-9113-8e238b821a83)
