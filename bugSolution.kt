```kotlin
fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)
    
    // Solution 1: Create a copy
    val setCopy = set.toMutableSet()
    setCopy.removeIf { it % 2 == 0 }
    println(setCopy) // Output: [1, 3, 5]
    
    // Solution 2: Use iterator
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 3, 5]
}
```