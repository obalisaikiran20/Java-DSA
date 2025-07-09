import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
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
        boolean s=true;
        for(int i=1;i<n;i++)
        {
            
            if(arr[i]<arr[i-1])
            {
                s=false;
                break;
            }
            
        }
        if(s)
        {
            System.out.println("Array is Sorted...");
        }
        else{
            System.out.println("Array is unsorted");
        }
    }
    
}
