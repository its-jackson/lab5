/**
 * lab 5 
 * jackson johnson
 * february 1st 2020
 * 11:39am
 * github.com/its-jackson/lab5
 * javadocs dialog frame https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
 * javadocs arrays https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#asList(T...)
 */

import javax.swing.*;
import java.util.Arrays;

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
    
    // your seat class based off your seatNumber
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
            default: flightGrade = "Economy Class";
                    break;
        }
        return flightGrade;
    } 
    
    // no fly list checker - if your first name & last name = jack blue or jack green or jill white, case does not matter.
    public String noFlyList() {
        String firstAndLast = firstName.toLowerCase() + " " + lastName.toLowerCase();
        String code = "";
        String[] noFlyNames = {"jack blue", "jack green", "jill white"}; // array list contains no fly names
        JOptionPane frame = new JOptionPane(); // instantiate JOptionPane from swing class
        
        if(Arrays.asList(noFlyNames).contains(firstAndLast)) { // does the array contain the string firstname + lastName
            code = "9999";
            for (int i = 0; i < 7; i++) {
                JOptionPane.showMessageDialog(frame, "ALERT", "CODE 9999", frame.WARNING_MESSAGE); // set dialog message to "ALERT" - title is "CODE 9999" - give frame WARNING
                System.out.println("ALERT");
            }
        }

        return code;
    }
    
    // isolate digit 1 and digit 2 then utilize substring() to find portion of string based off the first and second digit of seatNumber
    // x = int seatNumber converted to type String
    public String allObjectState() {
        String allStateVariables = firstName + lastName + flightNumber + seatNumber; // all state concatenated
        String portionOfString = ""; // portion of string to be printed on screen
        String x = Integer.toString(seatNumber); // convert int seatNumber to String type
        String firstDigitString = x.substring(0, 1); // isolate first digit of seatNumber 
        String secondDigitString; // isolate second digit of seatNumber
        int firstDigit = Integer.parseInt(firstDigitString);  // convert first digit of seatNumber to int
         
        
        if(seatNumber <= 9 || seatNumber >= 100) { // check if seatnumber is two digits if not do not return portion of string
            portionOfString = "MUST BE 2 DIGIT NUMBER";
        } else if (seatNumber >= 10 && seatNumber <= 99) { // checks if seat number is 2 digit number
            secondDigitString = x.substring(1, 2); // if seatnumber is 2 digit number isolate the second digit
            int secondDigit = Integer.parseInt(secondDigitString); // then convert back to int type to find the portion of string based off the second number
                if (secondDigit < allStateVariables.length()) { // if second digit is less then length of allstatevariables
                    if(firstDigit < secondDigit) { //  AND if the first digit is less than the second digit
                        portionOfString = allStateVariables.substring(firstDigit, secondDigit); // return the portion of the string based off the first and last digits of seatNumber e.g 19 = 1, 9 = ndreafra
                    }
            }
        }
        
        return portionOfString;   
    } 

}
