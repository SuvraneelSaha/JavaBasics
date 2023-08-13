import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.printf("Maximum number : %d",Math.max(Math.max(a,b),c));
        System.out.println();
        System.out.printf("Minimum number : %d",Math.min(Math.min(a,b),c));
    }
}
