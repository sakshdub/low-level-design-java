# Facade Design Pattern (Java)

This project demonstrates the **Facade Design Pattern**, a structural design pattern that provides a **single, simplified interface** to a complex subsystem. Instead of interacting with multiple subsystem classes directly, the client communicates only with the Facade, which coordinates all the required operations internally.

---

## Problem

Without the Facade pattern, the client must:

- Create multiple subsystem objects.
- Know the correct sequence of method calls.
- Be tightly coupled to the subsystem implementation.

### Example (Without Facade)

```java
CPU cpu = new CPU();
RAM ram = new RAM();
HardDisk hardDisk = new HardDisk();

cpu.start();
ram.load();
hardDisk.read();
```

This makes the client code complex and difficult to maintain.

---

## Solution

The **Facade** encapsulates all subsystem interactions behind a single method.

### Example (With Facade)

```java
ComputerFacade computer = new ComputerFacade();
computer.startComputer();
```

The client no longer needs to know how the computer starts internally.

---

## Project Structure

```
Facade/
│── Client.java
│── ComputerFacade.java
│── CPU.java
│── RAM.java
│── HardDisk.java
└── README.md
```

---

## Components

### Client
Uses only the Facade class.

### Facade
Provides a simplified interface and coordinates all subsystem classes.

### Subsystem Classes
Perform the actual work.

- CPU
- RAM
- HardDisk

---

## Benefits

- Simplifies client code.
- Hides subsystem complexity.
- Reduces coupling.
- Improves maintainability.
- Makes the system easier to use.

---

## Real-World Examples

- Computer startup
- Banking applications
- Food delivery apps (Swiggy, Zomato)
- Home theater systems

---

## When to Use

Use the Facade pattern when:

- A subsystem is complex.
- You want to expose a simple interface.
- You want to reduce dependencies between the client and subsystem classes.

---

## Pattern Type

**Structural Design Pattern**

---

## Author

**Saksham Dubey**