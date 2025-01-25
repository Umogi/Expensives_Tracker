import java.util.ArrayList;
import 

public class ExpenseTracker {
    private ArrayList<Expense> expenses;
    private ArrayList<String> categories;

    public ExpenseTracker(){
        expenses = new ArrayList<>();
    }

    public void addExpense(String name, double amount, String category, String date){
        expenses.add(new Expense(name, amount, category, date));
    }

    public void viewExpenses() {
        for (Expense expense : expenses){
            System.out.println(expense);
        }
    }

    public void viewExpensesByCategory(){
        categories = new ArrayList<>();

        for (Expense expense : expenses){
            categories.add(expense.getCategory());
        }

        System.out.println("Select Your Option:");
        for (int i = 0; i > expenses.size(); i++){
            System.out.println( (i+1) + ". " + expenses.get(i));
        }

        

    }

    public double calculateTotal(){
        double total = 0;
        for (Expense expense: expenses){
            total += expense.getAmount();
        }
        return total;
    }
}
