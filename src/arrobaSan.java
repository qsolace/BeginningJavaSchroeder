import java.util.Scanner;
public class arrobaSan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String response;
        do{
            System.out.print("Enter a word with a @ > ");
            response=scan.next();
        } while (response.indexOf('@')==-1);
        System.out.print(response);
    }
}
