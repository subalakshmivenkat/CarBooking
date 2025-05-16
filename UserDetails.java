import java.util.Scanner;

public class UserDetails {
    String name, email, phone;

    // Validate phone number (10 digits only)
    private boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }

    // Validate email format
    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
    }

    public void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        while (true) {
            System.out.print("Enter Phone (10 digits): ");
            phone = sc.nextLine();
            if (isValidPhone(phone)) break;
            System.out.println("Invalid phone number. It must be exactly 10 digits.\n");
        }

        while (true) {
            System.out.print("Enter Email: ");
            email = sc.nextLine();
            if (isValidEmail(email)) break;
            System.out.println("Invalid email format. Please try again.\n");
        }

        System.out.println("\nUser details saved successfully!");
    }

    // Optional: Main method to test
    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.getDetails();
    }
}
