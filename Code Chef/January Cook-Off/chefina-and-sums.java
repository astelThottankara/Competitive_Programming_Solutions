/*

    author - astelThottankara

*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
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
            long[] a = new long[n];
            long sum=0,temp=0,count=0;
            for(int i=0;i<n;i++)
            {
                a[i] = fr.ni();
                sum += a[i];
            }
            HashMap<Long,Integer> h = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                temp += a[i];
                sum -= a[i];
                h.put(temp-sum,i);
            }
            for(int i=0;i<n;i++)
            {
                if(h.containsKey(a[i]*(-1)) && h.get(a[i]*(-1))<i)
                    count++;
                if(h.containsKey(a[i]) && h.get(a[i])>=i)
                    count++;
            }
            pw.println(count);
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
