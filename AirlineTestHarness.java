import java.util.Scanner;

public class AirlineTestHarness {
    public static void main(String [] args) {
        // objects
        AirlineMain airLineObj = new AirlineMain("Jack", "Blue", 192, 4);
        AirlineMain airLineObj2 = new AirlineMain();
        Scanner in = new Scanner(System.in);

        System.out.println("Your first name: " + airLineObj.getFirstName());
        System.out.println("Your last name: " + airLineObj.getLastName());
        System.out.println("Your flight number: " + airLineObj.getFlightNumber());
        System.out.println("Your seat number: " + airLineObj.getSeatNumber());
        airLineObj.noFly();
        airLineObj.setSeatClass();
        airLineObj.allObjectState();

        System.out.println("Enter First Name, Last Name, Flight Number, Seat Number:");
        airLineObj2.setFirstName(in.nextLine());
        airLineObj2.setLastName(in.nextLine());
        airLineObj2.setFlightNumber(in.nextInt());
        airLineObj2.setSeatNumber(in.nextInt());

        System.out.println("Your first name: " + airLineObj2.getFirstName());
        System.out.println("Your last name: " + airLineObj2.getLastName());
        System.out.println("Your flight number: " + airLineObj2.getFlightNumber());
        System.out.println("Your seat number: " + airLineObj2.getSeatNumber());
        airLineObj2.noFly();
        airLineObj2.setSeatClass();
        airLineObj2.allObjectState();
    }
}
