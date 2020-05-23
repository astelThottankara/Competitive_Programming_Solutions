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
            int a = fr.ni();
            int b = fr.ni();
            if(a==1 || b==1 || a==b)
            {
                pw.println(-1);
                continue;
            }
            long count=0;
            int h = a>b?(a-b):(b-a);
            for(int i=1;i*i<=h;i++)
            {
                if(h%i==0)
                {
                    if(h/i==i)
                        count++;
                    else 
                        count+=2;
                }
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
