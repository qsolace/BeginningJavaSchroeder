import java.util.Scanner;
public class wordToSentence {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String sentence = "";
        String word = "";
        while (!word.equalsIgnoreCase("end")){
            sentence += word.trim();
            sentence += " ";
            System.out.print("Enter a word. Enter end to terminate the program > ");
            word = scan.next();
        }
        sentence = sentence.trim();
        System.out.print(sentence);
    }
}
