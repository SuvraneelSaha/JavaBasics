import java.util.Scanner;

public class O19 {
    public static void main(String[] args) {
    // enter two numbers into two variables and swap them
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st num:");
        int a = in.nextInt();
        System.out.println("Please enter the 2nd num:");
        int b = in.nextInt();
        int c = 0;
        System.out.println("Before a = "+a);
        System.out.println("Before b = "+b);

        c=b;
        b=a;
        a=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);







    }
}
