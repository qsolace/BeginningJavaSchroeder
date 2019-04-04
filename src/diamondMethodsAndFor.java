/*
Ryan Schroeder
Project Diamond
Print a diamond shape using 2 halves
25 March 2019
v1.1
 */



public class diamondMethodsAndFor {
    public static final int SIZE_OF_PYRAMID = 13;//constant for how many lines the pyramid is.
    public static void main(String[] args){

        System.out.println();
        automatedTopPrint();
        automatedBotPrint();
    }
    public static void diamondCreationMethod(){// creating a diamond     /\
        automatedTopPrint();                         //                  \/
        automatedBotPrint();
    }
    public static void diamondInsideOut(){//creating an inverse diamond   \/
        automatedBotPrint();//                                           /\
        automatedTopPrint();
    }
    //Don't need that \/ as I have the other ones.

//    public static void diamondCreationBot(){// creating the bottom part      \/
//        System.out.println("\\    /\n \\  /\n  \\/");
//    }
//    public static void diamondCreationTop(){// creating the top part         /\
//        System.out.println("  /\\\n /  \\\n/    \\");
//    }
    public static void automatedTopPrint() {// printing the /\
        for (int counter = 1; counter <= SIZE_OF_PYRAMID; counter++) {//for each line of the diamond
            for (int space = 1; space <= -counter + SIZE_OF_PYRAMID; space++) {//prints a # of spaces = size-line#
                System.out.print(" ");//                           ex: line 5, size 17 = 17-5 --> prints 12 spaces
            }
            System.out.print("/");//finish with a /

            for (int space = 1; space <= (counter - 1) * 2; space++) {//prints spaces in between the "/" and the "\"
                //# of space equal to (line# - 1) x 2
                System.out.print(" ");//    ex: line 5, size 17 = (5 - 1) x 2 --> 8 spaces
            }
            System.out.println("\\");// print the \. Need two otherwise it's a trigger for \n,\t,\", etc
        }
    }
    public static void automatedBotPrint(){
        for(int counter=1; counter <= SIZE_OF_PYRAMID; counter++)//each line of diamond
        {
            for(int space=1; space <= counter-1; space++){//Spaces equal to line# + 1
                System.out.print(" "); //ex: line 5, size 17: 5 - 1 = 4 spaces
            }
            System.out.print("\\");// print the "\"

            for(int space = 1; space <= (SIZE_OF_PYRAMID-1)*2-(counter-1)*2; space++)//amount of spaces between the "\" and the "/"
            {//a number equal to (size - 1) x 2 - (line# -1) x 2
                System.out.print(" "); //ex: line 5, size 17: (17 - 1) x 2 - (5 - 1) x 2
            }//                               (16 x 2) - (4 x 2) ----> 32 - 8 ----> 24 spaces
            System.out.println("/");

        }
    }
}
