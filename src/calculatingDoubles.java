import java.util.Scanner;
public class calculatingDoubles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two doubles > ");
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();
        double answer;
        boolean isOk = true;
        System.out.print("\n\nEnter the operation\n" +
                            "\tUse \"+\" or \"add\" to do addition\n" +
                            "\tUse \"-\" or \"subtract\" to do subtraction\n" +
                            "\tUse \"*\" or \"multiply\" to do multiplication\n" +
                            "\tUse \"/\" or \"divide\" to do division\n" +
                            "\tUse \"%\" or \"remainder\" to find the remainder\n");
        String operation = scan.next();
        operation = operation.toUpperCase();
        switch (operation){
            case "ADD":
            case "+":
                answer = firstNumber + secondNumber;
                break;
            case "SUBTRACT":
            case "-":
                answer = firstNumber - secondNumber;
                break;
            case "MULTIPLY":
            case "*":
                answer = firstNumber * secondNumber;
                break;
            case "DIVIDE":
            case "/":
                answer = firstNumber /secondNumber;
                break;
            case "REMAINDER":
            case "%":
                answer = firstNumber%secondNumber;
                break;
            default:
                System.err.print("That isn't a valid operation.");
                isOk = false;
                answer = 0;
                break;

        }
        if (isOk) {
            System.out.printf("The answer is %.2f4567", answer);
        }
    }
}
