/*

    author - astelThottankara

*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer; 

class Codechef 
{
    public static void main(String args[] ) throws Exception 
    {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int t = fr.ni();
        while(t-->0)
        {
            int s = fr.ni();
            int w1 = fr.ni();
            int w2 = fr.ni();
            int w3 = fr.ni();
            if(w1+w2+w3<=s)
            {
                pw.println(1);
                continue;
            }
            if(w1<w3)
            {
                if(w1+w2<=s)
                    pw.println(2);
                else
                {
                    if(w2+w3<=s)
                        pw.println(2);
                    else
                        pw.println(3);
                }
            }
            else
            {
                if(w2+w3<=s)
                    pw.println(2);
                else
                {
                    if(w2+w1<=s)
                        pw.println(2);
                    else
                        pw.println(3);
                }
            }
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
