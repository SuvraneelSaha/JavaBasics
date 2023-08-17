import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the angles of the triangle:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if(a+b+c==180)
        {
            if(a<=60 || b<=60 || c<=60)
            {
                System.out.println("Acute angled triangle");
            }
            else if (a==90 || b==90 || c==90)
            {
                System.out.println("Right angled triangle");
            }
            else
            {
                System.out.println("Obtuse angled triangle");
            }
        }
        else
        {
            System.out.println("NA not a triangle");
        }

    }
}
// logically wrong answer
