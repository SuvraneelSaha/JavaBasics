import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        // Wap to find the 3rd angle if two other angles are given
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st angle:");
        float x = in.nextFloat();
        System.out.println("Now enter the 2nd angle :");
        float y = in.nextFloat();
        if((x+y) > 180)
        {
            System.out.println("the two angles are not valid");
        }
        else
        {
            float z = 180-(x+y);
            System.out.println("the 3rd angle is "+z);
        }
    }
}
