# Bank Management System

This project is a simple Bank Management System implemented in Java. It provides functionalities for account management including viewing balance, depositing money, withdrawing money, taking loans, and paying loans.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Class Structure](#class-structure)
  - [Account](#account)
  - [Loan](#loan)
  - [Menu](#menu)
  - [Main](#main)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [License](#license)

## Overview

The Bank Management System allows users to create an account, perform various banking operations such as depositing and withdrawing money, and manage loans. It is designed to be run as a console application.

## Features

- Create an account with an initial balance
- View account balance
- Deposit money into the account
- Withdraw money from the account
- Take a loan
- Pay off the loan
- Check loan status

## Class Structure

### Account

The `Account` class represents a user's bank account. It includes methods to deposit money, withdraw money, view balance, and set the initial balance.

### Loan

The `Loan` class manages loan-related operations such as taking a loan, paying a loan, and checking loan status.

### Menu

The `Menu` class provides a static method to display the main menu options to the user.

### Main

The `Main` class is the entry point of the application. It includes the main method which handles user input and interacts with the `Account` and `Loan` classes to perform various operations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine
- A Java IDE or a text editor with command-line capabilities

### Installation

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE or text editor.

## Usage

1. Compile the Java files using the following command:
    ```
    javac Main.java
    ```
2. Run the compiled `Main` class:
    ```
    java Main
    ```
3. Follow the on-screen instructions to interact with the Bank Management System.