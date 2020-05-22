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
            int m = fr.ni();
            int[][] a = new int[n][m];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    a[i][j] = fr.ni();
            long sum = 0;
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                {
                    int x=i,y=j,c=i,b=j,d=j,z=i;
                    boolean palindrome = true;
                    sum++;
                    x--;
                    z++;
                    b--;
                    d++;
                    while(x>=0 && y>=0 && z>=0 && b>=0 && c>=0 && d>=0 && x<n && y<m && z<n && b<m && c<n && d<m)
                    {
                        if(a[c][b]!=a[c][d] || a[x][y]!=a[z][y])
                        {
                            palindrome = false;
                            break;
                        }
                        if(palindrome)
                            sum++;
                        x--;
                        z++;
                        b--;
                        d++;
                    }
                }
            pw.println(sum);
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
