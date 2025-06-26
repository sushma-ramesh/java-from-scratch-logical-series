# java-from-scratch-logical-series
Learn Java from scratch by creating custom methods – no inbuilt shortcuts, just pure logic!

# 30 Days of Java – Build Your Own Logic (No Inbuilt Shortcuts!)

Welcome to the **30 Days of Java** self-learning series, designed to take you from absolute beginner to confident project builder. This repository contains **pure logic-based Java code**, where the goal is **not to use inbuilt methods**, but rather to **create your own custom methods and solutions**.

> Learn Java by **thinking like a problem solver**, not just by using libraries.

---

## Who Is This For?

This series is designed for:

- **Freshers and students** starting with Java
- **Aspiring Java backend developers**
- Anyone preparing for **interviews** or company coding rounds
- Developers who want to understand **how inbuilt methods work internally**
- Curious learners who enjoy building things from scratch

---

##  What You’ll Learn

| Week   | Focus                                                   |
|------  |---------------------------------------------------------|
| Week 1 | Java Basics, Logic Building, Custom Math Methods        |
| Week 2 | Build Your Own Arrays, Strings, Sorting, Searching      |
| Week 3 | Manual Data Structures (Stack, Queue, Linked List), OOP |
| Week 4 | Exception Handling, File I/O, Final Projects            |

Every day focuses on **writing your own methods** like `reverseString()`, `sortArray()`, `power()`, `toUpperCase()` etc., without depending on `Collections.sort()`, `Math.pow()`, or similar inbuilt helpers.

---

##  Day 1: Java Basics – No Inbuilt Shortcuts

| File                     | Description                                         |
|--------------------------|-----------------------------------------------------|
| `SimpleCalculator.java`  | Custom methods for `add()`, `multiply()`, `power()` |
| `SquarePrinter.java`     | Print square using manual logic                     |
| `MyMathUtils.java`       | Manual `absolute()` method without `Math.abs()`     |

###  Concepts Practiced:
- Java syntax, loops, conditions
-  Creating methods
-  Manual implementation of math functions

###  Sample Output:
-   Addition: 15
-  Multiplication: 12
-    Power: 8
-    Absolute of -10: 10
-    Square of 5 is 25


##  Day 2: Arrays – Manual Logic Without Arrays Class

###  Files:
- `MyArrayUtils.java`

###  What’s Inside:
- Print array elements manually  
- Find sum of all elements  
- Find maximum value  
- Detect duplicates (without Set, Map)

###  Sample Output:
- 4 2 7 2 9 4 5
- Sum: 33
- Max: 9
- Duplicates:
- 2
- 4

##  Day 3: Strings – Reverse, Length, Case Handling

###  Files:
- `MyStringUtils.java`

### What’s Inside:
- `reverse(String)` without `StringBuilder`  
- `findLength(String)` without `.length()`  
- `equalsIgnoreCase(String a, String b)`  
- `toUpperCase(String)` manually

###  Sample Output:
- Reversed: olleH
- Length: 5
- Equals Ignore Case: true
- Uppercase: JAVA

##  Day 4: Sorting – No Collections.sort()

###  Files:
- `SortingAlgorithms.java`

### What’s Inside:
- `bubbleSort()` implementation  
- `selectionSort()` implementation  
- `printArray()` utility

###  Sample Output:
- Bubble Sort:
    1 2 3 5 8

- Selection Sort:
     2 4 6 7 9

##  Day 5: Searching – Linear and Binary (Manual)

###  Files:
- `SearchAlgorithms.java`

###  What’s Inside:
- `linearSearch()`  
- `binarySearch()` (manual, assumes sorted array)

###  Sample Output:
- Linear Search: 7 found at index 3
- Binary Search: 11 found at index 5


## Day 6: Custom Array Utilities – Manual Resize, Remove, Frequency
###  Files:
    - ArrayUtilities.java

### What’s Inside:
- resize(int[], int) – Manually resize array by adding a new element

- remove(int[], int) – Remove all occurrences of a number from array manually

- frequency(int[]) – Print frequency of each element manually (no Map or Collections)

### Sample Output:

- Resized: 2 3 2 4 5 3 6  
- After removing 3: 2 2 4 5 6  
- Frequency:
- 2 appears 2 times.
- 3 appears 2 times.
- 4 appears 1 times.
- 5 appears 1 times.

