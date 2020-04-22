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
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String[] in = br.readLine().split(" ");
		    int n = Integer.parseInt(in[0]);
		    int q = Integer.parseInt(in[1]);
		    int lift=0;
		    long floors=0;
		    while(q-->0)
		    {
		        String[] fd = br.readLine().split(" ");
		        int f = Integer.parseInt(fd[0]);
		        int d = Integer.parseInt(fd[1]);
		        floors += Math.abs(lift-f);
                floors += Math.abs(f-d);
		        lift = d;
		    }
		    System.out.println(floors);
		}
	}
}
