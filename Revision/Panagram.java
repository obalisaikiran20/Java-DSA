import java.util.*;
public class Panagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        System.out.println("Given String is: "+s);
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        if(set.size()==26)
        {
            System.out.println("String is a panagram");
        }
        else{
            System.out.println("String is  not a panagram");
        }
        
    }
    
}
