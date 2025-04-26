Java Method Reference Example
This project demonstrates how to use method references in Java, which is a feature introduced in Java 8. Method references allow you to refer to methods directly without executing them.

This example uses a simple list of names, and demonstrates how to print the list elements using a method reference instead of a traditional loop.

Technologies Used
Java 8 or later

No external libraries required

How It Works
Create a list of names.

Add names to the list manually.

Use a method reference to print each name in the list.

The forEach() method is used to iterate over the list, and the System.out::println method reference is used to print each name.

Key Method:
forEach(): This method is part of the Stream API and applies a given operation (like printing) on each element of the list.

System.out::println: A method reference to the println() method of System.out, which prints the element to the console.

Key Concepts
Lambda Expressions: A concise way to represent anonymous functions (methods without names) that can be passed around.

Method References: A shorter, more readable way to refer to methods, instead of using lambdas.

forEach(): A method introduced in Java 8 that performs an action for each element in a collection.

System.out::println: A method reference to System.out.println(), used here to print each element.

Requirements
Java JDK 8 or above installed.

