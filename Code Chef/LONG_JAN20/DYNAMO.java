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
            long n = fr.nl();
            long max = power(10,n);
            long a = fr.nl();
            long sum = a+2*max;
            pw.println(sum);
            pw.flush();
            long b = fr.nl();
            long c = max-b;
            pw.println(c);
            pw.flush();
            long d = fr.nl();
            long e = max-d;
            pw.println(e);
            pw.flush();
            int r = fr.ni();
            if(r==-1)
                System.exit(0);
        }
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
