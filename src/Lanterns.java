/*
Ryan Schroeder
Lanterns: Test 100 Yay!
31 March 2019
v1.0

method for top of lantern
 */

public class Lanterns {
    public static void main(String[] args){
    topLantern();//all the prints!
    System.out.println();
    topLantern();
    System.out.println("* | | | | | *");
    System.out.println("*************");
    topLantern();
    }
    public static void topLantern(){//method for lantern top.
        for (int spaces = 1; spaces<= 4; spaces++){
            System.out.print(" ");//the spaces before the *s
        }
        for (int asterisks = 1; asterisks <= 5; asterisks++){
            System.out.print("*");//the *s
        }
        System.out.println();//next line
        for (int spaces = 1; spaces<= 2; spaces++){
            System.out.print(" ");//the spaces
        }
        for (int asterisks = 1; asterisks<=9; asterisks++){
            System.out.print("*");//the *
        }
        System.out.println();//next line
        for (int asterisks = 1; asterisks <= 13; asterisks++){
            System.out.print("*");//*s. No spaces in this line
        }
        System.out.println();//next line
    }
}
