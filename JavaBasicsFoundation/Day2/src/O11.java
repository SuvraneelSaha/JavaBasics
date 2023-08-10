import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 3 angles :");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a+b+c == 180)
        {
            System.out.println("Triangle Possible");
        }
        else
        {
            System.out.println("Triangle Not Possible:");
        }

    }
}
