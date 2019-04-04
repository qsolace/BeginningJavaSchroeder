/*
Ryan Schroeder
Project NASA
Print a rocket shape using methods
25 March 2019
v2.0
 */




public class rocketShipMethods {
    public static void main(String[] args){
        //System.out.println("  /\\\n /  \\\n/    \\\n\\    /\n \\  /\n  \\/"); Original diamond printer.
        diamondCreationMethod();
        diamondInsideOut();
        diamondCreationTop();
        squareCreation();
        System.out.println("|United|\n|States|");
        squareCreation();
        diamondCreationTop();

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
        System.out.println(" \\    /\n  \\  /\n   \\/");
    }
    public static void diamondCreationTop(){// creating the top part         /\
        System.out.println("   /\\\n  /  \\\n /    \\");
    }
    public static void squareCreation() {//creating a square |=|
        System.out.println("+------+\n|      |\n|      |\n+------+");//
    }
}
