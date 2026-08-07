# SmartCalculator - Requirements & Design

## 1. Problem Statement

Many people perform mathematical calculations every day. Manual calculations take more time and can lead to mistakes. SmartCalculator provides a simple command-line application that performs calculations quickly, accurately, and safely while handling invalid input gracefully.

---
# 2. 5 Whys

**Why 1:** Why does a user need a calculator application? - To perform mathematical calculations quickly and accurately.

**Why 2:** Why perform calculations quickly? - To reduce the time spent doing manual calculations.

**Why 3:** Why reduce manual calculation time? - To improve productivity in everyday work and study.

**Why 4:** Why improve productivity? - So users can complete their tasks faster and focus on more important work.

**Why 5:** Why is completing tasks faster important? - Because it saves time, reduces errors, and helps users make better decisions with reliable results.

### Insight

The calculator is not only about doing arithmetic. It helps users save time, avoid manual mistakes, and improve efficiency.

---

# 3. User Stories

### User Story 1

As a user, I want to perform basic arithmetic operations so that I can solve calculations quickly.

### User Story 2

As a user, I want clear error messages for invalid operations so that I know what went wrong and can correct my input.

---

# 4. Functional Requirements

### FR1 – Basic Arithmetic

The calculator shall support addition (+), subtraction (-), multiplication (*), division (/), and modulus (%).

**Acceptance Criteria**

**Given** the user enters two valid numbers and a supported operator

**When** the calculation is performed

**Then** the correct result shall be displayed.

---

### FR2 – User Input

The calculator shall allow the user to enter two numbers and an operator through the command line.

**Acceptance Criteria**

**Given** the calculator is running

**When** the user enters valid inputs

**Then** the calculator shall accept the values and perform the calculation.

---
### FR3 – Continuous Execution

The calculator shall continue accepting calculations until the user enters **exit**.

**Acceptance Criteria**

**Given** the calculation is completed

**When** the user has not entered "exit"

**Then** the calculator shall ask for the next calculation.

---
### FR4 – Error Handling

The calculator shall display meaningful error messages for invalid input and division by zero without crashing.

**Acceptance Criteria**

**Given** the user enters invalid input or attempts division by zero

**When** the calculation is processed

**Then** a clear error message shall be displayed and the application shall continue running.

---
### FR5 – Display Results

The calculator shall display the result rounded to two decimal places.

**Acceptance Criteria**

**Given** a valid calculation

**When** the result is produced

**Then** it shall be displayed with two decimal places.

---

### FR6 - Unknown Operator Validation
The calculator shall reject unsupported operators.

**Acceptance Criteria**

**Given** the user enters an operator other than +, -, *, /, or %

**When** the calculation starts

**Then** the calculator shall display "Invalid operator" and ask the user to try again.

---
### FR7 - Input Validation
The calculator shall validate that both operands are numeric values.

**Acceptance Criteria**

**Given** the user enters non-numeric input

**When** the calculator attempts to read the value

**Then** it shall display a meaningful error message without terminating the application.

---
### FR8 - Calculation History (Future Enhancement)
The calculator shall maintain a history of calculations performed during the current session..

**Acceptance Criteria**

**Given** the user successfully performs a calculation

**When** the result is displayed

**Then** the expression and its result shall be stored in the session history.

---

# 5. Non-Functional Requirements

### NF1 – Performance

Each calculation shall complete within **1 second** under normal usage.

---

### NF2 – Usability

Error messages shall be simple, clear, and understandable by users without technical knowledge.

---
### NF3 – Reliability

The calculator shall continue running after invalid input or unsupported operations without crashing.

---

### NF4 – Accuracy

The calculator shall produce mathematically correct results for all supported operations.

---

# 6. MoSCoW Prioritization

## Must Have

- Addition
- Subtraction
- Multiplication
- Division
- Modulus
- Input validation
- Error handling
- Exit option

## Should Have

- Results displayed to two decimal places
- Friendly user messages

## Could Have

- Calculation history
- Square root
- Percentage

## Won't Have

- Graphical User Interface (GUI)
- Database
- User accounts
- Network features
- Web server

---

# 7. Out of Scope

The current version will NOT include:

- Graphical interface
- Database storage
- Login system
- Cloud deployment
- Mobile application

---
