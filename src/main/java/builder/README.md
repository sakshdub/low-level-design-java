# Builder Design Pattern

## Definition

Builder Pattern is a creational design pattern used to create complex objects step by step.

It is useful when an object has many optional parameters and using constructors becomes difficult to read and maintain.

---

## Problem

Suppose we have a House class with multiple attributes:

- Floors
- Garden
- Swimming Pool
- Garage
- Lift

Without Builder Pattern:

```java
House house = new House(
        2,
        true,
        true,
        false,
        true
);
```

The code is difficult to read because it is not clear what each value represents.

---

## Solution

Builder Pattern allows object creation step by step.

```java
House house = new House.HouseBuilder(
        2,
        true,
        true
)
.setGarage(true)
.setLift(true)
.build();
```

This is more readable and easier to maintain.

---

## UML

```text
+----------------+
|     House      |
+----------------+
| floors         |
| garden         |
| swimmingPool   |
| garage         |
| lift           |
+----------------+

        ▲
        |
        |

+----------------------+
|    HouseBuilder      |
+----------------------+
| setGarage()          |
| setLift()            |
| build()              |
+----------------------+
```

---

## Real World Example

Building a house.

Requirements are collected one by one:

- Number of floors
- Garden
- Garage
- Lift

After all requirements are provided, the builder constructs the final house.

---

## Advantages

- Improves readability
- Handles optional parameters easily
- Avoids large constructors
- Easier to maintain

---

## Disadvantages

- More classes and code
- Slightly increases complexity

---

## Interview Explanation

Builder Pattern is used when an object has many optional parameters. Instead of creating large constructors, we create the object step by step using a Builder and finally call build() to create the object.

---

## Key Takeaway

Builder Pattern = Step-by-Step Object Creation

Examples:

- House Builder
- Pizza Builder
- Computer Builder
- User Profile Builder