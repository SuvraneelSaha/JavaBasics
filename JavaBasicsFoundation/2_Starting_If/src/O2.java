import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = in.nextInt();

        if(a%5==0)
        {
            System.out.println(a+" is divisible by 5");

        }
        if(a%5!=0)
        {
            System.out.println("Not divisible By 5 "+a);
        }

    }
}
