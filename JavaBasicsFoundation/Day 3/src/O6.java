import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 3 sides of the triangle:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if(a==b && b==c)
        {
            System.out.println("Equilateral");
        }
        else if(a!=b && b!=c && a!=c)
        {
            System.out.println("Scalene");
        }
        else
        {
            System.out.println("Isosceles");
        }
    }
}
