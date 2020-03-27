import java.util.*;

class TestClass 
{

    public static void main(String args[] ) throws Exception 
    {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p[] = new int[n-1];
        long a[] = new long[n];
        long min=1000000000;
        long count=0;
        boolean equal = true;
        for(int i=0;i<n-1;i++)
            p[i] = s.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextLong();
            if(min>a[i])
                min=a[i];
        }
        for(int j=0;j<n;j++)
            count += a[j]-min;
        if(a[0]!=0)
            System.out.println(0);
        else
            System.out.print(count);
    }
}
