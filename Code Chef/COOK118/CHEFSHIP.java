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
            char[] s = fr.ns().toCharArray();
            StringHash sh = new StringHash(s);
            int count=0,n; 
            n=s.length;
	    for(int i=2;i<=n-2;i+=2)
	    {
	        int l1=0,r1=i/2-1; 
                int l2=r1+1,r2=i-1;
	        int l3=i,r3=(i+n)/2-1; 
	        int l4=r3+1,r4=n-1;
                boolean c1 = sh.getHash(l1,r1)==sh.getHash(l2,r2);
	        boolean c2 = sh.getHash(l3,r3)==sh.getHash(l4,r4);
                if(c1&&c2) count++;
            }
            pw.println(count);
        }
        pw.flush();
        pw.close();
    }
}

class StringHash
{
    long[] hash,power;
    long p=31,mod=(long)1e9+7;
    int n;
    
    StringHash(char[] s)
    {
        this.n = s.length;
        hash = new long[n+1];
        power = new long[n+1];
        util(s);
    }
    
    void util(char[] s)
    {
        power[0] = 1;
        for(int i=n-1;i>=0;i--)
        {
            hash[i] = (hash[i+1]*p)%mod+(s[i]-'a'+1)%mod;
            power[n-i] = (power[n-i-1]*p)%mod;
        }
        power[n] = (power[n-1]*p)%mod;
    }
    
    long getHash(int l,int r)
    {
        return (mod-(hash[r+1]*power[r-l+1])%mod+hash[l])%mod;
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
