import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
    // wap to calculate the perimeter of a rectangle of height 7 and width 5 inches
        // also find the area
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter the length:");
        int l = in.nextInt();
        System.out.println("Please enter the breadth:");
        int b =in.nextInt();
        int perimeter = 2 *(l+b);
        System.out.println("Perimeter of the rectangle is "+perimeter);
        System.out.printf("Area of the rectangle is %d ",(l*b));


    }
}
