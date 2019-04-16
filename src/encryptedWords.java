/*
first five characters. Even index. (0,2,4,6,8)
0-95 = ascii characters
Hiejlzl3ow
 */
import java.util.Random;
public class encryptedWords {

    public static void main(String[] args){
      //  System.out.println(decoder("Hiejlzl3o"));
        String message = "Yeah. No. I'll Pass";
        String encodedMessage = encoder(message);
       // System.out.println(message);
        System.out.println(encodedMessage);
//        System.out.println(decoder(encodedMessage));
//        System.out.println(encoder("                                                                                  "));
    }
    public static String decoder(String encodedMessage){
        String decodedMessage="";
        int stringLength = encodedMessage.length();
        for (int x = 0; x < stringLength; x+=1){
            if (x%2==0){
                decodedMessage += encodedMessage.substring(x,x+1);
            }

        }

        return decodedMessage;
    }
    public static String encoder(String message){
        Random random = new Random();
        String encodedMessage = "";
        char randomChar;

        for (int x = 1; x<= message.length(); x+=1){
                randomChar = (char)(random.nextInt(94)+33);
                encodedMessage+= message.substring(x-1,x);
                encodedMessage+= randomChar;
        }
        return encodedMessage;
    }
}
