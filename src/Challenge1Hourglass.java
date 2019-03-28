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
        horizontalLine(9,"+","-","+");
        topCarat(5,"/","*","\\");
        botCarat(5,"\\","*","/");
        horizontalLine(9,"+","-","+");
        botCarat(5,"\\","*","/");
        topCarat(5,"/","*","\\");
        horizontalLine(9,"+","-","+");
    }
    public static void horizontalLine(int length, String startChar, String midChar, String endChar){
        System.out.print(startChar);
        for(int charNumber = 1; charNumber <= length; charNumber++){
            System.out.print(midChar);
        }
        System.out.println(endChar);
    }
    public static void topCarat(int size, String leftChar, String centerChar, String rightChar){

        for(int lineNumber = 1; lineNumber <= size; lineNumber++){
            System.out.print("|");
            for(int spaceNumber = 1; spaceNumber <=size-lineNumber; spaceNumber++){
                System.out.print(" ");
            }
            for(int symbolNumber = 1; symbolNumber<=lineNumber-1; symbolNumber++){
                System.out.print(leftChar);
            }
            System.out.print(centerChar);
            for(int symbolNumber = 1; symbolNumber<=lineNumber-1; symbolNumber++){
                System.out.print(rightChar);
            }
            for(int spaceNumber = 1; spaceNumber <=size-lineNumber; spaceNumber++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
    public static void botCarat(int size, String leftChar, String centerChar, String rightChar){

        for(int lineNumber = 1; lineNumber <= size; lineNumber++){
            System.out.print("|");
            for(int spaceNumber = 1; spaceNumber <=lineNumber-1; spaceNumber++){
                System.out.print(" ");
            }
            for(int symbolNumber = 1; symbolNumber<=size-lineNumber; symbolNumber++){
                System.out.print(leftChar);
            }
            System.out.print(centerChar);
            for(int symbolNumber = 1; symbolNumber<=size-lineNumber; symbolNumber++){
                System.out.print(rightChar);
            }
            for(int spaceNumber = 1; spaceNumber <=lineNumber-1; spaceNumber++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }
}
