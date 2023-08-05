import java.util.Scanner;

public class O14 {
    public static void main(String[] args) {
        // Enter an amount and break the amount into bank notes
        // without using if statements or for or while
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int money = in.nextInt();
        int money_left;
        int note_2k = money / 2000;
        money_left = money%2000;
        int note_500 = money_left/500;
        money_left = money_left%500;
        int note_200 = money_left/200;
        money_left = money_left % 200 ;
        int note_100 = money_left/100;
        money_left = money_left % 100 ;
        int note_50 = money_left / 50 ;
        money_left = money_left % 50 ;
        int note_20 = money_left / 20 ;
        money_left = money_left % 20 ;
        int note_10 = money_left / 10 ;
        money_left = money_left % 10 ;
        int note_5 = money_left / 5;
        money_left = money_left % 5;
        int note_2 = money_left /2 ;
        money_left = money_left % 2 ;
        int note_1 = money_left;

        System.out.println("2k notes "+note_2k);
        System.out.println("500 notes "+note_500);
        System.out.println("200 notes "+note_200);
        System.out.println("100 notes "+note_100);
        System.out.println("50 notes "+note_50);
        System.out.println("20 notes "+note_20);
        System.out.println("10 notes "+note_10);
        System.out.println("5 notes "+note_5);
        System.out.println("2 notes "+note_2);
        System.out.println("1 notes "+note_1);


    }
}
