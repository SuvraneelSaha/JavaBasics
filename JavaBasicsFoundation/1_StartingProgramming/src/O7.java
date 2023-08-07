import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        // wap which takes hours and minutes and calculates the total minutes
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter the num of hours:");
        int hours = in.nextInt();
        System.out.println("Pleas enter the num of mins :");
        int mins = in.nextInt();
        int total = hours*60 + mins;
        System.out.println("total mins : "+total);
    }
}
