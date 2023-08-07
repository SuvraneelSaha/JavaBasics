import java.util.Scanner;

public class O13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the Kilometers:");
        double kilo = in.nextDouble();
        double miles = kilo * 0.621371;
        System.out.println("COnverted to Miles : "+miles);

    }
}
