import java.util.*;
public class Max {
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
        int maxi=Integer.MIN_VALUE;
        for(int x:arr)
        {
            if(x>maxi)
            {
                maxi=x;
            }
        }
        System.out.println("Maximum from given array is: "+maxi);
    }
    
}
