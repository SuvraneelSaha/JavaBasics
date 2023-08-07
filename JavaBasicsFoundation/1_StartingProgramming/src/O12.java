import java.util.Scanner;

public class O12 {
    public static void main(String[] args) {
        // find the volume of a sphere - (4/3)pi r^3
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double r = in.nextDouble();
        double volume = ((double) 4 /3)*Math.PI * r * r * r;
        System.out.println("Volume of the sphere = "+volume);

// in case of integer division 4/3 results comes out as 1
        // whereas in case of double it comes out 1.something
        // so type cast it to double the numerator
    }
}
