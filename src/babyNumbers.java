import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class babyNumbers {
    public static void main(String[] args)throws IOException {
        String name, listOfNames="";
        int searchDate, dateNumber=1;
        int babies=0, searchBabies;
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



        System.out.print("Enter the amount of babies > ");
        searchBabies = scan.nextInt();


        while (nameScan.hasNextLine()){
            Scanner lineScan = new Scanner(nameScan.nextLine());
            name = lineScan.next();
            for(int i=0; i<=dateNumber; i++){
                babies = lineScan.nextInt();
            }
            if(babies==searchBabies){
                listOfNames = name +", ";
            }

        }
        System.out.println();
        if (listOfNames.length()>0) {
            listOfNames = listOfNames.substring(0, listOfNames.length() - 2);
            if (listOfNames.indexOf(',') != -1) {
                System.out.printf("The names %s all have %d babies in %d", listOfNames, searchBabies, searchDate);
            }
            else{
                System.out.printf("The name %s had %d babies in %d",listOfNames, searchBabies, searchDate);
            }
        }
        else{
            System.out.println("There were no names that had that specification.");
        }
    }
}
