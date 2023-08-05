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
        double amount;
        amount = p*(1+(r/n));
        amount = Math.pow(amount,(n*t));
        System.out.println("Amount = "+(int)amount);
    }
}
