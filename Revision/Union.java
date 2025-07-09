import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The  First Array Size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
       for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Second Array Elements: ");
         int m=sc.nextInt();
        
        int[] nums=new int[m];
        
        for(int i=0;i<m;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Given  First Array Is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Given Second Array is: ");
        System.out.println(Arrays.toString(nums));
        HashSet<Integer> s=new HashSet<>();
        for(int x:arr)
        {
            s.add(x);
        }
        for(int y:nums)
        {
            s.add(y);

        }
       int[] result = new int[s.size()];
        int index = 0;
        for (int val : s) {
            result[index++] = val;
        }
        System.out.println("Union of Two Arrays is: "+Arrays.toString(result));
    }
    
}
