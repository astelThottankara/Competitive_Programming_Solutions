import java.io.*;

class TestClass 
{    
    static int amoebaCounter(long n,long k)
    {
        long beaker2 = 0;
        long beaker1 = 0;
        int days=0;
        while(beaker1+beaker2<k)
        {
            if(beaker2==0)
            {
                beaker2 = 1;
                days++;
                continue;
            }
            else if(beaker2<=n)
                beaker2 *= 2;

            if(beaker2>n)
            {
                beaker1 += n;
                beaker2 = 0;
            }

            days++;
        }
        return days;
    }

    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] in = br.readLine().split(" ");
            long n = Long.parseLong(in[0]);
            long k = Long.parseLong(in[1]);
            pw.println(amoebaCounter(n,k));
        }
        pw.close();
        br.close();
    }
}
