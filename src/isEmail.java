import java.util.Scanner;
public class isEmail {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Put in your email to support a Nigerian prince! > ");
        String email = scan.nextLine();
        if (email.indexOf('@') != -1){
            System.out.print("\nThank you for your contribution.");
        }
        else{
            System.out.print("\nSorry, that's not an email");
        }
    }
}
