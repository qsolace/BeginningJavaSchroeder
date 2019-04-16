
public class pointClient {
    public static void main(String[] args){
        point p1 = new point();
        point p2 = new point();
        point p3 = new point();
        p1.SetLocation(10,5);
        p2.SetLocation(12,5);
        p3.SetLocation(13,5);

        System.out.println(p3.isCollinear(p1,p2));

    }
}
