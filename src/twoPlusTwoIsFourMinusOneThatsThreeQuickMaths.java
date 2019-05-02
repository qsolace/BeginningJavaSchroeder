import java.util.Scanner;
public class twoPlusTwoIsFourMinusOneThatsThreeQuickMaths {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = 0, sum=0;
        do{
            sum += number;
            System.out.print("Enter an integer. Enter -1 to stop > ");
            number = scan.nextInt();
        } while(number!=-1);
        System.out.printf("The sum of those numbers is %d",sum);
    }
}
