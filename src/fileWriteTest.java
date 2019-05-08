import java.io.*;
import java.util.Scanner;
public class fileWriteTest {
    public static void main(String[]args)throws IOException {
        PrintWriter test = new PrintWriter("C:\\Users\\ryan_\\IdeaProjects\\BeginningJava\\src\\testWrite");
        test.println("|----------|");
        test.println("|..........+");
        test.println("|----------|");
        test.close();
        File testRead = new File("C:\\Users\\ryan_\\IdeaProjects\\BeginningJava\\src\\testWrite");
        Scanner scan = new Scanner(testRead);
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
    }
}
