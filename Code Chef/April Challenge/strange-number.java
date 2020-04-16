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
        int n = Integer.parseInt(br.readLine());
        while(n-->0)
        {
            String[] in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            int count=0;
            for(int i=2;i*i<=x;i++)
                if(x%i==0)
                    while(x%i==0)
                    {
                        x/=i;
                        count++;
                    }
            if(x>1) 
                count++;
            
            if(k<=count) 
                System.out.println(1);
            else if(k>1) 
                System.out.println(0);
            else 
                System.out.println(count);
        }
	}
}
