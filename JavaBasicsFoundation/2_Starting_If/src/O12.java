import java.util.Scanner;

public class O12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cost Price:");
        double CP = in.nextDouble();

        System.out.println("Enter the Selling Price:");
        double SP = in.nextDouble();

        if(SP>CP)
        {
            double profit = SP-CP;
            System.out.println("Profit = "+profit + " SP = "+SP+" CP = "+CP);

        }
        else if(CP>SP)
        {
            double Loss = CP-SP;
            System.out.println("Loss = "+Loss + " SP = "+SP+" CP = "+CP);
        }
        else
        {
            System.out.println("CP and SP are Same "+CP+" and "+SP);

        }
    }
}
