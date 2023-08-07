import java.util.Scanner;

public class O27 {
    // Add two timings and print the total in terms of hours minutes and seconds
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st Hours");
        int hour1 = in.nextInt();
        System.out.println("Enter the 1st Minutes");
        int min1 = in.nextInt();
        System.out.println("Enter the 1st Seconds");
        int sec1 = in.nextInt();
        System.out.println("Enter the 2nd Hours");
        int hour2 = in.nextInt();
        System.out.println("Enter the 2nd Minutes");
        int min2 = in.nextInt();
        System.out.println("Enter the 2nd Seconds");
        int sec2 = in.nextInt();

        int firstPart = (hour1 * 60 * 60 ) + (min1 * 60) + sec1;

        int secondPart = (hour2 * 60 * 60 ) + (min2 * 60) + sec2;

        int totalSeconds = firstPart + secondPart;

        int hour = totalSeconds / 3600 ;
        totalSeconds = totalSeconds % 3600 ;
        int min = totalSeconds / 60 ;
        totalSeconds = totalSeconds % 60 ;
        int sec = totalSeconds ;
        System.out.println(hour+" hour "+min+" mins "+sec+" seconds");

    }
}
