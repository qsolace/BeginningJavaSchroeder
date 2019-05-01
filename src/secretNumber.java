import java.util.Scanner;
import java.util.Random;
public class secretNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int guesses = 1;
        int inputNumber;
        int readingRandy = random.nextInt(101);
        boolean isRight = false;
        while (!isRight){
            System.out.print("Try and guess the random number between 1 and 100 (inclusive) > ");
            inputNumber = scan.nextInt();
            if (inputNumber < 1 || inputNumber > 100) {
                System.out.println("\nYou are a horrible person. That number isn't between 1 and 100!\n");

            }
            else {
                if (inputNumber == readingRandy){
                    System.out.print("\nYay! You were right! It took you " + guesses+ " guesses");
                    isRight = true;
                }
                else{
                    if (inputNumber<readingRandy){
                        System.out.println("The number is greater than your guess. This was attempt #"+guesses+"\n");
                    }
                    else{
                        System.out.println("The number is less than your guess. This was attempt #"+guesses+"\n");
                    }
                    guesses++;
                }
            }
        }
    }
}
