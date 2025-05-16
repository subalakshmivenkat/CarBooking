import java.io.Console;
import java.util.Scanner;

public class Login {
    private String userId;
    private String password;

    private boolean isValidPassword(String pwd) {
        return pwd.matches(".*\\d.*"); // at least one digit
    }

    public void register() {
        Console console = System.console();
        Scanner sc = null;

        if (console == null) {
            sc = new Scanner(System.in);
            System.out.println("[INFO] Console not available. Using visible input mode.\n");
        }

        if (console != null) {
            userId = console.readLine("Create User ID: ");
        } else {
            System.out.print("Create User ID: ");
            userId = sc.nextLine();
        }

        while (true) {
            String inputPwd;
            if (console != null) {
                char[] pwdArray = console.readPassword("Create Password (must contain at least one digit): ");
                inputPwd = new String(pwdArray);
            } else {
                System.out.print("Create Password (must contain at least one digit): ");
                inputPwd = sc.nextLine();
            }

            if (isValidPassword(inputPwd)) {
                password = inputPwd;
                System.out.println("Registration successful!\n");
                break;
            } else {
                System.out.println("Invalid password. It must contain at least one number.\n");
            }
        }
    }

    public void authenticate() {
        Console console = System.console();
        Scanner sc = null;

        if (console == null) {
            sc = new Scanner(System.in);
            System.out.println("[INFO] Console not available. Using visible input mode.\n");
        }

        while (true) {
            String uid;
            String pwd;

            if (console != null) {
                uid = console.readLine("Enter User ID: ");
                char[] pwdArray = console.readPassword("Enter Password: ");
                pwd = new String(pwdArray);
            } else {
                System.out.print("Enter User ID: ");
                uid = sc.nextLine();
                System.out.print("Enter Password: ");
                pwd = sc.nextLine();
            }

            if (uid.equals(userId) && pwd.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Try again.\n");
            }
        }
    }

    // Optional main for standalone testing
    public static void main(String[] args) {
        Login login = new Login();
        login.register();
        login.authenticate();
    }
}
