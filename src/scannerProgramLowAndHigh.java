import java.util.Scanner;
public class scannerProgramLowAndHigh {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose a number. This will be the \"low\" value. > ");
            int low = scan.nextInt();
            System.out.print("Choose a different number. Iht should be larger than the other number. > ");
            int high = scan.nextInt();
            int sum = 0;
            for (int i = low; i <= high; i++) {
                sum += i;
            }
            System.out.println("sum = " + sum);
        }
}
