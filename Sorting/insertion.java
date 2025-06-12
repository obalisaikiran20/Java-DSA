public class insertion {
    public static void main(String[] args) {
        int a[]={1,32,5,76,545,34,65};
        System.out.println("Array Before Insertion Sort:");
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Array After Inertion Sort:");
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int k=a[i];
            int j=i-1;
            while(j>=0&& a[j]>k)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
        for(int y:a)
        {
            System.out.print(y+" ");
        }
    }
}
