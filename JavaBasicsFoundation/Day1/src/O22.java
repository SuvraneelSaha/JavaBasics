import java.util.Scanner;

public class O22 {
    public static void main(String[] args) {
        // find the modulus without using the % operator
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 2 nums: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b)
        {
            int c = (a - (b*(a/b) ));
            System.out.println("Remainder = "+c);
        }
        else
        {
            int c = (b-(a*(b/a)));
            System.out.println("Remainder = "+c);
        }
    }
}
