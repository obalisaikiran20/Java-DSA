import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Intersection {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Array Size:");
        int n = sc.nextInt();
        System.out.println("Enter the Second Array Size:");
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] nums = new int[m];
        System.out.println("Enter the First Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Second Array Elements: ");
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Given First Array Is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Given Second Array Is: ");
        System.out.println(Arrays.toString(nums));
        HashSet<Integer> set1 = new HashSet<>();
        for (int x : arr) {
            set1.add(x);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for (int y : nums) {
            if (set1.contains(y)) {
                intersection.add(y);
            }
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int val : intersection) {
            result[index++] = val;
        }
        System.out.println("Intersection of Two Arrays is: " + Arrays.toString(result));
    }
}
