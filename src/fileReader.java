import java.io.*;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) throws IOException {
        File fileInput = new File("C:\\Users\\ryan_\\IdeaProjects\\BeginningJava\\src\\input");
        Scanner input = new Scanner(fileInput);
        int count = 0;
        while (input.hasNextLine()){
            String line = input.nextLine();
            Scanner forLine = new Scanner(line);
//            while (forLine.hasNext()){
//                String word = forLine.next();
//                if (word.equalsIgnoreCase("allonsy")){
//                    count ++;
//                }
//            }
            while (forLine.hasNext()){

                String word = forLine.next();
                Scanner forWord = new Scanner(word);

                    while (forWord.hasNextInt()){

                        int number = forWord.nextInt();
                        count ++;
                        System.out.println(number);

                    }
            }
            System.out.println(line);
        }
        //System.out.printf("There were %d \"allonsy\"s in the file.",count);
        System.out.printf("There were %d numbers in the file",count);
    }
}
