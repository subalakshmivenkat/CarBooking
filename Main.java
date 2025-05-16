import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login login = new Login();
        login.register();
        login.authenticate();

        UserDetails user = new UserDetails();
        user.getDetails();

        DriverPool pool = new DriverPool();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Driver Registration");
            System.out.println("2) Book Ride");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                // Register a single driver
                Driver driver = new Driver();
                driver.registerDriverDetails(sc);
                pool.addDriver(driver);
                System.out.println("Driver registered successfully!");

            } else if (choice.equals("2")) {
                if (pool.getAvailableDriversCount() == 0) {
                    System.out.println("No available drivers at the moment. Please try later.");
                    continue;
                }

                
                

                // Show available drivers (only basic info like name, car model)
                pool.showAvailableDriversBasic();
                Location loc = new Location();
                loc.getLocations();

                System.out.print("Do you want to proceed with booking? (yes/no): ");
                String proceed = sc.nextLine();
                if (!proceed.equalsIgnoreCase("yes")) {
                    System.out.println("Booking cancelled.");
                    continue;
                }

                // Show full details of available drivers to choose from
                pool.showAvailableDriversDetailed();

                Driver selectedDriver = pool.selectDriver(sc);

                if (selectedDriver == null) {
                    System.out.println("No driver selected or driver not available. Booking failed.");
                    continue;
                }

                Payment payment = new Payment();
                payment.processPayment();

                Receipt receipt = new Receipt();
                receipt.generateReceipt(user, loc, selectedDriver);

            } else if (choice.equals("3")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
