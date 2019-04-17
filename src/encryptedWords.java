/*
first five characters. Even index. (0,2,4,6,8)
0-95 = ascii characters
Hiejlzl3ow
 */
import java.util.Random;
public class encryptedWords {

    public static void main(String[] args){
        String message = "Yeah. No. I'll Pass";
        String encodedMessage = encoder(message);//doing some encryptng
        System.out.println(encodedMessage);

    }
    public static String decoder(String encodedMessage){
        String decodedMessage="";
        int stringLength = encodedMessage.length();//finds the length of the string
        for (int x = 0; x < stringLength; x+=1){//goes on for every char of string
            if (x%2==0){//every other char
                decodedMessage += encodedMessage.substring(x,x+1);//add that char to the decoded message
            }

        }

        return decodedMessage;
    }
    public static String encoder(String message){
        Random random = new Random();//need some randomization!
        String encodedMessage = "";
        char randomChar;

        for (int x = 1; x<= message.length(); x+=1){//do it for every character
                randomChar = (char)(random.nextInt(94)+33);//determining the random char (need to typecast into char, only using a-z, A-Z, and some symbols)
                encodedMessage+= message.substring(x-1,x);//add the char from the original string
                encodedMessage+= randomChar;//add the random char
        }
        return encodedMessage;
    }
}
