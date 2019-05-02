import java.io.*;
import java.util.Scanner;
public class doubleReadingGlasses {
    public static void main(String[]args) throws IOException{
        File doubles = new File("C:\\Users\\ryan_\\IdeaProjects\\BeginningJava\\src\\doubles");
        Scanner readingGlasses = new Scanner(doubles);
        double sum=0, average, count=0;
        while(readingGlasses.hasNextDouble()){
            sum += readingGlasses.nextDouble();
            count++;
        }
        average = sum/count;
        System.out.print(average);
    }
}
