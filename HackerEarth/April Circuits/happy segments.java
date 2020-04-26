import java.io.*;
import java.util.*;
 
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = in.nextInt();;
        int[] h = new int[m];
        for(int i=0;i<m;i++)
            h[i] = in.nextInt();
        int q = in.nextInt();
        int[][] freq = new int[n][m];
        for(int j=0;j<n;j++)
            for(int i=0;i<=j;i++)
            {
                freq[j][a[i]-1]++;
            }
        while(q-->0)
        {
            int l = in.nextInt();
            int r = in.nextInt();
            boolean flag = true;
            if(l==1)
            {
                for(int i=0;i<m;i++)
                    if(freq[r-1][i]!=0 && freq[r-1][i]!=h[i])
                    {
                        flag = false;
                        break;
                    }
            }
            else
            {
                int temp;
                for(int i=0;i<m;i++)
                {
                    temp = freq[r-1][i] - freq[l-2][i];
                    if(temp!=0 && temp!=h[i])
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
                w.println(1);
            else
                w.println(0);
        }
        w.flush();
        w.close();
    }
    
}

