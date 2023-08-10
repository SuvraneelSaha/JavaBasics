import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int a = in.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b = in.nextInt();

        if(a==b)
        {
            System.out.println("Equal "+a +"and "+b);
        }
        else
        {
            System.out.println("Not Equal "+a+" and "+b);
        }


    }
}
