import java.util.Scanner;

public class Payment {
    public void processPayment() {
        Scanner sc = new Scanner(System.in);
        long amount=sc.nextLong();
        System.err.println("Amount: "+amount);
        System.out.println("Select Payment Method: ");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        System.out.println("Payment successful using option " + choice);
    }
}
