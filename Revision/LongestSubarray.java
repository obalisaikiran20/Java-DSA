import java.util.Arrays;
import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int n=sc.nextInt();
        System.out.println("Enter The Array Elements: ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Given Array Is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter The Sum Value");
        int k=sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    m=Math.max(m,j-i+1);
                }
            }
        }
        System.out.println("Longest Sub array with sum "+k+ " is: "+m );

    }
    
}
