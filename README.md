# Kotlin MutableSet removeIf ConcurrentModificationException

This repository demonstrates a common error encountered when using the `removeIf` function with a `MutableSet` in Kotlin. The `removeIf` function modifies the collection while iterating, leading to a `ConcurrentModificationException`.

The `bug.kt` file shows the problematic code. The `bugSolution.kt` file provides a corrected version, illustrating how to safely remove elements from a `MutableSet`.

## How to reproduce

1. Clone the repository.
2. Open `bug.kt`.
3. Run the code.  You will observe the `ConcurrentModificationException`. 

## Solution

The solution involves creating a copy of the set before removing elements or iterating using an iterator and removing elements using the iterator's `remove()` method.