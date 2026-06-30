# Adapter Design Pattern (Java)

This project demonstrates the **Adapter Design Pattern**, a structural design pattern that allows two incompatible interfaces to work together by introducing an adapter class.

---

## Problem

Sometimes we need to use an existing class, but its interface is incompatible with what the client expects. Modifying the existing class may not be possible because it could be part of a third-party library or legacy code.

### Example

A mobile charger expects a **USB-C** connector, but an older device only supports **Micro-USB**. Without an adapter, they cannot communicate.

---

## Solution

The **Adapter** converts the interface of an existing class into the interface expected by the client.

The client communicates with the Adapter, and the Adapter delegates the request to the existing (adaptee) class.

---

## Project Structure

```text
Adapter/
│── Client.java
│── Target.java
│── Adapter.java
│── Adaptee.java
└── README.md
```

---

## Components

### Client

Uses the Target interface and is unaware of the adaptee.

### Target

Defines the interface expected by the client.

### Adaptee

An existing class with an incompatible interface.

### Adapter

Implements the Target interface and internally delegates calls to the Adaptee.

---

## Benefits

* Allows incompatible interfaces to work together.
* Promotes code reusability.
* Integrates legacy or third-party code without modifying it.
* Reduces code duplication.
* Follows the Open/Closed Principle.

---

## Real-World Examples

* USB-C to HDMI adapter
* USB-C to Micro-USB adapter
* Power plug/travel adapters
* Integrating legacy systems with modern applications
* Wrapping third-party APIs to match an application's interface

---

## When to Use

Use the Adapter pattern when:

* Existing classes have incompatible interfaces.
* You want to reuse legacy or third-party code.
* Modifying the existing implementation is not feasible.

---

## Pattern Type

**Structural Design Pattern**

---

## Author

**Saksham Dubey**
