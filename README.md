Advanced OOP Systems - Assignment 1
Author: Nkurunziza Salomon
ID: *75464*

Project Summary
This project consists of three object-oriented systems designed to demonstrate core OOP principles:

Stock Management System

Online Shopping System

Motor Vehicle Insurance System

Each system implements abstraction, encapsulation, inheritance, and polymorphism, with input validation, reporting, and user interaction via Scanner.
Advanced OOP Assignment 1 - Stock, Shopping, and Insurance Systems
Author: Nkurunziza Salomon
ID: 75464

System Descriptions
1. Advanced Stock Management System
Manages product inventory with specialized item types:

Electronics

Clothing

Groceries

Furniture

Perishable items

Key features:

Stock validation and updates

Inventory value calculations

Expiration tracking

Report generation

2. Advanced Online Shopping System
Simulates an e-commerce platform with:

Product listings

Shopping cart functionality

Order processing

Payment handling

Product categories:

Electronics

Clothing

Groceries

Books

Accessories

3. Advanced Motor Vehicle Insurance System
Manages vehicle insurance policies with:

Policy management

Claims processing

Premium calculations

Reporting

Policy types:

Comprehensive

Third Party

Collision

Liability

Roadside Assistance

Technical Implementation
Java programming language

Object-oriented design patterns

Abstract classes and concrete implementations

Encapsulation with validation

Scanner class for user input

Comprehensive reporting functionality

How to Run
Clone the repository

Compile the Java files: javac *.java

Run the main class for each system:

Stock System: java StockManagementSystem

Shopping System: java OnlineShoppingSystem

Insurance System: java InsuranceSystem

Validation Rules
Each system includes comprehensive validation for:

Stock quantities

Product details

Customer information

Payment processing

Policy requirements

Claim amounts

Report Generation
All systems generate detailed reports showing:

Inventory status

Sales performance

Policy coverage

Financial summaries

Notes
Developed as part of OOP coursework

Demonstrates mastery of object-oriented principles

Includes user interaction via Scanner class

Comprehensive input validation throughout

and also include docker image description
Advanced OOP Assignment 1 - Stock, Shopping, and Insurance Systems
Author: Nkurunziza Salomon
ID: 75464

Project Overview
This project implements three advanced object-oriented systems:

Advanced Stock Management System

Advanced Online Shopping System

Advanced Motor Vehicle Insurance System

Each system demonstrates key OOP concepts including abstraction, encapsulation, inheritance, and polymorphism.

Docker Implementation
Docker Image Description
The project is containerized using Docker for easy deployment and execution. The Docker image includes:

OpenJDK 17 as the base image

All compiled Java classes

Entry point scripts for each system

Necessary dependencies

Dockerfile
dockerfile
FROM openjdk:21-jdk-slim

# Create working directory
WORKDIR /app

# Copy source files
WORKDIR /app
COPY . /app

# Compile Java classes
RUN javac *.java

