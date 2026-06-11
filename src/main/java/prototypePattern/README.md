# Prototype Design Pattern

## 📌 Definition

Prototype Pattern is a **Creational Design Pattern** used to create new objects by **cloning an existing object** instead of creating it from scratch.

---

## 🎯 Why Use Prototype Pattern?

Use Prototype Pattern when:

* Object creation is expensive.
* Multiple similar objects are required.
* We want to avoid manually copying every field.
* We want to hide the copying logic from the client.

---

## ❌ Problem Without Prototype

The client manually copies every field.

```java
GameBoard copiedBoard = new GameBoard();

for(GamePiece piece : board.getPiece()) {
    copiedBoard.addPiece(
        new GamePiece(
            piece.getColor(),
            piece.getPosition()
        )
    );
}
```

Problems:

* Repetitive code
* Hard to maintain
* Client is responsible for copying objects

---

## ✅ Solution Using Prototype

Each object knows how to create its own copy.

```java
GameBoard copiedBoard = board.clone();
```

The client simply calls `clone()` without knowing the internal copying logic.

---

## UML

```text
                +----------------------+
                | Prototype<T>         |
                +----------------------+
                | clone() : T          |
                +----------------------+
                           ▲
                           |
         -------------------------------
         |                             |
+-------------------+      +--------------------+
| GamePiece         |      | GameBoard          |
+-------------------+      +--------------------+
| color             |      | List<GamePiece>    |
| position          |      +--------------------+
+-------------------+      | clone()            |
| clone()           |      +--------------------+
```

---

## Real World Examples

* Copy Resume Template
* Duplicate Photoshop Layer
* Clone Game Character
* Copy Chess Board
* Duplicate PowerPoint Slide

---

## Advantages

* Reduces repetitive object creation code.
* Hides cloning logic from the client.
* Faster than creating complex objects from scratch.
* Easy to create multiple similar objects.

---

## Disadvantages

* Deep cloning can become complex.
* Care must be taken when objects contain nested references.

---

## Interview Explanation

Prototype Pattern is used to create a new object by cloning an existing object instead of creating it from scratch. It is useful when object creation is expensive or when many similar objects are needed.

---

## Key Takeaway

Prototype Pattern = **Copy Existing Object**

Instead of:

```
new Object()
new Object()
new Object()
```

Use:

```
Original Object
      ↓
    clone()
      ↓
New Copy
```
