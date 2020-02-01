
public class AirLineReservation {
    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;

    public AirLineReservation() {

    }

    public AirLineReservation(String firstName, String lastName, int flightNumber, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String findSeatClass(int seatNumber) {
        String flightGrade = "";
        
        switch(seatNumber) {
            case 1: flightGrade = "First Class";
                    break;
            case 2: flightGrade = "First Class";
                    break;
            case 3: flightGrade = "Second Class";
                    break;
            case 4: flightGrade = "Second Class";
                    break;
            case 5: flightGrade = "Third Class";
                    break;
            case 6: flightGrade = "Third Class";
                    break;
            case 7: flightGrade = "Fourth Class";
                    break;
            case 8: flightGrade = "Fourth Class";
                    break;
            default: flightGrade = "Eco Class";
                    break;
        }
        return flightGrade;
    } 

    public String noFlyList() {
        String firstAndLast = firstName.toLowerCase() + " " + lastName.toLowerCase();
        String code = "";

        String noFlyName1 = "Jack Blue";
        if(firstAndLast.equals(noFlyName1.toLowerCase())) {
            code = "9999";
            for (int i = 0; i < 7; i++) {
                System.out.println("ALERT");
            }
        }
        String noFlyName2 = "Jack Green";
        if (firstAndLast.equals(noFlyName2.toLowerCase())) {
            code = "9999";
            for (int i = 0; i < 7; i++) {
                System.out.println("ALERT");
            }
        }
        String noFlyName3 = "Jill White";
        if (firstAndLast.equals(noFlyName3.toLowerCase())) {
            code = "9999";
            for (int i = 0; i < 7; i++) {
                System.out.println("ALERT");
            }
        }
        return code;
    }
    
    
    // isolate digit 1 and digit 2 then utilize substring() to find portion of string based off the first and second digit of seatNumber
    public String allObjectState() {
        String allStateVariables = firstName + lastName + flightNumber + seatNumber; // all state concatenated
        String portionOfString = ""; // portion of string to be printed on screen
        String x = Integer.toString(seatNumber); // convert int seatNumber to String type
        String y = x.substring(0, 1); // find first digit of seatNumber
        String z = x.substring(1, 2); // find second digit of seatNumber
        int i = Integer.parseInt(y);  // convert first digit of seatNumber to int
        int w = Integer.parseInt(z); // convert second digit of seatNumber to int
        
        if (z.length() < allStateVariables.length()) {
            portionOfString = allStateVariables.substring(i, w);
        }
        
        return portionOfString;   
    } 

}
