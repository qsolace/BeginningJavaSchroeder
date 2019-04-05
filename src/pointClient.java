
public class pointClient {
    public static void main(String[] args){
        point p1 = new point();
        point p2 = new point();
        p1.SetX(0);
        p1.SetY(7);
        p2.SetX(-4);
        p2.SetY(-1);
        System.out.println("Point 1 = (" + p1.GetX()+ ", " +p1.GetY()+ ")");
        System.out.println("Point 2 = ("+ p2.GetX()+ ", "+ p2.GetY()+ ")");
        p2.SetLocation(0,21);
        System.out.println("Point 2 = ("+ p2.GetX()+ ", "+ p2.GetY()+ ")");
        System.out.println(p2.getCoords());
        p2.transmute(0,-4);
        System.out.println(point.distance(p1,p2));
    }
}
