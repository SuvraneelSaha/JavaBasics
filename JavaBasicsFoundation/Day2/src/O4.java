import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st num:");
        int a =in.nextInt();
        System.out.println("Enter the 2nd num:");
        int b = in.nextInt();

        if(a%b==0)
        {
            System.out.println(a+" is divisible by "+b);
        }

        if(a%b!=0)
        {
            System.out.println(a+" is not divisible by "+b);
        }


    }
}
