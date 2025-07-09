import java.util.regex.*;
public class NumberSum {
    public static void main(String[] args) {
        String input = "sai987kiran987";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        int sum = 0;
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        System.out.println(sum); // Output: 1974
    }
}
