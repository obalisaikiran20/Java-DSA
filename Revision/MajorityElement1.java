import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement1 {
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
        int c=0;
        int m=0;
        for(int i=0;i<n;i++)
        {
        if(c==0)
        {
            m=arr[i];

        }
        if(m==arr[i])
        {
            c++;
        }
        else{
            c--;
        }
        }
        int freq = 0;
        for (int num : arr) {
            if (num == m) freq++;
        }

        if (freq > n / 2) {
            System.out.println("Majority Element is: " + m);
        } else {
            System.out.println("No Majority Element Found.");
        }

        

    }
    
}
