import java.util.Scanner;

public class O15 {
    public static void main(String[] args) {
        // enter a no. and find the cobe and square of it
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        double num = in.nextDouble();
        double cube = Math.pow(num,3);
        double square = Math.pow(num,2);
        System.out.println("cube :"+cube);
        System.out.println("Square "+square);

    }
}
