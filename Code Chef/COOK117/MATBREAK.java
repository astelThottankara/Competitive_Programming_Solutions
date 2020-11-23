/* 

    author - astelThottankara

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static long mod = 1000000007;
    
    static long ex(long base,long expo)
    {
        long result=1;
        if(base==0)
            return 0;
        while(expo>0)
        {
            if((expo&1)==1)
                result = (result*base)%mod;
            expo = expo>>1;
            base = (base*base)%mod;
        }
        return result%mod;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String[] in = br.readLine().split(" ");
		    long n = Long.parseLong(in[0]);
		    long a = Long.parseLong(in[1]);
		    long sum=0,var;
		    long i=1;
		    while(n-->0)
		    {
		        var = ex(a,i);
		        sum = (sum + var)%mod;
		        a = ((a%mod)*(var%mod))%mod;
		        i+=2;
		    }
		    System.out.println(sum);
		}
	}
}
