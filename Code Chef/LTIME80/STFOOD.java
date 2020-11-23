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
        int t = fr.ni();
        while(t-->0)
        {
            int n = fr.ni();
            int[] s = new int[n];
            int[] p = new int[n];
            int[] v = new int[n];
            for(int i=0;i<n;i++)
            {
                s[i] = fr.ni();
                p[i] = fr.ni();
                v[i] = fr.ni();
            }
            int[] profit = new int[n];
            int max=-1;
            for(int i=0;i<n;i++)
            {
                profit[i] = (p[i])/(s[i]+1)*v[i];
                if(profit[i]>max)
                {
                    max = profit[i];
                }
            }
            pw.println(max);
        }
        pw.flush();
        pw.close();
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
