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
                for (int i = 0; i < expenses.size(); i++){
                    if(expense.getCategory().equals(categories.get(i))){
                        flagWatch = true;
                        break;
                    }
                }
                if (flagWatch == false) {
                    System.out.println("Adding " + expense.getCategory() + " category in");
                    categories.add(expense.getCategory());
                }
            }
        }

        System.out.println("Select Your Option:");
        for (int i = 0; i < categories.size(); i++){
            System.out.println((i+1) + ". " + expenses.get(i));
        }

        int choice = scanner.nextInt();

        for (Expense expense : expenses){
            if(expense.getCategory().equals(categories.get(choise))){
                System.out.println(expense);
            }
        }
    }

    public void viewExpensesByDate(String start, String end){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yy");
        
        try {
            LocalDate startDate = LocalDate.parse(start, formatter); 
            LocalDate endDate = LocalDate.parse(end, formatter);
            
            for (Expense expense : expenses){
                LocalDate targetDate = LocalDate.parse(expense.getDate(), formatter);
                
                if((targetDate.isEqual(startDate) || targetDate.isAfter(startDate)) &&
                    (targetDate.isEqual(endDate) || targetDate.isAfter(endDate))){
                    System.out.println(expense);
                }

            }
        } catch (Exception e) { 
            System.out.println("Invalid date format. Please use the format: d/M/yy");
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

