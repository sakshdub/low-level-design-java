# Composite Design Pattern (Java)

This project demonstrates the **Composite Design Pattern**, a structural design pattern that allows you to treat individual objects and groups of objects uniformly by organizing them into a tree structure.

---

## Problem

In many applications, objects naturally form a **part-whole hierarchy**. Managing individual objects and groups separately leads to duplicated logic and complex client code.

For example, in a restaurant menu, a menu can contain both **Menu Items** and other **Menu Sections**. Without a common abstraction, the client must handle each type differently.

---

## Solution

The **Composite** pattern introduces a common component interface that is implemented by both individual objects (**Leaf**) and groups of objects (**Composite**).

As a result, the client can interact with both using the same interface.

---

## Project Structure

```text
Composite/
│── Client.java
│── MenuComponent.java
│── MenuItem.java
│── MenuSection.java
└── README.md
```

---

## Components

### Component

Defines the common interface shared by all objects.

Example:

* `MenuComponent`

### Leaf

Represents individual objects that cannot contain other objects.

Example:

* `MenuItem`

### Composite

Represents groups of objects and can contain both Leaf and Composite objects.

Example:

* `MenuSection`

### Client

Interacts with all objects through the common Component interface without worrying about whether it is dealing with a single object or a group.

---

## Benefits

* Treats individual objects and groups uniformly.
* Simplifies client code.
* Supports recursive tree structures.
* Makes it easy to add new component types.
* Follows the Open/Closed Principle.

---

## Real-World Examples

* Restaurant menu and menu sections
* File system (Files and Folders)
* Company organizational hierarchy
* HTML/XML Document Object Model (DOM)
* UI components (Panels containing Buttons, TextFields, etc.)

---

## When to Use

Use the Composite pattern when:

* Objects form a tree or hierarchy.
* Clients should treat individual objects and groups in the same way.
* You want to simplify operations on recursive structures.

---

## Pattern Type

**Structural Design Pattern**

---

## Pattern Structure

```text
          Component
          /       \
      Leaf      Composite
                    |
          -----------------
          |       |       |
       Leaf   Composite  Leaf
```

---

## Advantages

* Simplifies client code.
* Makes recursive structures easy to manage.
* Promotes code reuse.
* Easy to extend with new component types.

---

## Disadvantages

* Can make the design more general than necessary.
* Some operations may not be meaningful for every component type.

---

## Author

**Saksham Dubey**
