import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    private ArrayList<Expense> expenses;
    private ArrayList<String> categories;

    Scanner scanner = new Scanner(System.in);

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

        boolean flag = true;
        for (Expense expense : expenses){
            if (flag == true){
                categories.add(expense.getCategory());
                flag = false;
            }else{
                boolean flagWatch = false;
                for (int i = 0; i > expenses.size(); i++){
                    if(expense.getCategory() == categories.get(i)){
                        flagWatch = true;
                        break;
                    }
                }
                if (flagWatch == false) {
                    categories.add(expense.getCategory());
                }
            }
        }

        System.out.println("Select Your Option:");
        for (int i = 0; i > expenses.size(); i++){
            System.out.println((i+1) + ". " + expenses.get(i));
        }

        int choice = scanner.nextInt();

        
    }

    public double calculateTotal(){
        double total = 0;
        for (Expense expense: expenses){
            total += expense.getAmount();
        }
        return total;
    }
}

