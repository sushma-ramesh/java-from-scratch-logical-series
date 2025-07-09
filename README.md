# Java-From-Scratch-Logical-Series
Learn Java from scratch by creating custom methods – no inbuilt shortcuts, just pure logic!

# 30 Days of Java – Build Your Own Logic (No Inbuilt Shortcuts!)

Welcome to the **30 Days of Java** self-learning series, designed to take you from absolute beginner to confident project builder. This repository contains **pure logic-based Java code**, where the goal is **not to use inbuilt methods**, but rather to **create your own custom methods and solutions**.

> Learn Java by **thinking like a problem solver**, not just by using libraries.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Who Is This For?

This series is designed for:

- **Freshers and students** starting with Java
- **Aspiring Java backend developers**
- Anyone preparing for **interviews** or company coding rounds
- Developers who want to understand **how inbuilt methods work internally**
- Curious learners who enjoy building things from scratch

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  What You’ll Learn

| Week   | Focus                                                   |
|------  |---------------------------------------------------------|
| Week 1 | Java Basics, Logic Building, Custom Math Methods        |
| Week 2 | Build Your Own Arrays, Strings, Sorting, Searching      |
| Week 3 | Manual Data Structures (Stack, Queue, Linked List), OOP |
| Week 4 | Exception Handling, File I/O, Final Projects            |

Every day focuses on **writing your own methods** like `reverseString()`, `sortArray()`, `power()`, `toUpperCase()` etc., without depending on `Collections.sort()`, `Math.pow()`, or similar inbuilt helpers.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 5: Searching – Linear and Binary (Manual)

###  Files:
- `SearchAlgorithms.java`

###  What’s Inside:
- `linearSearch()`  
- `binarySearch()` (manual, assumes sorted array)

###  Sample Output:
- Linear Search: 7 found at index 3
- Binary Search: 11 found at index 5

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
#  Day 7 – String Utilities

###  File:
- `StringUtilities.java`

###  What's Inside:
- `isPalindrome()` – Check if a string reads the same forward and backward  
- `isAnagram()` – Check if two strings have same characters  
- `wordCount()` – Count the number of words manually (no split)

###  Sample Output:
- Is Palindrome (madam): true
- Is Anagram (listen/silent): true
- Word count: 5

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Day 8: Stack (Array-based) – Push, Pop, Peek, IsEmpty
 ### Files:
- ArrayStack.java

###  What’s Inside:
- push(int) – Add an element to the top of the stack

- pop() – Remove the top element

- peek() – View the top element without removing

- isEmpty() – Check if stack is empty

- isFull() – Check if stack is full
### Sample Output:
- Top element (peek): 30  
- Popped: 30  
- Popped: 20  
- Is stack empty? false

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
#  Day 9: Queue (Array-based) – Enqueue, Dequeue, Peek
###  Files:
- ArrayQueue.java

###  What’s Inside:
- enqueue(int) – Add element to the rear

- dequeue() – Remove element from the front

- peek() – View front element without removing

- isEmpty() – Check if queue is empty

- isFull() – Check if queue is full

### Sample Output:

- Front element (peek): 10  
- Dequeued: 10  
- Dequeued: 20  
- Is queue empty? false
  
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Day 10: Singly Linked List – Manual Implementation

### Files:
- `Node.java`
- `MyLinkedList.java`

### Concepts:
- Create nodes using classes
- Add element at head and tail
- Traverse and print the list

### Sample Output:
Linked List: 10 -> 20 -> 30


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  Day 11: Recursion – Think Like a Function

### Files:
- `RecursionExamples.java`

### Concepts:
- Factorial using recursion
- Fibonacci using recursion
- Sum of digits

### Sample Output:
- Factorial of 5: 120
- Fibonacci of 5: 5
- Sum of digits (1234): 10


----------------------------------------------------------------------------------------------------------------

##  Day 12: Manual Hashing – Build Simple Key-Value Store

### Files:
- `MyHashTable.java`

### Concepts:
- Hash function
- Store and retrieve key-value pairs
- Handle collisions with basic chaining (optional)

## Sample Output:
- Put (name, Alice)
- Put (age, 25)
- Get 'name': Alice
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  Day 13: Matrix Operations – Manual 2D Array Work

### Files:
- `MatrixOperations.java`

### Concepts:
- Matrix addition
- Matrix multiplication
- Matrix transpose

### Sample Output:
- Addition Result:
- [3 5]
- [7 9]

- Multiplication Result:
- [19 22]
- [43 50]


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  Day 14: Mini Project – Student Result Manager (Console)

### Files:
- `Student.java`
- `ResultManager.java`

### Features:
- Store student info (name, marks)
- Calculate average and grade
- Print result card

### Sample Output:
- Student: Sushma
- Total Marks: 270/300
- Grade: A
-------------------------------------------------------------------------------------

##  Day 15: OOP Basics – Build with Classes

### Files:
- `Car.java`, `Person.java`

### Concepts:
- Object creation
- Getters and setters
- Encapsulation and constructors

### Sample Output:
- Car model: Swift
- Owner: Priya
- Speed: 120 km/h
--------------------------------------------------------------------------------------------------------------------

