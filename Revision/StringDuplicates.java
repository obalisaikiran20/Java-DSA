import java.util.*;

public class StringDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        s = s.toLowerCase();

        String result = "";
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch) && ch >= 'a' && ch <= 'z') {
                result += ch;
                set.add(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
