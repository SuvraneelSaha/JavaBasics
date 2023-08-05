import java.util.Scanner;

public class O21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter u (initial velocity)");
        double u = in.nextDouble();
        System.out.println("Enter t (time in seconds)");
        double t = in.nextDouble();
        System.out.println("Enter f (force)");
        double f = in.nextDouble();

        double s = (u*t) + (0.5)*f*Math.pow(t,2);

        System.out.println("S = "+s);

    }
}
