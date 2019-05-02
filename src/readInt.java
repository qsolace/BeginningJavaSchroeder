import java.io.*;
import java.util.Scanner;
public class readInt {
    public static void main(String[] args) throws IOException {
        File newFile = new File( "C:\\Users\\ryan_\\IdeaProjects\\BeginningJava\\src\\integers");
        Scanner integers = new Scanner(newFile);
        int number =0;

        while (integers.hasNextInt()){
            number += integers.nextInt();

        }
        System.out.print(number);
    }
}
