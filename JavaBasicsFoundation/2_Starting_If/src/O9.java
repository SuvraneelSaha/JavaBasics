import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Length:");
        double len = in.nextDouble();
        System.out.println("Enter the Breadth:");
        double bre = in.nextDouble();
        System.out.println("Enter the Radius ");
        double r = in.nextDouble();

        double areaRectangle = len*bre;

        double areaCircle = Math.PI * Math.pow(r,2);

        if(areaCircle>areaRectangle)
        {
            System.out.println("Area of the Circle is Greater than the area of the rectangle:");
            System.out.println("Area of the Circle = "+areaCircle);
            System.out.println("Area of the Rectangle = "+areaRectangle);
        }
        else
        {
            System.out.println("Area of the Rectangle is Greater than the area of the Circle");
            System.out.println("Area of the Circle = "+areaCircle);
            System.out.println("Area of the Rectangle = "+areaRectangle);
        }


    }
}
