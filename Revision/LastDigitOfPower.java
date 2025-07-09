import java.util.*;

public class LastDigitOfPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int base = n % 10;

        if (k == 0) {
            System.out.println(1);
            return;
        }

        int powMod = k % 4;
        if (powMod == 0) {
            powMod = 4;
        }

        int result = (int)Math.pow(base, powMod) % 10;
        System.out.println(result);
    }
}
