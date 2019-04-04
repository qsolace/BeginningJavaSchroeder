import java.util.Scanner;

/*
Ryan Schroeder
find the extension of a file
1 April 2019
v1.0
 */

public class fileVirusPirateYay {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What file would you like to pirate? > ");
        String piratedFile = scan.next();
        int indexOfDot = piratedFile.indexOf('.');
        String piratedFileType = piratedFile.substring(indexOfDot);
        System.out.print("\nWe do not accept file type "+ piratedFileType);
    }
}
