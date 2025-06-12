public class selection {
    public static void main(String[] args) {
        int a[]={32,4,92,53,3246,23,43};
        System.out.println("Array before Selection Sort:");
        for(int c:a)
        {
            System.out.print(c+" ");
        }System.out.println();
        System.out.println("Array After Selection Sort:");
        int n=a.length;
        for(int i=0;i<n-1;i++)

        {
            int m=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[m])
                {
                    m=j;
                }
            }
            int t=a[m];
            a[m]=a[i];
            a[i]=t;
        }
        for(int m:a)
        {
            System.out.print(m+" ");
        }
    }
}
