# 🚌 Bus Reservation System

A console-based Bus Reservation System developed using **Java, JDBC, and MySQL**. This project allows users to view available buses, check seat availability, and book tickets through a simple command-line interface.

## 🚀 Features

* Display available buses
* Check seat availability
* Book bus tickets
* Store booking details in MySQL database
* Retrieve booking information using JDBC
* Prevent overbooking based on bus capacity

## 🛠️ Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL
* Eclipse IDE

## 📂 Project Structure

```text
src/
└── busreservation/
    ├── Booking.java
    ├── BookingDAO.java
    ├── Bus.java
    ├── BusDAO.java
    ├── BusDemo.java
    └── DbConnection.java
```

## 🗄️ Database Schema

### Bus Table

| Column   | Type    |
| -------- | ------- |
| id       | INT     |
| ac       | BOOLEAN |
| capacity | INT     |

### Booking Table

| Column         | Type        |
| -------------- | ----------- |
| passenger_name | VARCHAR(50) |
| bus_no         | INT         |
| travel_date    | DATE        |

## ⚙️ Setup Instructions

### 1. Create Database

```sql
CREATE DATABASE busresv;
USE busresv;
```

### 2. Create Bus Table

```sql
CREATE TABLE bus(
    id INT PRIMARY KEY,
    ac BOOLEAN,
    capacity INT
);
```

### 3. Insert Sample Data

```sql
INSERT INTO bus VALUES(1,1,2);
INSERT INTO bus VALUES(2,1,48);
INSERT INTO bus VALUES(3,0,52);
```

### 4. Create Booking Table

```sql
CREATE TABLE booking(
    passenger_name VARCHAR(50),
    bus_no INT,
    travel_date DATE
);
```

### 5. Configure Database Connection

Update the database credentials in `DbConnection.java`:

```java
private static final String url = "jdbc:mysql://localhost:3306/busresv";
private static final String user = "root";
private static final String password = "your_password";
```

### 6. Run the Application

Run:

```text
BusDemo.java
```

## 📸 Sample Output

```text
Bus Id is: 1
AC : yes
Capacity is: 2

Enter 1 to Book and 2 to exit
1

Enter name of passenger:
ABC

Enter bus no:
2

Enter date dd-mm-yyyy
04-06-2026

Your booking is confirmed
```

## 🎯 Learning Outcomes

* JDBC Connectivity
* PreparedStatement
* ResultSet Handling
* Database Design
* Object-Oriented Programming (OOP)
* Exception Handling
* Java Collections and Date Handling

## 👨‍💻 Author

**Lohesh Shankar**

MCA Student | Java Developer Enthusiast | Learning DSA, Java, JDBC, and Full Stack Development
