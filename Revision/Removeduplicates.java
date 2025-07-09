import java.util.Arrays;
import java.util.Scanner;

public class Removeduplicates {
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
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println("Index: "+i+1);
    }
    
}
