# Command Design Pattern

## Problem
Encapsulate a request as an object, allowing parameterization of clients with different requests.

## Real-world Example
A remote control where each button performs an action like turning on a light or fan.

## Solution
Convert requests into command objects that execute actions on receivers.

## Structure
- Command Interface
- Concrete Commands (Light, Fan, AC)
- Invoker (Remote)
- Receiver (devices)

## Benefits
- Decouples sender and receiver
- Easy to add new commands
- Supports undo/redo operations