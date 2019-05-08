import java.io.*;
import java.util.Scanner;

public class shopperScan {
    public static void main(String[] args)throws IOException{
        File file = new File ("C:\\Users\\ryan_\\IdeaProjects\\BeginningJava\\src\\shopping");
        Scanner totalFile = new Scanner(file);
        while (totalFile.hasNextLine()){
            Scanner line = new Scanner(totalFile.nextLine());
            String item = line.next();
            double avgCost =0;
            int count =0;

            while (line.hasNextDouble()){
                avgCost+=line.nextDouble();
                count++;
            }
            if (count!=0) {
                System.out.printf("The average cost of %s is $%.2f\n", item, avgCost / count);
            }
            else{
                System.out.printf("There were no prices for %s\n", item);
            }
        }
    }
}
