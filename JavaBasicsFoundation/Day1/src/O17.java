import java.util.Scanner;

public class O17 {
    public static void main(String[] args) {
        // Enter the time in seconds and convert it into Hours , Minutes and second format
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the seconds :");
        int seconds = in.nextInt(); // 25300

        int mins = seconds / 60;
        int sec_left = seconds % 60 ;

        int hours = mins/60;
        int mins_left = mins % 60;
        System.out.println("hours : "+hours);
        System.out.println("Mins = "+mins_left);
        System.out.println("Seconds = "+sec_left);

    }
}
