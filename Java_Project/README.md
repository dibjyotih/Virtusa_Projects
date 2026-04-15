# SafeLog Password Validator (Java Application)

A GUI-based password validation system developed using Java Swing that enforces corporate security policies and provides real-time feedback to users.

---

## Features

- Desktop GUI application (Java Swing)
- Password input with validation
- Minimum length check (8 characters)
- Checks for uppercase letters
- Checks for numeric digits
- Displays specific error messages
- Shows success message for strong passwords

---

## Tech Stack

- **Language:** Java
- **GUI Framework:** Swing
- **Concepts Used:**
  - Loops (`for`, `while`)
  - Conditional statements
  - Event-driven programming
  - String manipulation
  - Character class methods

---

## Project Structure
SafeLog/
│
├── PasswordValidatorApp.java # Main GUI application
└── README.md # Project documentation


---

## Requirements

- Java JDK 8 or above
- Any IDE (IntelliJ, Eclipse, VS Code) or terminal

---

## How to Run

1. Compile the program:
javac PasswordValidator.java


2. Run the application:
 java PasswordValidator

---

## Validation Rules

The password must:
- Be at least 8 characters long
- Contain at least one uppercase letter
- Contain at least one digit (0–9)

---

## How It Works

1. User enters a password in the GUI
2. Clicks the **Validate** button
3. System checks:
   - Length
   - Uppercase presence
   - Digit presence
4. Displays:
   - Specific errors OR
   - Strong password message

---

## Example Output

- Too short  
- Missing uppercase  
- Missing digit  
- Strong Password  

---

## Future Enhancements

- Show/Hide password option
- Add special character validation
- Password strength meter (Weak/Medium/Strong)
- Connect with SQL database for login system

---

## Use Case

Designed for secure systems like:
- Employee portals
- Login systems
- Authentication modules

---
