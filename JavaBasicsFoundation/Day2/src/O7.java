import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = in.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is Even");
        }
        else
        {
            System.out.println(n+" is Odd");
        }
    }
}
