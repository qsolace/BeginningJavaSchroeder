public class boxClient {
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setAll(2,5,9);
        System.out.println("The dimensions of the first box are: "+b1.toString());
        System.out.println("The surface area is: "+b1.CalculateSurfaceArea());
        System.out.println("The volume is: "+b1.CalculateVolume());
        Box b2 = new Box();
        b2.setY(5);
        b2.setX(10);
        System.out.println("\nThe dimensions of the second box are: "+b2.toString());
        System.out.println("The surface area is: "+b2.CalculateSurfaceArea());
        System.out.println("The volume is "+b2.CalculateVolume());
    }
}
