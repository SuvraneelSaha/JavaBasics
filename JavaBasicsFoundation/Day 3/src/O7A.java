import java.util.Scanner;

public class O7A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the angles of the triangle:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // a = 60 , b= 90 , c= 30
       if(a<90)
       {
           if(b==90 || c==90)
           {
               if(a+b+c==180)
               {
                   System.out.println("Right angled triangle A");
               }
           }
           else if(b>90 || c>90)
           {
               if(a+b+c==180)
               {
                   System.out.println("Obtused angled triangle A");
               }
           }
           else
           {
                if(a+b+c==180)
                {
                    System.out.println("Acute angled triangle A");
                }
           }
       }
       else if(b<90)
       {
           if(a==90 || c==90)
           {
               if(a+b+c==180)
                    System.out.println("Right angled trinagle B");
           }
           else if(a>90 || c>90)
           {
               if(a+b+c==180)
                    System.out.println("Obtuse angled triangle B");
           }
           else
           {
               if(a+b+c==180)
                   System.out.println("Acute angled triangle B");
           }
       }
       else if(c<90)
       {
            if(a==90 || b==90)
            {
                if(a+b+c==180)
                {
                    System.out.println("Right angled triangle C");
                }
            }
            else if(a>90 || b>90)
            {
                if(a+b+c==180)
                    System.out.println("obtuse angled triangle C");
            }
            else
            {
                if(a+b+c==180)
                {
                    System.out.println("Acute angled triangle C");
                }
            }
       }
    }
}
