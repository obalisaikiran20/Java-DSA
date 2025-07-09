import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public void rev(int [] arr, int l,int r)
    {
        while(l<=r)

{
    int t=arr[l];
    arr[l]=arr[r];
    arr[r]=t;
    l++;r--;
}
  }
  public void rotate(int [] arr, int k)
{
    int n=arr.length;
    
    k=k%n;
    rev(arr, 0,n-1);
    rev(arr,0,k-1);
    rev(arr,k,n-1);

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
        System.out.println("Enter Number of Rotations You Need...");
        int k=sc.nextInt();
         ArrayRotation a=new ArrayRotation();
         a.rotate(arr,k);
         System.out.println("Rotated Array is: ");
         System.out.println(Arrays.toString(arr));

    }
    
}
