import java.util.Arrays;
import java.util.Scanner;

public class MajorityELement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.println("Enter The Array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter The Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array Is: ");
        System.out.println(Arrays.toString(arr));

        // Step 2: Extended Moore's Voting to find candidates
        int c1 = 0, c2 = 0;
        int m1 = -1, m2 = -1;

        for (int i = 0; i < n; i++) {
            if (m1 == arr[i]) {
                c1++;
            } else if (m2 == arr[i]) {
                c2++;
            } else if (c1 == 0) {
                m1 = arr[i];
                c1 = 1;
            } else if (c2 == 0) {
                m2 = arr[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        // Step 3: Verify the candidates
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m1) {
                c1++;
            } else if (arr[i] == m2) {
                c2++;
            }
        }

        System.out.println("Majority Elements > n/3 are:");
        if (c1 > n / 3) {
            System.out.println(m1);
        }
        if (c2 > n / 3) {
            System.out.println(m2);
        }
        if (c1 <= n / 3 && c2 <= n / 3) {
            System.out.println("No Majority Elements Found.");
        }

        sc.close();
    }
}
