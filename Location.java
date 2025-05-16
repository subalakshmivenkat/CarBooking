import java.util.Scanner;

public class Location {
    String pickup, drop;

    public void getLocations() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pickup Location: ");
        pickup = sc.nextLine();
        System.out.print("Enter Drop Location: ");
        drop = sc.nextLine();
    }
}
