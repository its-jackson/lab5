
public class AirlineMain {
    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;

    public AirlineMain() {

    }

    public AirlineMain(String firstName, String lastName, int flightNumber, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatClass() {

        switch (seatNumber) {
            case 1:
                System.out.println("Your Are First Class");
                break;
            case 2:
                System.out.println("Your Are First Class");
                break;
            case 3:
                System.out.println("You Are Second Class");
                break;
            case 4:
                System.out.println("You Are Second Class");
                break;
            case 5:
                System.out.println("You Are Third Class");
                break;
            case 6:
                System.out.println("You Are Third Class");
                break;
            case 7:
                System.out.println("You Are Fourth Class");
                break;
            case 8:
                System.out.println("You Are Fourth Class");
                break;
            default:
                System.out.println("Invald seat number!");
        }
    }

    public void noFly() {
        String firstAndLast = firstName.toLowerCase() + " " + lastName.toLowerCase();
        int blackCode = 9999;

        String noFlyName1 = "Jack Blue";
        if(firstAndLast.equals(noFlyName1.toLowerCase())) {
            System.out.println("CODE " + blackCode);
            for (int i = 0; i < 7; i++) {
                System.out.println("ALERT");
            }
        }
        String noFlyName2 = "Jack Green";
        if (firstAndLast.equals(noFlyName2.toLowerCase())) {
            System.out.println("CODE " + blackCode);
            for (int i = 0; i < 7; i++) {
                System.out.println("ALERT");
            }
        }
        String noFlyName3 = "Jill White";
        if (firstAndLast.equals(noFlyName3.toLowerCase())) {
            System.out.println("CODE " + blackCode);
            for (int i = 0; i < 7; i++) {
                System.out.println("ALERT");
            }
        }

    }

    public void allObjectState() {
        String concatAllVariables = firstName + lastName + flightNumber + seatNumber;

        if(seatNumber <= concatAllVariables.length()) {
            System.out.println("Your portion of the string is: " + concatAllVariables.charAt(seatNumber) + " -because it prints out the index of your seatnumber!");
        }
    }

}
