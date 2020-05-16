import java.util.*;
import java.io.*;

class TestClass 
{
    private static long mod = (long)(1e9+7);
    
    static long expo(long base,long ex)
    {
        long result = 1;
        while(ex>0)
        {
            if(ex%2==1)
                result = (result * base)%mod;
            base = (base*base)%mod;
            ex /= 2;
        }
        return result;
    }
    
    public static void main(String args[] ) throws Exception 
    {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int t = fr.ni();
        while(t-->0)
        {
            int n = fr.ni();
            int m = fr.ni();
            long one = expo(3,n+m);
            long two = expo(2,((long)n*m));
            long res = (one*two)%mod;
            System.out.println(res);
        }
        pw.close();
    }
    static class FastReader
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
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
