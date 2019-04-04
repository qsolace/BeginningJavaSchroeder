import java.util.Scanner;
public class numberingShortChange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Given there are 345,623,563 cheese curds in each of the 6 cheese curd producing states, but 23 companies each produce 23415-709685 curds in 2-4 baskets, give me three numbers separated by a space > ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int largeNumber = Math.max(firstNumber,secondNumber);
        largeNumber = Math.max(largeNumber,thirdNumber);
        System.out.println("\nThe correct answer was " + largeNumber);
    }
}
