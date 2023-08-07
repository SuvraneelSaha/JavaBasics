import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        // wap to convert the inputted meters into centimeter and kilometer
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length in meters ");
        double meter = in.nextDouble();
        double centi = meter * 100 ;
        double kilo = meter / 1000;
        System.out.println("centimeter : "+centi);
        System.out.println("kilometer : "+kilo);
    }
}
