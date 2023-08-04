import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        // wap to input your age and mobile no. and print the same
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = in.nextInt();
        System.out.println("Please enter your mobile number");
        long x = in.nextLong();
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+x);

        // int < long
    }
}
