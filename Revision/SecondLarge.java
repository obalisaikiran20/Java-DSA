import java.util.Arrays;
import java.util.Scanner;

public class SecondLarge {
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
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int x:arr)
        {
            if(x>f)
            {
                s=f;
                f=x;
            }
        }
        if(f!=Integer.MIN_VALUE &&  s!=Integer.MIN_VALUE)
        {
            System.out.println("First Largest is:"+f);
            System.out.println("Second Largest is: "+s);
        }
    }
    
}
