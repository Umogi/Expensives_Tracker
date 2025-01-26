# Expense Tracker

An easy-to-use Java-based console application that helps you manage and track your expenses effectively. The program allows you to add, view, and categorize expenses while providing a total expense summary.

## Features

- **Add Expense**: Add a new expense with details like name, amount, category, and date.
- **View Expenses**:
  - View all expenses.
  - Filter expenses by category.
  - Filter expenses within a date range.
- **Calculate Total Expense**: Get a summary of the total expenses.
- **Categorization**: Automatically detects and manages expense categories.

## Requirements

- Java Development Kit (JDK) 8 or above.

## How to Use

1. **Clone the Repository**:
   ```
   git clone https://github.com/yourusername/expense-tracker.git
   cd expense-tracker
   ```
2. Compile the Code:
   ```
   javac Main.java
   ```
3. Run the Application:
   ```
   java Main
   ```
4. Follow the Console Prompts:
  - Add an expense with its details.
  - View expenses by different criteria.
  - Get the total expense summary.

## Usage Example

When you run the program, you'll see options like:
   ```
   Select Your Option:
   1. Add expense
   2. View expense
   3. View total expense
   ```
### Adding an Expense:

You will be prompted to enter the name, amount, category, and date (in d/M/yy format).

### Viewing Expenses:
You can choose:
 - View all expenses.
 - Filter by category.
 - Filter by a date range.

### Total Expense:
View the total of all your tracked expenses.

### Code Structure
 - Main.java: The entry point of the application, handles user interaction.
 - ExpenseTracker.java: Manages the logic for adding, viewing, and calculating expenses.
 - Expense.java: Represents a single expense item with details like name, amount, category, and date.

### Date Format
All dates must be entered in the d/M/yy format (e.g., 25/01/25 for January 25, 2025).





