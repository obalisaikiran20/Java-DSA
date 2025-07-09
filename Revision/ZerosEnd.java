import java.util.Arrays;
import java.util.Scanner;

public class ZerosEnd {
    public void move(int [] arr)
    {
        int i=0;
        int n=arr.length;
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=0)
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i+=1;
            }

        }
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
        ZerosEnd x=new ZerosEnd();
        x.move(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    
}
