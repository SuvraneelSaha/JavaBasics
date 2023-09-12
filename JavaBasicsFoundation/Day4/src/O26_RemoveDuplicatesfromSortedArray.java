import java.util.Arrays;
import java.util.Scanner;

public class O26_RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please put the values of the elements in the ascending order be it duplicates!!");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();

        }
        System.out.println("The OG Array is :"+ Arrays.toString(arr));

        int ans = removeDuplicates(arr);
        System.out.println("the ans is "+ans);

        System.out.println("New Array : "+Arrays.toString(arr));

    }
    public static int removeDuplicates(int[] nums)
    {

        int j =1 ;

        for(int i = 1; i< nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[j] = nums[i];
                j++;

            }
        }

        return j;

    }
}




