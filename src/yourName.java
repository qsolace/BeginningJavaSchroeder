/*
Ryan Schroeder
21 April 2019
requesting name and printing it
 */

import java.util.Scanner;

public class yourName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? > ");
        String name = scan.nextLine();
        System.out.println("\nYour name is "+name);
    }
}
