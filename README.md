# Java Basics

Java programs covering syntax fundamentals, operators, strings, conditionals, and loops — following a structured Java course.

## Fundamentals

| File | Concept |
|---|---|
| `CHW_04_literal.java` | Java literals — byte, char, float, String |
| `CHW_05_takinginput.java` | Taking user input using the `Scanner` class |
| `ExerciseOne.java` | Program to calculate a student's mark percentage from 5 subjects |

## Chapter 1 - Practice Set

| File | Problem |
|---|---|
| `CWH_Ch1_PS_1.java` | Sum of three numbers |
| `CWH_Ch1_PS_2.java` | Calculate CGPA from three subject marks |
| `CWH_Ch1_PS_3.java` | Greet a user by name using input |
| `CWH_Ch1_PS_4.java` | Convert kilometers to miles |
| `CWH_Ch1_PS_5.java` | Check whether user input is an integer |

## Chapter 2 - Operators

| File | Concept / Problem |
|---|---|
| `CWH_Ch2_op.java` | Operators walkthrough |
| `CWH_09_ch2_op.java` | Operators walkthrough (continued) |
| `CWH_10_ch2_op.java` | Operators walkthrough (continued) |
| `CWH_CH2_PS_Q1.java` | Evaluate a mixed arithmetic expression |
| `CWH_CH2_PS_Q2.java` | Encrypt/decrypt a grade using addition |
| `CWH_CH2_PS_Q3.java` | Compare two numbers using comparison operators |
| `CWH_CH2_PS_Q4.java` | Implement a physics formula in code |
| `CWH_CH2_PS_Q5.java` | Evaluate an integer expression with operator precedence |

## Chapter 3 - Strings

| File | Concept / Problem |
|---|---|
| `CWH_13_strings.java` | String basics |
| `CWH_14_String_method.java` | String methods — `length()`, `toLowerCase()` |
| `CWH_CH3_V15_PS_1.java` | Convert a string to lowercase |
| `CWH_CH3_V15_PS_2.java` | Replace spaces with underscores |
| `CWH_CH3_V15_PS_3.java` | Fill a letter template with a name |
| `CWH_CH3_V15_PS_4.java` | Detect double/triple spaces in a string |
| `CWH_CH3_V15_PS_5.java` | Format a letter using escape sequence characters |

## Chapter 4 - Conditionals & Switch

| File | Concept |
|---|---|
| `CWH_CH4_v16_condi.java` | if-else basics |
| `CWH_CH4_v17_condi.java` | Conditional statements (continued) |
| `CWH_CH4_v18_switch.java` | switch statement |

## Chapter 4 - Practice Set

| File | Problem |
|---|---|
| `CWH_CH4_V19_PS_p1.java` | Predict program output — common `=` vs `==` mistake in an if condition |
| `CWH_CH4_V19_PS_p2.java` | Check if a student passes or fails (40% overall, min 33% per subject, 3 subjects) |
| `CWH_CH4_V19_PS_p3.java` | Calculate income tax based on slabs (2.5L-5L: 5%, 5L-10L: 20%, above 10L: 30%) |
| `CWH_CH4_V19_PS_p4.java` | Find the day of the week from a number (1 = Monday, 2 = Tuesday, etc.) |
| `CWH_CH4_V19_PS_p5.java` | Check whether an entered year is a leap year |
| `CWH_CH4_V19_PS_p6.java` | Determine website type from its URL (.com, .org, .in) |

## Chapter 5 - Loops

| File | Concept |
|---|---|
| `CWH_V21_while.java` | while loop |
| `CWH_V22_do_while.java` | do-while loop |
| `CWH_V23_FOR.java` | for loop |
| `CWH_V24_break_continue.java` | break and continue statements |

## Chapter 5 - Practice Set

| File | Problem |
|---|---|
| `CWH_V25_Ch5_ps_1.java` | Print a star pyramid pattern that shrinks each row |
| `CWH_V25_Ch5_ps_2.java` | Sum of first n even numbers using a while loop |
| `CWH_V25_Ch5_ps_3.java` | Print the multiplication table of a given number n |
| `CWH_V25_Ch5_ps_4.java` | Print the multiplication table of 10 in reverse order |
| `CWH_V25_Ch5_ps_5.java` | Find the factorial of a given number using a for loop |
| `CWH_V25_Ch5_ps_6.java` | Repeat Q5 (factorial) using a while loop |
| `CWH_V25_Ch5_ps_7.java` | Repeat Q1 (star pattern) using a for/while loop |
| `CWH_V25_Ch5_ps_9.java` | Calculate the sum of numbers occurring in the multiplication table of 8 |

*Q8 (loop interchangeability, true/false) and Q10 (do-while execution behavior) are short conceptual answers, not code — noted here rather than as separate files. Q11 (repeat Q2 using a for loop) still pending.*

## Mini Projects

| File | Description |
|---|---|
| `assingment_class12.java` | Print a series of prime numbers up to N, using nested loops |
| `rock_paper_scissors.java` / `rock_paper_scissors1.java` | Rock-Paper-Scissors game built while practicing conditionals (a fuller, feature-complete version lives in its own repo: [rock-paper-scissors-game](https://github.com/subhamkar-codes/rock-paper-scissors-game)) |

## Concepts covered

- Java literals and data types (`byte`, `char`, `float`, `String`)
- `Scanner` class for reading keyboard input
- Operator precedence and evaluation order
- String manipulation methods (`length()`, `toLowerCase()`, `replace()`, etc.)
- Escape sequences
- Nested loops (outer loop generates candidates, inner loop validates them — used in prime number checking)
- Conditional statements (if-else) and the `switch` statement
- while, do-while, and for loops; break and continue
- Common beginner pitfalls (e.g. `=` vs `==` in conditions, off-by-one errors like starting a factorial loop at 0 instead of 1)

## Coming from C

First Java programs after completing C fundamentals (pointers, arrays, strings, structures, file I/O, dynamic memory allocation). Java's OOP structure, Scanner-based input, and stricter type system (e.g. `String` vs primitive types) are the main syntax differences from C so far.

## How to run

javac <filename>.java
java <ClassName>


## Status

🚧 In progress — Chapters 1-5 complete (fundamentals, operators, strings, conditionals & switch, loops), plus a nested-loop prime number project and a Rock-Paper-Scissors mini-game.