##  Day 16: Inheritance + Polymorphism

### Files:
- `Animal.java`
- `Dog.java`
- `Cat.java`

### Concepts:
- `extends` keyword
- Method overriding
- Polymorphism via parent references

### Sample Output:
- Animal speaks
- Dog barks
- Cat meows
-----------------------------------------------------------------------------------------------------------------------------

##  Day 17: Interfaces & Abstract Classes

### Files:
- `Vehicle.java` (interface or abstract)
- `Bike.java`, `Car.java`

### Concepts:
- `interface`, `implements`
- `abstract` keyword
- Method declarations and implementations

### Sample Output:
- Starting Bike...
- Speed: 70 km/h

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Day 18: Exception Handling – Learn Try-Catch

### Files:
- `ExceptionDemo.java`
- `CustomException.java`

### Concepts:
- `try-catch-finally`
- `throw` and `throws`
- Create your own exception class

### Sample Output:
- Enter age: -5
- InvalidAgeException: Age must be positive
  
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 19: File I/O – Manual Read & Write

### Files:
- `FileReaderExample.java`
- `FileWriterExample.java`

### Concepts:
- Read from `.txt` using `FileReader`, `BufferedReader`
- Write to `.txt` using `FileWriter`, `BufferedWriter`
- Handle exceptions manually

### Sample Output:
- Reading from input.txt:
- Hello, this is a test file.

- Writing to output.txt completed.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  Day 20: Manual Date/Time – Without java.time APIs

### Files:
- `ManualDateDifference.java`

### Concepts:
- Represent a date using `int day, month, year`
- Calculate number of days between two dates manually
- Account for leap years, month lengths

### Sample Output:
- Start Date: 01-01-2023
- End Date: 10-01-2023
- Days between: 9

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 21: Mini Project – Library Console App

### Files:
- `Book.java`
- `Library.java`
- `Main.java`

### Features:
- Add, delete, view books
- Search book by title/author
- Console-based UI

### Sample Output:
- 1.Add Book
- 2.View All
- 3.Search
- 4.Exit
- Enter your choice: 1
- Book added: Java Essentials
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 22: Build Your Own ArrayList – Dynamic Array

### Files:
- `MyArrayList.java`

### Concepts:
- Store elements in a basic `Object[]`
- Implement `add()`, `get()`, `remove()`, `size()`
- Auto-resize when array is full

### Sample Output:
- Adding elements: 10, 20, 30
- Size: 3
- Element at index 1: 20
- Removing index 1...
- Size after removal: 2
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 23: Build Your Own StringBuilder

### Files:
- `MyStringBuilder.java`

### Concepts:
- Use `char[]` internally
- Implement `append()`, `length()`, `reverse()`
- Manual resizing and efficiency

### Sample Output:
- Appending: Hello
- Appending: World
- Result: HelloWorld
- Reversed: dlroWolleH
- Length: 10
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 24: Project – Expense Tracker (Console-Based)

### Files:
- `Expense.java`
- `ExpenseTracker.java`

### Features:
- Add daily expenses (amount, category, note)
- View all expenses
- Total balance summary

### Sample Output:
- Added: ₹250 (Food) - "Lunch at cafe"
- Total Spent: ₹250
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

##  Day 25: Project Continuation – Filtering and Categories

### Files:
- Update `ExpenseTracker.java`

### Features:
- Filter by date, category
- View expenses within date ranges
- Track expense category totals

### Sample Output:
- Filter by Category: Travel
- ₹400 Uber
- ₹120 Train
- Total in Travel: ₹520
----------------------------------------------------------------------------------------------------------------------------------------------------

##  Day 26: Build Login/Register System with File Storage

### Files:
- `User.java`
- `AuthSystem.java`

### Features:
- Register user with username & password
- Login with file-based verification
- Store credentials in `.txt` securely (basic logic)

### Sample Output:
> Welcome!
- 1.Register
- 2.Login
- Enter choice: 1
- User registered. Login to continue.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Day 27: Reusable Utility Classes

 ### Files:
- `MyStringUtil.java`
- `MyArrayUtil.java`
- `MyMathUtil.java`

### Features:
- Build a utility class library
- Reuse functions like:
  - `reverseString()`
  - `findMax(int[])`
  - `power(int, int)`
  - `isPalindrome()`

### Sample Output:
- Using MyMathUtil.power(2, 3): 8
- Using MyStringUtil.isPalindrome("madam"): true
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 28: Final Project – Student Portal with Grade Generator

### Files:
- `Student.java`
- `StudentPortal.java`

### Features:
- Register student, enter marks
- Generate grade (A/B/C/F) based on average
- Store and display student reports

### Sample Output:
- Student: Ravi
- Subjects: Math - 80, CS - 75, Eng - 85
- Average: 80
- Grade: A
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
##  Day 29: Project Polish – Input Validation & Feedback

### Enhancements:
- Add try-catch to all user input
- Prevent crash on invalid data
- Validate email, marks, usernames

### Sample:
- Enter marks (0-100): -10
- Invalid input. Please enter a number between 0 and 100.
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------




