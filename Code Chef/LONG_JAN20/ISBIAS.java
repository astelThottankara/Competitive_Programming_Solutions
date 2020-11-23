/*

    author - astelThottankara

*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer; 

class CodeChef 
{
    public static void main(String args[] ) throws Exception 
    {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = fr.ni();
        int q = fr.ni();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = fr.ni();
        while(q-->0)
        {
            int l = fr.ni()-1;
            int r = fr.ni()-1;
            if((r-l)==1)
            {
                pw.println("NO");
                continue;
            }
            if(a[l]>a[l+1])
            {
                if(a[r-1]<a[r])
                    pw.println("YES");
                else
                    pw.println("NO");
            }
            else
            {
                if(a[r-1]>a[r])
                    pw.println("YES");
                else
                    pw.println("NO");
            }
        }
        pw.flush();
        pw.close();
    }
    
    static long power(long b,long e)
    {
        long result = 1;
        while(e>0)
        {
            if(e%2==1)
                result = b*result;
            b = b * b;
            e>>=1;
        }
        return result;
    }
}

class FastReader
{
    BufferedReader br;
    StringTokenizer st;
        
    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
        
    String next()
    {
        while(st == null || !st.hasMoreTokens())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
        
    int ni()
    {
        return Integer.parseInt(next());
    }
       
    long nl()
    {
        return Long.parseLong(next());
    }
        
    double nd()
    {
        return Double.parseDouble(next());
    }
        
    String ns()
    {
        return next();
    }
}
