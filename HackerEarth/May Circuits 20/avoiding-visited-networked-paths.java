import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer; 

public class Test
{
    private static long f[] = {107,1361,10000019};
    private static long mod = (long)(1e9+7);
    private static int c1,c2,c3;
    
    public static void main(String args[] ) throws Exception 
    {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = fr.ni();
        int m = fr.ni();
        long[][] val = new long[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                val[i][j] = fr.nl();
        long[][][][][] dp = new long[n][m][3][3][2];
        factors(val[0][0]);
        long d;
        if(!(c1>=2 && c2>=2 && c3>=1))
            dp[0][0][c1][c2][c3] = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 && j==0)
                    continue;
                factors(val[i][j]);
                for(int p=0;p<3;p++)
                    for(int q=0;q<3;q++)
                        for(int r=0;r<2;r++)
                        {
                            if(i>=1)
                                dp[i][j][Math.min(2,c1+p)][Math.min(2,c2+q)][Math.min(1,c3+r)]=(dp[i][j][Math.min(2,c1+p)][Math.min(2,c2+q)][Math.min(1,c3+r)] + dp[i-1][j][p][q][r])%mod;
                            if(j>=1)
                                dp[i][j][Math.min(2,c1+p)][Math.min(2,c2+q)][Math.min(1,c3+r)]=(dp[i][j][Math.min(2,c1+p)][Math.min(2,c2+q)][Math.min(1,c3+r)] + dp[i][j-1][p][q][r])%mod;
                        }
            }
        }
        long res=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                for(int k=0;k<2 && !(i==2 && j==2 && k==1);k++)
                    res = (res + dp[n-1][m-1][i][j][k])%mod;
        pw.println(res);
        pw.flush();
        pw.close();
    }
    
    static void factors(long d)
    {
        c1=c2=c3=0;
        while(d%f[2]==0 && c3<=1)
        {
            d/=f[2];
            c3++;
        }
        while(d%f[0]==0 && c1<=2)
        {
            d/=f[0];
            c1++;
        }
        while(d%f[1]==0 && c2<=2)
        {
            d/=f[1];
            c2++;
        }
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
