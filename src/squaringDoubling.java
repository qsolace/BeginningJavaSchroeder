import java.util.Scanner;
public class squaringDoubling {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Bubble gum, bubble gum, in a dish, how many pieces do you wish. Then multiply that number by " + (Math.random()+ Math.random()*7) + " > ");
            double doublingDoubles = scan.nextDouble();
            System.out.println("\nThis is how many days you have to live: " + Math.pow(doublingDoubles,3));
            System.out.println(Math.PI);
    }
}
