import java.util.Scanner;

public class O24 {
    public static void main(String[] args) {
        // Compound Interest
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal ");
        double p = in.nextDouble();
        System.out.println("Enter time ");
        double t = in.nextDouble();
        System.out.println("Enter rate of interest :");
        double r = in.nextDouble();
        System.out.println("No. of times interest is compounded per year");
        int n = in.nextInt();

        double exponent = n * t;
        double half = 1 + (r/100);
        double power = Math.pow(half,exponent);

        double Total = p * power;

        System.out.printf("the amount = %f",Total);
    }
}
// Formula used = Amount = Principle*(1+(rate / 100))^time