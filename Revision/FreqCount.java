import java.util.*;

public class FreqCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        HashSet<Character> printed = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!printed.contains(ch) && ch >= 'a' && ch <= 'z') {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) {
                        count++;
                    }
                }
                printed.add(ch);
                System.out.println(ch + " : " + count);
            }
        }
    }
}
