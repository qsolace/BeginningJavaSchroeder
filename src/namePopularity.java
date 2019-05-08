/*
Ryan Schroeder
8 May 2019
Name Checker

Access file:
read next. If .equals input:
read the ints. Store in y1900, y1910, y1920... y2000
print these values.
Average the values, and round.
Search by int.
 */

import java.io.*;
import java.util.Scanner;
public class namePopularity {
    public static void main(String[] args)throws IOException{
        String name, searchName;
        int y1900 = -1, y1910=-1, y1920=-1, y1930=-1, y1940=-1, y1950=-1, y1960=-1, y1970=-1, y1980=-1, y1990=-1, y2000=-1;

        File nameList = new File("C:\\Users\\ryan_\\OneDrive\\Desktop\\Greenhill-DESKTOP-7HM548H\\9th Grade\\JAVA!!!\\names.txt");
        Scanner scan = new Scanner(System.in);
        Scanner nameScan = new Scanner (nameList);

        System.out.printf("Enter a name > ");
        searchName = scan.next();

        while (nameScan.hasNextLine()){
            Scanner lineScan = new Scanner(nameScan.nextLine());
            name = lineScan.next();
            if (name.equalsIgnoreCase(searchName)){
                y1900=lineScan.nextInt();
                y1910 = lineScan.nextInt();
                y1920=lineScan.nextInt();
                y1930 = lineScan.nextInt();
                y1940=lineScan.nextInt();
                y1950 = lineScan.nextInt();
                y1960=lineScan.nextInt();
                y1970 = lineScan.nextInt();
                y1980=lineScan.nextInt();
                y1990 = lineScan.nextInt();
                y2000=lineScan.nextInt();
                break;
            }
        }
        System.out.println();
        if(y1900==-1){
            System.out.printf("The name %s was not in the system.\n",searchName);
        }
        else{
            int avg = (y1900+y1910+y1920+y1930+y1940+y1950+y1960+y1970+y1980+y1990+y2000)/110;

            System.out.printf("The name %s was found. Here is some information: \n\n",searchName);

            System.out.printf("There were %d of those names from 1900-1910\n",y1900);
            System.out.printf("There were %d of those names from 1910-1920\n",y1910);
            System.out.printf("There were %d of those names from 1920-1930\n",y1920);
            System.out.printf("There were %d of those names from 1930-1940\n",y1930);
            System.out.printf("There were %d of those names from 1940-1950\n",y1940);
            System.out.printf("There were %d of those names from 1950-1960\n",y1950);
            System.out.printf("There were %d of those names from 1960-1970\n",y1960);
            System.out.printf("There were %d of those names from 1970-1980\n",y1970);
            System.out.printf("There were %d of those names from 1980-1990\n",y1980);
            System.out.printf("There were %d of those names from 1990-2000\n",y1990);
            System.out.printf("There were %d of those names from 1200-2010\n\n",y2000);

            System.out.printf("The average for %s was %d babies a year", searchName,avg);

        }

    }
}
