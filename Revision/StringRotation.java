import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1=sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("No");
        }
        String temp=s1+s1;
        if(temp.contains(s2))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
