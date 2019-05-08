public class forTest {
    public static void main(String[] args){
        int i = 0;
        int someNum = 6;
        while (i<someNum){
            i++;
            someNum --;
        }
        System.out.println(i+" "+someNum);
        int otherNum = 6;
        for (int j =1; j<otherNum;){
            j++;
            j++;
            System.out.print(j+" ");
        otherNum--;
    }
        System.out.print(otherNum);
}
}
