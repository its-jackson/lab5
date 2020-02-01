import java.util.Scanner;

public class AirLineTestHarness {
    public static void main(String [] args) {
        // objects instantiated from class AirlineMain and Scanner
        AirLineReservation airLineObj = new AirLineReservation("Jack", "Blue", 3099, 29);
        AirLineReservation airLineObj2 = new AirLineReservation();
        Scanner in = new Scanner(System.in);

        System.out.println("Your first name: " + airLineObj.getFirstName());
        System.out.println("Your last name: " + airLineObj.getLastName());
        System.out.println("Your flight number: " + airLineObj.getFlightNumber());
        System.out.println("Your seat number: " + airLineObj.getSeatNumber());
        System.out.println(airLineObj.findSeatClass(airLineObj.getSeatNumber()));
        System.out.println(airLineObj.allObjectState());
        System.out.println(airLineObj.noFlyList());
        
        


        System.out.println("Enter First Name, Last Name, Flight Number, Seat Number:");
        airLineObj2.setFirstName(in.nextLine());
        airLineObj2.setLastName(in.nextLine());
        airLineObj2.setFlightNumber(in.nextInt());
        airLineObj2.setSeatNumber(in.nextInt());

        System.out.println("Your first name: " + airLineObj2.getFirstName());
        System.out.println("Your last name: " + airLineObj2.getLastName());
        System.out.println("Your flight number: " + airLineObj2.getFlightNumber());
        System.out.println("Your seat number: " + airLineObj2.getSeatNumber());
        System.out.println(airLineObj2.findSeatClass(airLineObj2.getSeatNumber()));
        System.out.println(airLineObj2.allObjectState());
        System.out.println(airLineObj2.noFlyList());
        
        



    }
}
