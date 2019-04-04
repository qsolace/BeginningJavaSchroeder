/*
Ryan Schroeder
Finding 2 passwords, then outputting the length of the shorter one
1 April 2019
v1.0
 */
import java.util.Scanner;
public class stealAPassword {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the password to your phone? > ");
        String phonePassword = scan.next();
        int lengthPhonePassword = phonePassword.length();
        System.out.print("\nWhat is your PIN? > ");
        String  PinNumber = scan.next();
        int lengthPinNumber = PinNumber.length();

        if (lengthPhonePassword < lengthPinNumber){
            System.out.println("\nYour phone's password is " + lengthPhonePassword + " characters long!");
        }
        else {
            System.out.println("\nYour PIN is " + lengthPinNumber + " numbers long!");
        }


    }
}
