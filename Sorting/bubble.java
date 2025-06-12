import java.util.Arrays;

public class bubble
{
    public static void main(String[] args) {
       int a[]={1,3,4,6,78,5};
       int n=a.length;
       System.out.println("Array Before Sorting");
       for(int x:a)
       {
        System.out.print(x+" ");
       }
        System.out.println("Array After Bubble Sort");
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int y:a)
        {
            System.out.print(y+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println("Sorted Array uing Sort function");
        // System.out.println(Arrays.sort(a));
        Arrays.sort(a);System.out.print(Arrays.toString(a));
        System.out.println();
    }
}