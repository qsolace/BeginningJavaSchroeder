import java.util.Scanner;
import java.lang.Character;
public class validIdentifier {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the start of your identifier > ");
            String line = scan.next();
            Character start = line.charAt(0);
            if (Character.isLetter(start)){
                System.out.print("\nThat is a valid start");
            }
            else{
                System.out.print("\nThat's no bueno...");
            }
        }
}
