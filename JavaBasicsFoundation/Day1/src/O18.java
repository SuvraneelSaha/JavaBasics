import java.util.Scanner;

public class O18 {
    public static void main(String[] args) {
        // wap to take in input and convert that into years , months and days
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int days = in.nextInt(); // 2535
        int days_left;
        int years = days/365;
        days_left = days % 365;
        int months = days_left/30;
        days_left = days_left % 30 ;

        System.out.println("Years = "+years);
        System.out.println("Months  "+months);
        System.out.println("Days = "+days_left);

    }
}
// Search Murphy's Law
