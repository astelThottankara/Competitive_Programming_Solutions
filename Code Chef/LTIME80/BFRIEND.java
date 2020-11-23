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
            int a = fr.ni();
            int b = fr.ni();
            int c = fr.ni();
            int[] floor = new int[n];
            boolean found = false;
            long time=0,min=Integer.MAX_VALUE,temp;
            for(int i=0;i<n;i++)
            {
                floor[i] = fr.ni();
                if(!found)
                {
                    if(floor[i]>=a && floor[i]<=b)
                    {
                        time = (b-floor[i])+c+(floor[i]-a);
                        found = true;
                    }
                    else if(floor[i]>=b && floor[i]<=a)
                    {
                        time = (a-floor[i])+c+(floor[i]-b);
                        found = true;
                    }
                    else
                    {
                        temp = Math.abs(floor[i]-a);
                        if(temp<min)
                            min = temp;
                        temp = Math.abs(floor[i]-b);
                        if(temp<min)
                            min = temp;
                    }
                }
            }
            if(found)
                pw.println(time);
            else
            {
                time = Math.abs(a-b)+c+2*min;
                pw.println(time);
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
