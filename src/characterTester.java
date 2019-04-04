import java.util.Scanner;
public class characterTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a character > ");
        String userInput = scan.next();
        char character = userInput.charAt(0);
        System.out.println("\n"+Character.isLetter(character));
    }
}
