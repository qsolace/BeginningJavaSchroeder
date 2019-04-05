
public class point {
    private int x;
    private int y;

    public void SetX(int newX){
        x = newX;
    }
    public void SetY(int newY){
        y = newY;
    }
    public void SetLocation(int newX, int newY){
        x = newX;y=newY;
    }
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
    public String getCoords(){
        return "("+x+", "+y+")";
    }
    public static double distance(point p1, point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }
    //translate (change x and change y)
    public void transmute(int changeX,int changeY){
        x += changeX;
        y += changeY;
    }

}
