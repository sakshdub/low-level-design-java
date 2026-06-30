# Decorator Design Pattern (Java)

## Overview

This project demonstrates the **Decorator Design Pattern**, a **Structural Design Pattern** that allows behavior or responsibilities to be added to an object dynamically without modifying its original class.

**Definition:**

> The Decorator pattern wraps an existing object inside another object (decorator) to extend its functionality while keeping the same interface.

---

## Problem

Sometimes we need to add new features to an object at runtime. Using inheritance for every possible combination of features leads to a large number of subclasses and makes the code difficult to maintain.

For example, in a coffee ordering system, creating separate classes for every coffee customization (MilkCoffee, SugarCoffee, MilkSugarCoffee, etc.) results in class explosion.

---

## Solution

The **Decorator** pattern solves this problem by wrapping the original object with one or more decorator objects. Each decorator adds its own behavior while preserving the original object's interface.

This allows responsibilities to be added dynamically without modifying existing code.

---

## Pattern Structure

```text
          Client
             |
             v
        Component
        /       \
Concrete      Decorator
Component         |
                  |
          ConcreteDecorator
```

---

## Components

| Component              | Responsibility                                                                       |
| ---------------------- | ------------------------------------------------------------------------------------ |
| **Component**          | Defines the common interface for objects and decorators.                             |
| **Concrete Component** | The original object whose behavior can be extended.                                  |
| **Decorator**          | Implements the Component interface and holds a reference to a Component.             |
| **Concrete Decorator** | Adds new behavior before or after delegating to the wrapped object.                  |
| **Client**             | Uses the Component interface and remains unaware of whether the object is decorated. |

---

## Project Structure

```text
Decorator/
│── Client.java
│── Component.java
│── ConcreteComponent.java
│── Decorator.java
│── ConcreteDecorator.java
└── README.md
```

---

## Implementation Flow

1. Create a Component interface.
2. Implement a Concrete Component.
3. Create an abstract Decorator that wraps a Component.
4. Create Concrete Decorators to add new behavior.
5. The client wraps the object with one or more decorators.

---

## Advantages

* ✅ Adds functionality dynamically.
* ✅ Avoids creating many subclasses.
* ✅ Follows the Open/Closed Principle.
* ✅ Flexible and reusable.
* ✅ Multiple decorators can be combined.

---

## Disadvantages

* ❌ Increases the number of classes.
* ❌ Multiple layers of decorators can make debugging more difficult.

---

## Real-World Examples

* Coffee customization (Milk, Sugar, Whipped Cream)
* Java I/O Streams (`BufferedInputStream`, `DataInputStream`)
* Logging wrappers
* Compression and encryption wrappers
* UI components with borders, scrollbars, or shadows

---

## When to Use

Use this pattern when:

* You need to add responsibilities dynamically.
* Inheritance would lead to too many subclasses.
* Features should be added or removed independently.

Avoid this pattern when:

* The behavior is fixed and never changes.
* A simple inheritance hierarchy is sufficient.

---

## Pattern Category

**Structural Design Pattern**

---

## Key Takeaways

* Decorators wrap existing objects instead of modifying them.
* Multiple decorators can be chained together.
* The client interacts with the object through the same interface.
* The pattern promotes composition over inheritance.

---

## Author

**Saksham Dubey**

---

⭐ If you found this project helpful, consider giving the repository a star.
****