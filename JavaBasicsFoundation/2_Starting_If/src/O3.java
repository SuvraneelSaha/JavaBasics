import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();

        if(a<0)
        {
            System.out.println("Negative number "+a);
        }
        if(a>=0)
        {
            System.out.println("Positive Number: "+a);
        }
    }
}
