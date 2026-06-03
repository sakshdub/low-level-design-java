# Singleton Design Pattern

## Definition

Singleton is a creational design pattern that ensures only one object of a class is created and the same object is shared throughout the application.

---

## Problem

Without Singleton, multiple objects of the same class can be created.

```java
Logger logger1 = new Logger();
Logger logger2 = new Logger();
Logger logger3 = new Logger();
```

This may lead to unnecessary object creation and resource usage.

---

## Solution

Singleton restricts object creation by:

- Making the constructor private
- Creating a static instance
- Providing a public static getInstance() method

---

## UML

```text
+----------------------+
|        Logger        |
+----------------------+
| - instance : Logger  |
+----------------------+
| - Logger()           |
| + getInstance()      |
+----------------------+
```

---

## Real World Example

A Logger is commonly implemented as a Singleton because the entire application can share a single logger instance instead of creating multiple logger objects.

---

## Advantages

- Only one object is created
- Shared access across the application
- Saves resources
- Maintains consistency

---

## Disadvantages

- Global state
- Difficult to test in some scenarios
- Can become an anti-pattern if overused

---

## Key Takeaway

Singleton Pattern = One Shared Object

Examples:
- Logger
- Configuration Manager
- Database Connection Manager