import java.util.Scanner;

public class O26 {
    public static void main(String[] args) {
        // enter the co-ordinates of two points and find the distance between them
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter X1");
        int x1 = in.nextInt();
        System.out.println("Please enter Y1");
        int y1 = in.nextInt();
        System.out.println("Please enter X2");
        int x2 = in.nextInt();
        System.out.println("Please enter Y2");
        int y2 = in.nextInt();

        double firstPart = Math.pow((x1-x2),2);
        double secondPart = Math.pow((y1-y2),2);

        double distance = Math.sqrt((firstPart+secondPart));

        System.out.println("the distance between the two points is "+distance);

    }
}
