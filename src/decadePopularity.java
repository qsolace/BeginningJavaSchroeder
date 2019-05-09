/*
Ryan Schroeder
8 May 2019

Compare name in certain spot
Print the most popular
 */
import java.util.Scanner;
import java.io.*;

public class decadePopularity {
    public static void main (String[] args)throws IOException{
        String name, bestName="";
        int searchDate, dateNumber=1;
        int bestNumber=0, names=0;
        File nameList = new File("C:\\Users\\ryan_\\OneDrive\\Desktop\\Greenhill-DESKTOP-7HM548H\\9th Grade\\JAVA!!!\\names.txt");
        Scanner scan = new Scanner(System.in);
        Scanner nameScan = new Scanner (nameList);

        System.out.printf("Enter a decade from 1900-2000 > ");
        searchDate = scan.nextInt();
        dateNumber=(searchDate-1900)/10;
        if(dateNumber>10||dateNumber<0) {
            System.err.println("That isn't a valid date");
            System.exit(1);
        }

        while (nameScan.hasNextLine()){
            System.out.println("hi");
            Scanner lineScan = new Scanner(nameScan.nextLine());
            name = lineScan.next();

            for(int i=0; i<=dateNumber; i++){
                names = lineScan.nextInt();
                System.out.println("name: "+names);
                System.out.println("name: "+bestNumber);
            }
            if (names>bestNumber){
                bestName=name;
                bestNumber=names;
            }
        }
        System.out.printf("The most popular name during that decade was %s with %d names", bestName, bestNumber);
    }
}
