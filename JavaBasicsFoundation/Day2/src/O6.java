import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int n = in.nextInt();
        boolean leap = false;

        if(n%4==0)
        {
            if(n%400==0)
            {
                leap = true;
            }
            else if (n%100==0)
            {
                leap = false;
            }
            else
            {
                leap = true;
            }
        }
        else
        {
            leap = false;
        }

        if(leap)
        {
            System.out.println(n+" is a leap Year");

        }
        else
        {
            System.out.println(n+" is not a Leap Year");
        }
    }
}
