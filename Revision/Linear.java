import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public int liner(int [] arr, int k)
    {
        int n=arr.length;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
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
        System.out.println("Enter Element To Search");
        int k=sc.nextInt();
        Linear x=new Linear();
        int l=x.liner(arr, k);
        if(l!=-1)
        {
            System.out.println("Element Found at Index: "+l);
        }
        else{
            System.out.println("Element Not Found!");
        }
       

    }
    
}
