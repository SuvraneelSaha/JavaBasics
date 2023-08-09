import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        while (!in.hasNext("[0-9]+$"))
        {
            System.out.println("NA");
            System.out.println("Try Again");
            in.next();
        }
        int a =in.nextInt();
        int isDouble = 1 ;

       if((a>-10 && a<10))
       {
           System.out.println("Single Digit");
           isDouble=0;
       }

       if(isDouble==1)
       {
           System.out.println("Not a Single Digit");
       }



    }
}
