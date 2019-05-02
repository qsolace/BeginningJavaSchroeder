import java.util.Scanner;
public class upTo20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a starting integer > ");
        int number = scan.nextInt();
        int newNumber = number;
        while (newNumber != 20){
            if (newNumber>=number) {
                System.out.printf("%d\n\n", newNumber);
            }
            System.out.print("Enter another number > ");
            newNumber=scan.nextInt();
        }
    }
}
