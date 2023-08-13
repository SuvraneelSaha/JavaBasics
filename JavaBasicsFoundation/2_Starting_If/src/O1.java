import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number:");
        int a = in.nextInt();
        System.out.println("Please enter the 2nd Number:");
        int b = in.nextInt();

        if(a>b)
        {
            System.out.println("A is Bigger than B "+a);
        }

        if(b>a)
        {
            System.out.println("B is Bigger than A "+b);

        }

        if(a==b)
        {
            System.out.println("A and B are equal ");
        }

    }
}
