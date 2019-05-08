/*
Ryan Schroeder
8 May 2019

Scan for double.
Add to total
 */
import java.util.Scanner;
public class cashierv2 {
    public static void main(String[] args){
        double totalPrice = 0, cost = 0;
        int totalItems = -1;
        String input ="0";

        Scanner scan = new Scanner(System.in);

        do{
            cost = Double.parseDouble(input);
            totalItems++;
            totalPrice+=cost;
            System.out.println("Enter the item cost. When you finish, type \"NO\" > ");
            input=scan.next();
        }while (!input.equalsIgnoreCase("no"));
        System.out.printf("You bought %d items and the total cost was $%.2f",totalItems,totalPrice);
    }
}
