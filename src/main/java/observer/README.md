# Observer Design Pattern

## Problem
Maintain consistency between objects when one object changes state.

## Real-world Example
YouTube channel notifications — subscribers get notified when a new video is uploaded.

## Solution
Define a subject that notifies all observers when its state changes.

## Structure
- Subject
- Observer Interface
- Concrete Observers (Users)
- Concrete Subject (YouTubeChannel)

## Benefits
- Loose coupling
- Dynamic subscription management
- Scalable event handling