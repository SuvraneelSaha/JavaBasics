import java.util.Scanner;

public class O23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal ");
        double p = in.nextDouble();
        System.out.println("Enter time ");
        double t = in.nextDouble();
        System.out.println("Enter rate of interest :");
        double r = in.nextDouble();
        // si = ptr/100

        double si = (p*t*r)/100;
        double amount = p + si;
        System.out.println("The total amount : "+amount);

    }
}
