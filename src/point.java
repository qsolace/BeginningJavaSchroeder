
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
    public boolean isVertical(point secondPoint){
        if (x==secondPoint.x){
            return true;
        }
        else{
            return false;
        }
    }
    public double slope(point secondPoint){
        double diffY =(y)-secondPoint.y;
        double diffX =(x)-secondPoint.x;
        double slope = diffY/diffX;
        return slope;
    }
    public int manhattanDistance(point secondPoint){
        int diffY = Math.abs(y-secondPoint.y);
        int diffX = Math.abs(x-secondPoint.x);
        int dist = diffX+diffY;
        return dist;
    }
    public boolean isCollinear(point secondPoint, point thirdPoint){
        double slope1and2 = 0.0;
        long finalSlope1and2 = 0;
        boolean isVert12=true;
        double slope2and3 = 0.0;
        long finalSlope2and3 = 0;
        boolean isVert23=true;
        double slope1and3 = 0.0;
        long finalSlope1and3 = 0;
        boolean isVert13=true;

        if (x!=secondPoint.x){
            slope1and2= slope(secondPoint);
            slope1and2*= 1000;
            finalSlope1and2 = Math.round(slope1and2);
            isVert12 = false;
            System.out.println(slope1and2);
            System.out.println(finalSlope1and2);
        }

        if (secondPoint.x != thirdPoint.x){
            slope2and3 = secondPoint.slope(thirdPoint);
            slope2and3 *= 1000;
            finalSlope2and3 = Math.round(slope2and3);
            isVert23 = false;
            System.out.println(slope2and3);
            System.out.println(finalSlope2and3);
        }
        if (x != thirdPoint.x){
            slope1and3 = slope(thirdPoint);
            slope1and3 *= 1000;
            finalSlope1and3 = Math.round(slope1and3);
            isVert13 = false;
            System.out.println(slope1and3);
            System.out.println(finalSlope1and3);
        }



        if (isVert12 == isVert23 == isVert13){
            return true;
        }
        else {if (finalSlope1and2==finalSlope1and3){
            if(finalSlope1and2==finalSlope2and3){
                return true;
            }
        }}
        return false;


    }

}
