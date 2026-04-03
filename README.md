# OOP2_PROJECT
Smart Restaurant Management System
Overview

This project is a Smart Restaurant Management System developed in Java as part of an Object-Oriented Programming (OOP2) assignment. The application simulates basic restaurant operations such as managing menu items, customers, and orders.

The primary objective of this project is to demonstrate modern Java programming features rather than to build a full production system.

Features

The system supports the following functionalities:

Add and view menu items
Create customers
Place dine-in and takeaway orders
View all orders
Filter vegetarian items
Sort menu by price
Find the most expensive item
Group orders by customer
Process orders concurrently
Save and load data from files
Java Concepts Demonstrated
Core Features
Streams API (filter, map, sorted, limit, distinct)
Terminal operations (count, findFirst, findAny, max, allMatch, anyMatch, noneMatch)
Collectors (groupingBy, partitioningBy, toMap)
Lambda expressions (Predicate, Function, Consumer)
Comparator for sorting
Switch expressions
Date and Time API (LocalDateTime)
Advanced Features
Concurrency using ExecutorService and Callable
File handling using NIO2 (Files API)
Localisation using Locale and NumberFormat
Modern Java Features
Records (MenuItem, Customer)
Sealed interfaces (Order hierarchy)
Instance-based main method (Java 25 feature)
Project Structure
MenuItem – represents menu items
Customer – represents customers
Order – sealed interface
DineInOrder / TakeawayOrder – implementations of Order
RestaurantService – contains core business logic
FileManager – handles file operations
How to Run
Clone the repository
Open the project in an IDE (e.g., IntelliJ or Eclipse)
Compile and run the main class
Purpose

This project demonstrates the application of object-oriented and functional programming concepts in Java. It focuses on clarity and understanding of language features rather than complexity.

Limitations
Console-based application
No database integration
Basic error handling
Author

Swathy Krishna Gopalakrishnan Nair
Student ID: A00336933

Note

This project is developed for academic purposes as part of an OOP2 module.
