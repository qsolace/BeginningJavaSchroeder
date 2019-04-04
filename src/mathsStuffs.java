

/*
Ryan Schroeder
Request #s then do maths
2 April 2019
v1.0
 */

public class mathsStuffs {
    public static void main(String[] args){

        double firstNumber = (Math.random() + 20 * Math.random())*100;
        firstNumber = Math.round(firstNumber);
        firstNumber = firstNumber/100;
        double secondNumber = (Math.random() / Math.random() + 2 * Math.random() + 3.5 * Math.random())*100;
        secondNumber = Math.round(secondNumber);
        secondNumber = secondNumber /100;
        double thirdNumber = Math.random()*100;
        thirdNumber = Math.round(thirdNumber);
        thirdNumber = thirdNumber/100;
        System.out.println("The three numbers we will be working with today are " + firstNumber + " " + secondNumber + " and " + thirdNumber);
        double sum = (firstNumber+secondNumber+thirdNumber)*100;
        sum = Math.round(sum);
        sum = sum / 100;
        System.out.println("The sum of those numbers is " + sum);
        double product = firstNumber*secondNumber*thirdNumber*100;
        product = Math.round(product);
        product = product / 100;
        System.out.println("The product of those numbers is " + product);
        double max = Math.max(firstNumber,secondNumber);
        max = Math.max(max, thirdNumber);
        System.out.println("The largest of those three numbers is "+ max);
        double min = Math.min(firstNumber, secondNumber);
        min = Math.min(min, thirdNumber);
        System.out.println("The smallest of those numbers is " + min);
        double sqrt = Math.sqrt(product)*100;
        sqrt = Math.round(sqrt);
        sqrt = sqrt / 100;
        System.out.println("The square root of the product of those three numbers is "+ sqrt);


    }
}
