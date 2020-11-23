import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] ip = br.readLine().split(" ");
            int n = Integer.parseInt(ip[0]);
            int k = Integer.parseInt(ip[1]);
            int[] a = new int[n];
            String[] in = br.readLine().split(" ");
            for(int i=0;i<n;i++)
                a[i] = Integer.parseInt(in[i]);
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<n;j+=k)
                    for(int l=0;l<n-j-k;l++)
                    {
                        if(a[l]>a[l+k])
                        {
                            int temp = a[l];
                            a[l] = a[l+k];
                            a[l+k] = temp;
                        }
                    }
            }
            boolean flag = true;
            for(int i=0;i<n-1;i++)
                //System.out.println(a[i]);
                if(a[i+1]<a[i])
                {
                    flag = false;
                    break;
                }
            if(flag)
                System.out.println("yes");
            else
                System.out.println("no");
        }
	}
}
