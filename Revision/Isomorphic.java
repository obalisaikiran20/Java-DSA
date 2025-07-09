import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j) && s2.charAt(i) != s2.charAt(j)) {
                    System.out.println("Not Isomorphic");
                    return;
                }
                if (s1.charAt(i) != s1.charAt(j) && s2.charAt(i) == s2.charAt(j)) {
                    System.out.println("Not Isomorphic");
                    return;
                }
            }
        }

        System.out.println("Isomorphic");
    }
}
