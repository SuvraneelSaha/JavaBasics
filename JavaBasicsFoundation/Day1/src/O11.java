import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        // enter the radius of a circle and find the area , diameter and perimeter
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius:");
        double r = in.nextDouble();
        double area = Math.PI * r * r ;
        double peri = 2 * Math.PI * r;
        double diameter = 2*r;

        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+peri);
        System.out.println("Diameter = "+diameter);


    }
}
