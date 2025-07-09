import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The String1: ");
        String s1=s.nextLine();
        System.out.println("Enter The String2: ");
        String s2=s.nextLine();
        s1=s1.replaceAll("\\s", "");
        s2=s2.replaceAll("\\s", "");
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))

        {
            System.out.println("Strings Are Anagram");
        }
        else{
            System.out.println("Strings Are Not Anagrams");
        }

        
        
    }
    
}
