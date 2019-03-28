/*
Ryan Schroeder
Project Hourglass
27 March 2019
v1.0

print +--+ line
    size*2+1


make top program
    pipette: always print first!
    spaces: size - 1 - line# <-- declare as var before!
    bracket: line# - 1
    star: print the stars
    bracket: line# - 1
    space: use the var of the other one
    pipette: print it. no variation

make bottom program
    pipette: always print first!
    spaces:  line#
    bracket: size - 1
    star: print the stars
    bracket: size - 1
    space: line#
    pipette: print it. no variation
+--+
|/\|
|\/|
+--+
|\/|
|/\|
+--+

 */



public class Challenge1Hourglass {
    public static void main(String[] args){
        horizontalLine(9,"+","-","+");//bruteforce adding everything in.
        topCarat(5,"/","*","\\");//may add variable for size
        botCarat(5,"\\","*","/");
        horizontalLine(9,"+","-","+");
        botCarat(5,"\\","*","/");
        topCarat(5,"/","*","\\");
        horizontalLine(9,"+","-","+");
    }
    public static void horizontalLine(int length, String startChar, String midChar, String endChar){// the method for the +--+
        System.out.print(startChar);// this is for the first "+" you can change it to anything, as I left that up to parameters
        for(int charNumber = 1; charNumber <= length; charNumber++){
            System.out.print(midChar);//the "--" Also left the length up to the parameters. Otherwise, standard for loop.
        }
        System.out.println(endChar);// final "+"
    }
    public static void topCarat(int size, String leftChar, String centerChar, String rightChar){// method for the /\

        for(int lineNumber = 1; lineNumber <= size; lineNumber++){
            System.out.print("|");//start with the framing box. Maybe have this as a boolean if statement
            for(int spaceNumber = 1; spaceNumber <=size-lineNumber; spaceNumber++){//number of spaces
                System.out.print(" ");// # of space = size of the shape - line#
                //                       ex: size 17, line 5: 17 - 5 = 12 spaces
            }
            for(int symbolNumber = 1; symbolNumber<=lineNumber-1; symbolNumber++){//the number of //s
                System.out.print(leftChar);// # = line# -1
                //                       ex: size 17, line 5: 5 - 1 = 4 /s
            }
            System.out.print(centerChar);//prints the central "*" also may put this in an if
            for(int symbolNumber = 1; symbolNumber<=lineNumber-1; symbolNumber++){// puts all the \s
                System.out.print(rightChar);// # = line# -1
            }
            for(int spaceNumber = 1; spaceNumber <=size-lineNumber; spaceNumber++){// spaces
                System.out.print(" ");// line# - 1
            }
            System.out.println("|");//closing pipette, then breaking the line
        }

    }
    public static void botCarat(int size, String leftChar, String centerChar, String rightChar){// the bottom part \/

        for(int lineNumber = 1; lineNumber <= size; lineNumber++){
            System.out.print("|");//first pipette
            for(int spaceNumber = 1; spaceNumber <=lineNumber-1; spaceNumber++){//number of spaces
                System.out.print(" ");// # = line# - 1
                //                     ex: size = 17, line = 5: 5 - 1 = 4 spaces
            }
            for(int symbolNumber = 1; symbolNumber<=size-lineNumber; symbolNumber++){// numbers of \s
                System.out.print(leftChar);// # = size - line#
                //                         ex: size = 17, line = 5: 17 - 5 = 12 \s
            }
            System.out.print(centerChar);// the "*"
            for(int symbolNumber = 1; symbolNumber<=size-lineNumber; symbolNumber++){// the /s
                System.out.print(rightChar);// # = size - line#
                //                         ex: size = 17, line = 5: 17 - 5 = 12 \s
            }
            for(int spaceNumber = 1; spaceNumber <=lineNumber-1; spaceNumber++){// spaces
                System.out.print(" ");// # = line# - 1
                //                      ex: size = 17, line = 5: 5 - 1 = 4 spaces
            }
            System.out.println("|");// final pipette
        }

    }
}
