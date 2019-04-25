import java.util.Scanner;


public class numberCompare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers, separated by a space > ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int smallest;
        if (num1<num2){
            smallest = num1;
        }
        else{
            smallest = num2;
        }
        if (smallest>num3){
            smallest = num3;
        }
        System.out.println("\nThe smallest number is " + smallest );
        boolean a = true;
        System.out.println(a);
    }
}
