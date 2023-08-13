import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 3 sides of a triangle:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if(a+b>c)
        {
            if(a+b+c==180)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Not valid");
            }
        }
        else if(b+c>a)
        {
            if(a+b+c==180)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Not Valid");
            }
        }
        else if (a+c>b)
        {
            if(a+b+c==180)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Not valid");
            }
        }
        else
        {
            System.out.println("NA");
        }



    }
}