# Set entry points
COPY entrypoints/ ./entrypoints/
RUN chmod +x ./entrypoints/*.sh

# Set default command
CMD ["java","InsuranceSystemMain"]
CMD [ "java","StockManagementSystem" ]
CMD ["java","OnlineShopApp"]
Building the Docker Image
bash
docker build -t oop-assignment-1:1.0 .
Running the Systems
Option 1: Run all systems interactively
bash
docker run -it oop-assignment-1:1.0
Option 2: Run specific systems
bash
# Stock Management System
docker run -it oop-assignment-1:1.0 ./entrypoints/stock_system.sh

# Online Shopping System
docker run -it oop-assignment-1:1.0 ./entrypoints/shopping_system.sh

# Insurance System
docker run -it oop-assignment-1:1.0 ./entrypoints/insurance_system.sh
Docker Compose (Alternative)
yaml
version: '1.0'
services:
  oop-systems:
    image: oop-assignment-1:1.0
    container_name: oop-assignment
    stdin_open: true
    tty: true
    volumes:
      - ./reports:/app/reports
System Descriptions
1. Advanced Stock Management System
Features:

5 specialized product types

Inventory tracking

Expiration management

Automated reporting

2. Advanced Online Shopping System
Features:

Product catalog

Shopping cart

Payment processing

Order management

3. Advanced Motor Vehicle Insurance System
Features:

5 policy types

Premium calculations

Claims processing

Policy validation

Technical Implementation
Java 17

Object-oriented design patterns

Abstract classes and concrete implementations

Scanner class for user input

Comprehensive validation

Report generation

How to Run Without Docker
Clone the repository

Compile: javac -d bin src/*.java

Run systems:

java -cp bin StockManagementSystem

java -cp bin OnlineShoppingSystem

java -cp bin InsuranceSystem

Validation Rules
All systems include validation for:

Data integrity

Business rules

User input

Financial calculations

Report Generation
Systems generate reports in /reports directory with:

Timestamps

System summaries

Transaction details

Inventory/policy status

rewrite this readme in summary like two page and half
Advanced OOP Systems - Assignment 1
Author: Nkurunziza Salomon
ID: 26898

Project Summary
This project consists of three object-oriented systems designed to demonstrate core OOP principles:

Stock Management System

Online Shopping System

Motor Vehicle Insurance System

Each system implements abstraction, encapsulation, inheritance, and polymorphism, with input validation, reporting, and user interaction via Scanner.

1. Stock Management System
Key Features
Abstract Class: StockItem (base for all products)

Concrete Classes:

ElectronicsItem (warranty & discounts)

ClothingItem (size/color management)

GroceryItem (expiration tracking)

FurnitureItem (weight/shipping)

PerishableItem (shelf-life alerts)

Encapsulated Classes:

Product (validates name, quantity, brand)

Supplier (validates contact details)

Warehouse (tracks inventory locations)

Validations:

No negative stock

Unique product names

Price > 0

Discounts ≤ 50%

Reports:

Inventory status

Expired/near-expiry items

Discount/sales performance

2. Online Shopping System
Key Features
Abstract Class: ShoppingItem (base for store products)

Concrete Classes:

ElectronicsItem (warranty validation)

ClothingItem (size/stock checks)

GroceriesItem (bulk discounts)

BooksItem (ISBN/edition checks)

AccessoriesItem (reviews/ratings)

Encapsulated Classes:

Customer (validates personal details)

ShoppingCart (manages cart items)

Payment (validates payment methods)

Validations:

Cart quantity ≤ stock

Valid payment methods (Credit Card/PayPal)

Complete delivery address

Reports:

Sales revenue

Payment method breakdown

Order fulfillment status

3. Motor Vehicle Insurance System
Key Features
Abstract Class: InsurancePolicy (base for policies)

Concrete Classes:

ComprehensivePolicy (covers damage/theft)

ThirdPartyPolicy (liability-only)

CollisionPolicy (safe-driver discounts)

LiabilityPolicy (medical checkups)

RoadsideAssistancePolicy (towing/repairs)

Encapsulated Classes:

Vehicle (validates make/model/year)

Person (validates policyholder details)

Claim (ensures claim ≤ coverage limit)

Validations:

Claim amount ≤ policy coverage

Vehicle details updated on renewal

Policy approval checks

Reports:

Premiums collected

Claims processed

Coverage by policy type

Technical Implementation
Language: Java

OOP Concepts:

Abstract classes + inheritance

Encapsulation (private fields + getters/setters)

Polymorphism (method overriding)

Input Handling: Scanner for user interaction

Validation: Business rules enforced in methods

Reporting: Generated for each system

Docker Deployment
Image Details
Base Image: openjdk:17-jdk-slim

Includes:

Compiled Java classes

Entrypoint scripts for each system

Volumes: Reports saved to /app/reports

Commands
Build:

bash
docker build -t oop-systems:1.0 .
Run All Systems:

bash
docker run -it oop-systems:1.0
Run Specific System:

bash
docker run -it oop-systems:1.0 ./entrypoints/stock_system.sh
How to Run Without Docker
Compile:

bash
javac -d bin src/*.java
Execute:

Stock System:

bash
java -cp bin StockManagementSystem
Shopping System:

bash
java -cp bin OnlineShoppingSystem
Insurance System:

bash
java -cp bin InsuranceSystem
Conclusion
This project demonstrates modular OOP design with:
✔ Three independent systems
✔ Validation & error handling
✔ Interactive user input
✔ Automated reporting
✔ Dockerized deployment
