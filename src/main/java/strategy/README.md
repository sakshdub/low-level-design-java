# Strategy Design Pattern

## Problem
Avoid multiple conditional statements for different behaviors.

## Real-world Example
Different text formatting options like HTML, Markdown, or Plain Text.

## Solution
Define a family of algorithms and make them interchangeable at runtime.

## Structure
- Strategy Interface (TextFormatter)
- Concrete Strategies (HtmlFormatter, MarkdownFormatter, PlainFormatter)
- Context (Document)

## Benefits
- Eliminates if-else conditions
- Promotes flexibility
- Easy to extend new strategies