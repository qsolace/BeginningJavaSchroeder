/*
Ryan Schroeder
21 April 2019
Length, Width, Height
Area? Volume
toString
 */


public class Box {
    private int x =1;
    private int y =1;
    private int z =1;

    public void setX(int newX) {
        x = newX;
    }

    public int getX() {
        return x;
    }

    public void setY(int newY) {
        y = newY;
    }

    public int getY() {
        return y;
    }

    public void setZ(int newZ) {
        z = newZ;
    }

    public int getZ() {
        return z;
    }

    public void setAll(int newX, int newY, int newZ){
        setX(newX);
        setY(newY);
        setZ(newZ);
    }
    public String toString(){
        return x +", "+y+", "+z;
    }
    public int CalculateSurfaceArea(){
        int sideA = x*y;
        int sideB = y*z;
        int sideC = z*x;
        int area = (2*sideA)+ (2*sideB)+(2*sideC);
        return area;
    }
    public int CalculateVolume(){
        int volume = x*y*z;
        return volume;
    }
}
