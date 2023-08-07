import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        // Wap to compute the area of a circle
        // and also the perimeter
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double r = in.nextDouble();
        double area = r *r * Math.PI;
        System.out.println("Area of the circle is "+area);
        double peri = 2 * Math.PI * r ;
        System.out.println("Perimeter of the circle is "+peri);

    }
}
