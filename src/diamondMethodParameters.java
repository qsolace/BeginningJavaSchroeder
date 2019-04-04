
/*
Ryan Schroeder
Project Diamond
Print a diamond shape using 2 halves. Use methods and functions
26 March 2019
v1.2
 */



public class diamondMethodParameters {
    public static final int SIZE_OF_PYRAMID = 13;//constant for how many lines the pyramid is.
    public static void main(String[] args){

        System.out.println();
        automatedTopPrint(5);
        automatedBotPrint(5);
        diamondCreationMethod(3);
        diamondInsideOut(6);
    }
    public static void diamondCreationMethod(int size){// creating a diamond     /\
        automatedTopPrint(size);                         //                      \/
        automatedBotPrint(size);
    }
    public static void diamondInsideOut(int size){//creating an inverse diamond   \/
        automatedBotPrint(size);                         //                   /\
        automatedTopPrint(size);
    }
    //Don't need that \/ as I have the other ones.

    //    public static void diamondCreationBot(){// creating the bottom part      \/
//        System.out.println("\\    /\n \\  /\n  \\/");
//    }
//    public static void diamondCreationTop(){// creating the top part         /\
//        System.out.println("  /\\\n /  \\\n/    \\");
//    }
    public static void automatedTopPrint(int size) {// printing the /\
        for (int counter = 1; counter <= size; counter++) {//for each line of the diamond
            for (int space = 1; space <= -counter + size; space++) {//prints a # of spaces = size-line#
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
    public static void automatedBotPrint(int size){
        for(int counter=1; counter <= size; counter++)//each line of diamond
        {
            for(int space=1; space <= counter-1; space++){//Spaces equal to line# + 1
                System.out.print(" "); //ex: line 5, size 17: 5 - 1 = 4 spaces
            }
            System.out.print("\\");// print the "\"

            for(int space = 1; space <= (size-1)*2-(counter-1)*2; space++)//amount of spaces between the "\" and the "/"
            {//a number equal to (size - 1) x 2 - (line# -1) x 2
                System.out.print(" "); //ex: line 5, size 17: (17 - 1) x 2 - (5 - 1) x 2
            }//                               (16 x 2) - (4 x 2) ----> 32 - 8 ----> 24 spaces
            System.out.println("/");

        }
    }
}
