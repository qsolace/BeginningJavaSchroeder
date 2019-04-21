/*
Ryan Schroeder
21 April 2019
requesting date and printing it (with other stuff)
 */
import java.util.Scanner;
public class datePrint {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a date > ");
        String date = scan.nextLine();
        char firstLetter = date.charAt(0);
        String lowercase = date.toLowerCase();
        String year = date.substring(date.indexOf(',')+2);
        System.out.println("\nThe first letter of the month is: \'"+firstLetter+"\'");
        System.out.println("The date in all lower case is: "+lowercase);
        System.out.println("The year is: "+year);

    }
}
