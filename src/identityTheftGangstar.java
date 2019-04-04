import java.util.Scanner;

/*
Ryan Schroeder
Find someone's name in FIRST LAST then separate the first and last name, and make it a janky gangsta name
1 April 2019
v1.0

Scanner tto get input of name
Use index to find the space
make a substring of everything before the space, and one of everything after the space
make an initial using substring(0,1)
change the last name to all caps (.toUpperCase)
print
 */

public class identityTheftGangstar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your current identity (Please format your response as FIRST LAST for easy processing) > ");//prompting the user
        String name = scan.nextLine();//getting the input
        int space = name.indexOf(' ');//finding the space
        String firstName = name.substring(0,space);//separating the first name. use space b/c index close is exclusive
        String lastName = name.substring(space+1);//separating the last name. space + 1 b/c index open is inclusive. No second parameter = to end.
        System.out.println("Your first name is currently \""+firstName);//print the first name
        System.out.println("\" and your last name is currently \""+lastName+"\"");//print the last name
        String firstInitial = name.substring(0,1);//get the first initial of the first name
        firstInitial += ".";//add a '.' at the end
        String capsLastName = lastName.toUpperCase();//change the last name to uppercase
        System.out.println("Your new, unrecognizable name is... "+ firstInitial + " Diddy "+ capsLastName + " " + firstName + "-izzle");//print it all out
        System.out.println("Please transfer the $723,679 via a giant gummy bear.");//charge the user ;)


    }
}
