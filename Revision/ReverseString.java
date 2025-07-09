import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String s=sc.nextLine();
        System.out.println("Original String is: "+s);
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            rev+=c;
        }
        System.out.println("Reversed String is: "+rev);
    }
    
}
