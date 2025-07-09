import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class ConsecutiveSequnece {
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
        HashSet<Integer> set=new HashSet<>();
        for(int s:arr)
        {
            set.add(s);
        }
        int m=0;
        for(int a: set)
        {
        if(!set.contains(a-1))
        {
int p=a;
int c=1;
while(set.contains(p+1))
        {
            p++;
            c++;
            
        }
        m=Math.max(c,m);
        }
        
        }
        System.out.println("Maximum Consecutive Seqence is: "+m);

    }
    
}
