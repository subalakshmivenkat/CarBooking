import java.util.ArrayList;
import java.util.Scanner;

public class DriverPool {
    private ArrayList<Driver> drivers = new ArrayList<>();

    // Add a driver to the pool
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    // Show only drivers that are available (basic info)
    public void showAvailableDriversBasic() {
        System.out.println("\nAvailable Drivers (Basic Info):");
        boolean anyAvailable = false;
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                System.out.println("Driver Name: " + d.getName() +
                " | Contact: "+d.getContact()+ " | Car Model: " + d.getCarModel()+" | Seats: "+d.getSeats());
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No drivers currently available.");
        }
    }

    // Show detailed info of available drivers
    public void showAvailableDriversDetailed() {
        System.out.println("\nAvailable Drivers (Detailed Info):");
        boolean anyAvailable = false;
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                d.display();
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No drivers currently available.");
        }
    }

    // Let the user select a driver by ID 
    public Driver selectDriver(Scanner sc) {
        System.out.print("Enter Driver ID to Book: ");
        String id = sc.nextLine();

        for (Driver d : drivers) {
            if (d.getDriverId().equalsIgnoreCase(id) && d.isAvailable()) {
                d.setAvailable(false); // Mark driver as booked
                return d;
            }
        }
        System.out.println("Invalid or unavailable driver ID.");
        return null;
    }

    // Return the count of available drivers
    public int getAvailableDriversCount() {
        int count = 0;
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
