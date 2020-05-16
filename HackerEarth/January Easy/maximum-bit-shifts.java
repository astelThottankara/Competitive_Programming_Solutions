import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer; 

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

public class TestClass
{
    public static void main(String args[] ) throws Exception 
    {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = fr.ni();
        long var=0;
        while(n-->0)
        {
            var = fr.nl();
            int bits = Long.bitCount(var);
            int i=0,count=0;
            while(var!=0)
            {
                var >>= 1;
                count++;
            }
            while(count-->0)
            {
                if(bits-->0)
                {
                    var = (var<<1)|(1<<0);
                }
                else
                    var <<= 1;
            }
            pw.print(var+" ");
        }
        pw.close();
    }
}
