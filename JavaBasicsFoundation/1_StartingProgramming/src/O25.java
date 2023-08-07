import java.util.Scanner;

public class O25 {
    public static void main(String[] args) {
        // Area of a right angled triangle
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle:");
        double height = in.nextDouble();
        System.out.println("Please enter the Base of the triangle:");
        double base = in.nextDouble();

        double area = (1.0/2) * base * height;
        System.out.println("Area of the right angled triangle is "+area);
    }
}
