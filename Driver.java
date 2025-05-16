import java.util.Scanner;

public class Driver {
    private String name;
    private String driverId;
    private String carModel;
    private int seats;
    private boolean available;

    private String contact;
    private double rating;
    private String license;
    private int experience;

    // Default constructor (empty)
    public Driver() {
    }

    // register driver details 
    public void registerDriverDetails(Scanner sc) {
        System.out.print("Driver Name: ");
        this.name = sc.nextLine();

        System.out.print("Driver ID: ");
        this.driverId = sc.nextLine();

        System.out.print("Car Model: ");
        this.carModel = sc.nextLine();

        System.out.print("Number of Seats: ");
        this.seats = Integer.parseInt(sc.nextLine());

        System.out.print("Is Available (true/false): ");
        this.available = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Contact Number: ");
        this.contact = sc.nextLine();

        System.out.print("Rating (0.0 to 5.0): ");
        this.rating = Double.parseDouble(sc.nextLine());

        System.out.print("License Number: ");
        this.license = sc.nextLine();

        System.out.print("Years of Experience: ");
        this.experience = Integer.parseInt(sc.nextLine());
    }

    // Display detailed info visible to customer before booking
    public void display() {
        System.out.println("Driver ID: " + driverId);
        System.out.println("Name: " + name);
        System.out.println("Car: " + carModel + ", Seats: " + seats);
        System.out.println("Rating: " + rating);
        System.out.println("Contact: " + contact);
        System.out.println("License: " + license);
        System.out.println("Experience: " + experience + " years");
        System.out.println("-----------------------------");
    }


    // Getter and Setter methods
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }
    public int getSeats(){
        return seats;
    }
    public String getContact(){
        return contact;
    }
}
