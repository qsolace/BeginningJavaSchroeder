import java.util.Scanner;
public class battingAverage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of hits and number of times at bat > ");
        int hits = scan.nextInt();
        int bats = scan.nextInt();
        double average = (double)(hits)/bats;
        if (average>.3){
            System.out.println("\nThat batter is qualified for the All-Stars with a batting average of "+average);
        }
        else{
            System.out.println("\nThat batter is a bot, with a batting average of "+average);
        }
    }
}
