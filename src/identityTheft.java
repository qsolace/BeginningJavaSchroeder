import java.util.Scanner;

/*
Ryan Schroeder
Find someone's name in LAST, FIRST then separate the first and last name
1 April 2019
v1.0
 */

public class identityTheft {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your current identity (Please format your response as LAST, FIRST for easy processing) > ");
        String lastName = scan.next();
        lastName = lastName.substring(0,lastName.length()-1);
        String firstName = scan.next();
        System.out.print("\nSo, your first name is currently " + firstName);
        System.out.println(", and your last name is " + lastName);
        System.out.print("\nWell, now, you're John Smith. Thank you for your purchase, John");

    }
}
