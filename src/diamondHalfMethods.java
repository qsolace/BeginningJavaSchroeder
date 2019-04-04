/*
Ryan Schroeder
Project Diamond
Print a diamond shape using 2 halves
25 March 2019
v1.1
 */



public class diamondHalfMethods {
    public static void main(String[] args){
        //System.out.println("  /\\\n /  \\\n/    \\\n\\    /\n \\  /\n  \\/"); Original diamond printer.
        diamondCreationBot();
        diamondCreationBot();
        diamondInsideOut();
        diamondCreationMethod();

    }
    public static void diamondCreationMethod(){// creating a diamond     /\
        diamondCreationTop();//                                          \/
        diamondCreationBot();
    }
    public static void diamondInsideOut(){//creating an inverse diamond   \/
        diamondCreationBot();//                                           /\
        diamondCreationTop();
    }
    public static void diamondCreationBot(){// creating the bottom part      \/
        System.out.println("\\    /\n \\  /\n  \\/");
    }
    public static void diamondCreationTop(){// creating the top part         /\
        System.out.println("  /\\\n /  \\\n/    \\");
    }
}
