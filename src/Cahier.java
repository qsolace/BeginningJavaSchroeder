import java.util.Scanner;

public class Cahier {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cost = 0;
        boolean notDivider = true;
        int items = 0;

        System.out.print("Do you have anything to scan? > ");
        char nOrN = scan.next().charAt(0);
        if (nOrN == 'n'||nOrN=='N'){
            notDivider = false;
            System.out.print("Okay okay okay");
        }
        while (notDivider){
            System.out.print("Enter the item name. If you are done, say \"NO\" > ");
            String item = scan.next();
            if (item.equalsIgnoreCase("no")){
                break;
            }
            cost += item(item);
        }
//        while (notDivider){
//            System.out.print("Enter your item price. If you are done, enter 0 > ");
//            double price = scan.nextDouble();
//            if (Math.abs(price)<.001){
//                break;
//            }
//            cost += price;
//            items ++;
//        }
        System.out.printf("Your cost was $%.2f, and you bought %d items",cost, items);
    }
    public static double item(String itemName){
        switch (itemName.toLowerCase()){
            case "apple":
                return .99;
            case "banana":
                return .19;
            case "mango":
                return 1.49;
            case "chicken":
                return 9.99;
            default:
                return 0.0;
        }
    }
}
