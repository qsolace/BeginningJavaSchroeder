public class randomsTo100 {
    public static void main(String[] args){
        double random1 = Math.random()*100;
        long intRandom1 = Math.round(random1);
        double random2 = Math.random()*100;
        long intRandom2 = Math.round(random2);
        long smallestValue = Math.min(intRandom1,intRandom2);
        System.out.println(smallestValue);
    }
}
