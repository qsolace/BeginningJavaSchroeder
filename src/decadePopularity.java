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
        int y1900 = -1, y1910=-1, y1920=-1, y1930=-1, y1940=-1, y1950=-1, y1960=-1, y1970=-1, y1980=-1, y1990=-1, y2000=-1, searchDate, dateNumber=1;
        int bestNumber=0, names=0;
        File nameList = new File("C:\\Users\\ryan_\\OneDrive\\Desktop\\Greenhill-DESKTOP-7HM548H\\9th Grade\\JAVA!!!\\names.txt");
        Scanner scan = new Scanner(System.in);
        Scanner nameScan = new Scanner (nameList);

        System.out.printf("Enter a decade from 1900-2000 > ");
        searchDate = scan.nextInt();
        dateNumber=(searchDate-1900)/10;
        while (nameScan.hasNextLine()){
            System.out.println("hi");
            Scanner lineScan = new Scanner(nameScan.nextLine());
            name = lineScan.next();

            for(int i=0; i<=dateNumber; i++){
                names = lineScan.nextInt();
            }
            if (names>bestNumber){
                bestName=name;
            }
        }
        System.out.printf("The most popular name during that decade was %s with %d names", bestName, bestNumber);
    }
}
