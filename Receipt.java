public class Receipt {
    public void generateReceipt(UserDetails user, Location loc, Driver driver) {
        System.out.println("------ Booking Confirmation ------");
        System.out.println("Customer: " + user.name);
        System.out.println("Phone: " + user.phone);
        System.out.println("Email: " + user.email);
        System.out.println("From: " + loc.pickup + " To: " + loc.drop);
        System.out.println("Driver: " + driver.getName() + " | Car: " + driver.getCarModel());
        System.err.println("No. of seats available: "+driver.getSeats());
        System.out.println("Booking Confirmed!");
        System.out.println("----------------------------------");
    }
}
