import java.util.Arrays;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 9, 3};
        System.out.println("Given Array is: " + Arrays.toString(arr));
        
        int l = 0;
        int r = arr.length - 1;
        boolean isPalindrome = true;

        while (l <= r) {
            if (arr[l] != arr[r]) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }

        if (isPalindrome) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not a palindrome");
        }
    }
}
