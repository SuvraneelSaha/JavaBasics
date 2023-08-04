import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
            // enter two numbers and find out the addition , subtraction , multiplication and division
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number:");
        int x = in.nextInt();
        System.out.println("Please enter the 2nd number:");
        int y =in.nextInt();
        System.out.printf("Addition of x and y is %d",(x+y));
        System.out.println();
        // substraction
        if(x>y)
        {
            System.out.printf("Subtraction is %d",(x-y));

        }
        else
        {
            System.out.printf("Subtraction is %d",(y-x));
        }
        System.out.println();
        // multiplication
        System.out.printf("Multiplication is %d",(x*y));
        // division
        System.out.println();
        if(x>y)
        {
            System.out.printf("Division is %d",(x/y));

        }
        else
        {
            System.out.printf("Division is %d",(y/x));

        }

        // here we have used format specifier %d along with the function printf which is preset inside the out object
        // and that out object is present inside the System class which is present inside the lang package

        // whereas the Scanner class is present inside the util package 
    }
}
