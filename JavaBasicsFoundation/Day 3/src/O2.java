import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the age:");
        int age = in.nextInt();

        if(age>=18)
        {
            System.out.println("Enter 1 if Indian Enter 0 if Non Indian:");
            int choice = in.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the Number of Years stayed in India:");
                int years = in.nextInt();
                if(years >=5)
                {
                    System.out.println("The Candidate can have a voter card");
                    System.out.println("Age = "+age+" Indian = "+choice+" years = "+years);
                }
                else
                {
                    System.out.println("The Candidate cannot have a voter card");
                    System.out.println("Age = "+age+"Indian = "+choice+"years = "+years);
                }
            }
            else
            {
                System.out.println("No Voter Card for Non Indian");
            }
        }
        else
        {
            System.out.println("Underage cannot apply for voter id card");
        }

    }
}
