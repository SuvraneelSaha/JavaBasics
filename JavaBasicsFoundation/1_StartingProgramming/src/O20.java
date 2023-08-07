import java.util.Scanner;

public class O20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st Num: ");
        int a = in.nextInt();
        System.out.println("Please enter the 2nd Num : ");
        int b = in.nextInt();
        System.out.println("Before a = "+a);
        System.out.println("Before b =  "+b);
        a= a*b;
        b= a/b;
        a= a/b;


        System.out.println("After a = "+a);
        System.out.println("After b = "+b);

        System.out.println("Please enter the 1st num: ");
        int x = in.nextInt();
        System.out.println("Please enter the 2nd num : ");
        int y = in.nextInt();
        x= x+y;
        y= x-y;
        x= x-y;
        System.out.println("After x = "+x);
        System.out.println("After y = "+y);

    }
}
