import java.util.Scanner;
public class userID {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your user ID > ");
        String id = scan.next();
        if (id.length()>=6&&id.length()<=10){
            System.out.print("\nWelcome, "+id);
        }
        else{
            System.out.print("That's just wrong...");
        }
    }
}
