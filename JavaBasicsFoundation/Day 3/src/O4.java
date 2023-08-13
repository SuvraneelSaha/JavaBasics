import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Year:");
        int year = in.nextInt();

        if(year%4==0)
        {
            if(year%400==0)
            {
                if(year%100==0)
                {
                    System.out.println(year+" is not a Leap Year");
                }
                else
                {
                    System.out.println(year+" is  a Leap Year");
                }
            }
            else
            {
                if(year%100==0)
                {
                    System.out.println(year+" is not a Leap Year");
                }
                else
                {
                    System.out.println(year+" is  a Leap Year");

                }
            }

        }
        else
        {
            System.out.println(year+" is not a Leap Year");
        }

    }
}
