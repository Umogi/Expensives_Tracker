import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select Your Option:");
            System.out.println("1. Add expence");
            System.out.println("2. View expence");
            System.out.println("3. View total expence");
            
            int choice = scanner.nextInt();
            
            if(choice == 1){
                scanner.nextLine(); 
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter date: ");
                String date = scanner.nextLine();
                tracker.addExpense(name, amount, category, date);
            }else if (choice == 2) {
                System.out.println("Select Your Option:");
                System.out.println("1. All");
                System.out.println("2. Category");
                System.out.println("3. Range Date");

                choice = scanner.nextInt();

                if (choice == 1) {
                    tracker.viewExpenses();
                }else if (choice == 2) {
                    tracker.viewExpensesByCategory();
                }else if (choice == 3){
                    System.out.println("Pick Start and End Date:");
                    scanner.nextLine(); // Consume newline
                    System.out.println("Start: ");
                    String start = scanner.nextLine();
                    System.out.println("End: ");
                    String end = scanner.nextLine();
                    
                    tracker.viewExpensesByDate(start, end);
                }else{
                    System.out.println("This option ddoes not exist");
                }

            }else if (choice == 3){
                System.out.println(tracker.calculateTotal());
            }else{
                System.out.println("This action does not exit!");
            }

        }
    }
}
