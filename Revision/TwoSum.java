import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        System.out.println("Given array is:");
        System.out.println(Arrays.toString(arr));

        // Input target sum
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        // Two sum logic using two loops
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indices: " + i + " and " + j);
                    System.out.println("Elements: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break; // remove this break if you want all such pairs
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No pair found with sum = " + target);
        }

        sc.close();
    }
}
