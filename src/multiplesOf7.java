public class multiplesOf7 {
    public static void main(String[] args){
        int count=0, sum=0;
        while (count<=3){
            count++;
            sum += count *7;
        }
        System.out.printf("The sum of the first %d multiples of 7 is %d",count,sum);
    }
}
