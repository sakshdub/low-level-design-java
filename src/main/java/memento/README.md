# Memento Design Pattern

## Problem
Need to save and restore an object's previous state without exposing its internal structure.

## Real-world Example
Undo/Redo feature in a text editor.

## Solution
Store the state of an object in a separate Memento object and restore it when needed.

## Structure
- Originator (Editor)
- Memento (EditorMemento)
- Caretaker (Caretaker)

## Benefits
- Supports undo/redo functionality
- Preserves encapsulation
- Easy state management