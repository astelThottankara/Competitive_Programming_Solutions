/*

    author - astelThottankara

*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
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
            int[] a = new int[n];
            HashSet<Integer> hm = new HashSet<>();
            HashSet<Integer> hs = new HashSet<>();
            int[] freq = new int[1001];
            for(int i=0;i<n;i++)
            {
                a[i] = fr.ni();
                freq[a[i]]++;
            }
            long prev = -1;
            boolean flag = true;
            for(int i=0;i<n;i++)
            {
                if(!hs.contains(freq[a[i]]))
                {
                    if(prev!=a[i])
                    {
                        hs.add(freq[a[i]]);
                    }
                }
                else if(hs.contains(freq[a[i]]) && prev!=a[i])
                {
                    flag = false;
                    break;
                }
                
                prev = a[i];
            }
            if(flag)
                pw.println("YES");
            else
                pw.println("NO");
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
