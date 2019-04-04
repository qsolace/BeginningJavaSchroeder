/*
Ryan Schroeder
Print a string in all caps, then all lower case
1 April 2019
v1.0
 */

import java.util.Scanner;

public class caseByCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Say something (I'm giving up on you) > ");
        String sillyString = scan.next();
        System.out.println("\n" + sillyString.toUpperCase());
        System.out.println(sillyString.toLowerCase());
        System.out.print(sillyString);
    }
}
