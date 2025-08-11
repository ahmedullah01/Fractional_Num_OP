

## Fraction Arithmetic in Java (SRP-based Design)

This project implements **fraction arithmetic operations** in Java while following the **Single Responsibility Principle (SRP)** from SOLID design principles.

---

### **Overview**

The program performs:

* **Addition** of two fractions
* **Subtraction** of two fractions
* **Multiplication** of two fractions
* **Division** of two fractions
* **Reduction of fractions** to their simplest form using the **Greatest Common Divisor (GCD)** algorithm.

---

### **How It Works**

* **`OPERATION` class**
  Represents a fraction with `numerator` and `denominator` fields.

  * Stores fraction data.
  * Provides `GCD` method to simplify fractions.
  * Includes getter/setter methods.
  * Overrides `toString()` for clean fraction display.

* **`ADDITION`, `SUBTRACT`, `MULTIPLY`, and `DIVIDE` classes**
  Each class contains **only one static method** for its respective operation.

  * Accepts two `OPERATION` objects.
  * Performs the calculation.
  * Calls `OPERATION.GCD()` to reduce the result.

* **`Main` class**

  * Creates `OPERATION` objects for the two fractions.
  * Calls each operation class method to display results.

---

### **SRP Justification**

Each class has **one clear reason to change**:

* **`OPERATION`** → Only handles data storage & fraction simplification.
* **`ADDITION`** → Only responsible for addition logic.
* **`SUBTRACT`** → Only responsible for subtraction logic.
* **`MULTIPLY`** → Only responsible for multiplication logic.
* **`DIVIDE`** → Only responsible for division logic.
* **`Main`** → Only responsible for running the program.

This separation ensures that changes to one operation do not affect others, improving **maintainability** and **readability**.

---

Do you want me to also **add a diagram** of the class relationships\*\* for your GitHub README\*\* so it looks more professional?
That would make SRP implementation visually clear.
