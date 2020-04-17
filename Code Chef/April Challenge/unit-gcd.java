/*

    author - astelThottankara

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    long n = Long.parseLong(br.readLine());
		    if(n==1)
		    {
		        pw.println(1);
		        pw.println("1 1");
		    }
		    else if(n==2)
		    {
		        pw.println(1);
		        pw.println("2 1 2");
		    }
		    else if(n%2==0)
		    {
		        pw.println(n/2);
                for(long j=1;j<=n/2;j++)
	                pw.println(2+" "+(2*j-1)+" "+(2*j));
	        }
	        else
	        {
	            pw.println(n/2);
	            pw.println("3 1 2 "+n);
	            for(long j=2;j<=n/2;j++)
	            {
	                pw.println(2+" "+(2*j-1)+" "+(2*j));
	            }
	        }
		}
		pw.flush();
		pw.close();
	}
}
