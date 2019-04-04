/*
Ryan Schroeder
adding the "www." and ".com" to a domain name
1 April 2019
v1.0
 */

import java.util.Scanner;

public class domainName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a domain name > ");
        String domain = scan.next();
        System.out.print("\nThe Internet domain name is www." + domain + ".com");
    }
}
