import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Marks in the Physics Subject:");
        int marks = in.nextInt();

        if(marks>60 && marks <=100)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
