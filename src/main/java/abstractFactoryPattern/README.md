# Abstract Factory Design Pattern (Java)

This project demonstrates the **Abstract Factory Design Pattern**, a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## Problem

When an application needs to create multiple related objects, directly instantiating concrete classes makes the code tightly coupled and difficult to maintain.

For example, a GUI application may need to create **Windows** or **Mac** components such as Buttons and Checkboxes. The client should not need to know which concrete classes are being created.

---

## Solution

The **Abstract Factory** pattern introduces a factory interface responsible for creating a family of related objects.

The client works only with abstract interfaces, while concrete factories create the appropriate product family.

---

## Project Structure

```text
AbstractFactory/
│── Client.java
│── GUIFactory.java
│── WindowsFactory.java
│── MacFactory.java
│── Button.java
│── WindowsButton.java
│── MacButton.java
│── Checkbox.java
│── WindowsCheckbox.java
│── MacCheckbox.java
└── README.md
```

---

## Components

### Abstract Factory

Declares methods for creating a family of related products.

### Concrete Factories

Implement the Abstract Factory and create specific product families.

Examples:

* WindowsFactory
* MacFactory

### Abstract Products

Define the interfaces for product types.

Examples:

* Button
* Checkbox

### Concrete Products

Implement the abstract product interfaces.

Examples:

* WindowsButton
* MacButton
* WindowsCheckbox
* MacCheckbox

### Client

Uses only abstract factories and abstract products, making it independent of concrete implementations.

---

## Benefits

* Creates families of related objects consistently.
* Reduces coupling between client and concrete classes.
* Makes it easy to switch between product families.
* Supports the Open/Closed Principle.
* Improves maintainability and scalability.

---

## Real-World Examples

* Cross-platform UI toolkits (Windows, macOS, Linux)
* Database drivers (MySQL, PostgreSQL, Oracle)
* Vehicle manufacturing (Luxury and Economy models)
* Theme systems (Light Theme and Dark Theme)

---

## When to Use

Use the Abstract Factory pattern when:

* You need to create families of related objects.
* Objects should always be used together.
* The client should remain independent of concrete implementations.
* You want to easily switch between different product families.

---

## Pattern Type

**Creational Design Pattern**

---

## Difference Between Factory Method and Abstract Factory

| Factory Method            | Abstract Factory                                       |
| ------------------------- | ------------------------------------------------------ |
| Creates a single product. | Creates a family of related products.                  |
| Uses inheritance.         | Uses composition with multiple factory methods.        |
| Simpler to implement.     | Better for creating multiple related objects together. |

---

## Author

**Saksham Dubey**
