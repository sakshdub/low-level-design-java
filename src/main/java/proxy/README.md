# Proxy Design Pattern (Java)

This project demonstrates the **Proxy Design Pattern**, a structural design pattern that provides a placeholder or surrogate for another object to control access to it.

---

## Problem

Directly accessing an object is not always desirable. Sometimes we need to:

* Control access to a resource.
* Delay the creation of expensive objects.
* Add security checks.
* Cache frequently used data.
* Log requests before forwarding them.

Embedding this logic inside the client or the real object makes the code difficult to maintain.

---

## Solution

The **Proxy** pattern introduces a proxy object that implements the same interface as the real object. The client interacts with the proxy, which can perform additional operations before or after delegating the request to the real object.

---

## Project Structure

```text
Proxy/
│── Client.java
│── Subject.java
│── RealSubject.java
│── Proxy.java
└── README.md
```

---

## Components

### Subject

Defines the common interface shared by both the proxy and the real object.

### Real Subject

Implements the actual business logic.

### Proxy

Implements the same interface as the real object and controls access by performing additional tasks such as validation, caching, logging, or lazy initialization before delegating requests.

### Client

Communicates only with the Subject interface and is unaware of whether it is interacting with the proxy or the real object.

---

## Benefits

* Controls access to an object.
* Supports lazy initialization.
* Improves security by adding authorization checks.
* Enables caching to improve performance.
* Allows logging and monitoring without modifying the real object.
* Follows the Open/Closed Principle.

---

## Real-World Examples

* ATM acting as a proxy to a bank server.
* Authentication and authorization middleware.
* Image lazy loading in applications.
* Web server reverse proxies (e.g., Nginx).
* API gateways controlling access to backend services.

---

## When to Use

Use the Proxy pattern when:

* Access to an object should be controlled.
* Object creation is expensive and should be delayed.
* You need to add logging, caching, or security.
* The client should remain unaware of these additional responsibilities.

---

## Pattern Type

**Structural Design Pattern**

---

## Pattern Structure

```text
      Client
         |
         v
      Subject
      /     \
 Proxy     RealSubject
    |
    +-------> RealSubject
```

---

## Advantages

* Adds functionality without modifying the real object.
* Reduces unnecessary object creation.
* Improves security and performance.
* Keeps the client code simple.

---

## Disadvantages

* Introduces an extra layer of abstraction.
* Can increase the number of classes in the system.

---

## Author

**Saksham Dubey**
