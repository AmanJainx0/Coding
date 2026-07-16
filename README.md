# Java Coding Practice

Welcome to the **Java Coding Practice** repository! This is a curated collection of Java source files covering data structures, algorithms, object-oriented programming (OOP) design patterns, mathematics, and other core programming concepts.

The codebase is organized cleanly into Java packages within the `src/com/aman` directory.

---

## 📂 Project Structure

Here is a breakdown of the packages and the topics covered:

| Package | Description |
| :--- | :--- |
| **`com.aman.Array`** | Dynamic array examples (`ArrayList`), multidimensional arrays, and row-column matrix searches. |
| **`com.aman.binarysearch`** | Implementation of binary search, ceiling/floor of an array, finding peak elements, and rotated array searches. |
| **`com.aman.cloning`** | Deep and shallow object cloning techniques using Java's `Cloneable` interface. |
| **`com.aman.collections.linkedlist`** | Custom implementations of Singly (SLL), Doubly (DLL), and Circular (CLL) Linked Lists, plus cycle detection algorithms. |
| **`com.aman.exception`** | Exception handling guidelines, try-catch demonstrations, and custom exceptions. |
| **`com.aman.maths`** | Mathematical algorithms including GCD, HCF, LCM, Sieve of Eratosthenes, and Newton-Raphson square root. |
| **`com.aman.oops`** | Object-Oriented concepts like inheritance, polymorphism, abstraction (interfaces, abstract classes), generics, and lambda expressions. |
| **`com.aman.recursion`** | Solving problems recursively (sorting, reversing arrays, binary search, and target checks). |
| **`com.aman.sorting`** | Traditional iterative sorting algorithms (Bubble Sort, Selection Sort, Insertion Sort). |
| **`com.aman.strings`** | String processing tasks, such as palindrome validations. |

---

## 🛠️ Utility Scripts

Located at the project root are two Python utility scripts designed to help maintain package integrity:

- **`add_packages.py`**: Searches for `.java` files and automatically prepends the correct package header if it's missing.
- **`fix_packages.py`**: Scans the codebase and updates all package headers to match their physical folder structure on disk.

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher (Java 25 recommended).
- An IDE (e.g., **Eclipse**, IntelliJ IDEA, or VS Code).

### Running Scripts
Ensure you have Python 3 installed. You can run the packaging helpers from the root:
```bash
python fix_packages.py
```
