import java.util.Scanner;
public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor1 ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }
        int missing = xor1 ^ xor2;
        System.out.println("Missing Number is: " + missing);
    }
}
