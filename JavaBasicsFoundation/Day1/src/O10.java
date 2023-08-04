import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        // enter the temp in centigrade and convert it into fahrenheit
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temp in Centigrade or Celcius ");
        double centi = in.nextDouble();
        double fahren = ((centi*9)/5) + 32 ;
        System.out.println("Fahrenheit : "+fahren);

    }
}
