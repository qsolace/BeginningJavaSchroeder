import java.util.Random;
public class random5 {
    public static void main(String[] args){
        Random random = new Random();
        int var =0;
        while (var!=5){
            var = random.nextInt(5)+3;
            if (var == 5){
                break;
            }
            System.out.print(var);
        }
    }
}
