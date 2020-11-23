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
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int s = Integer.parseInt(in[1]);
            int[] p = new int[n];
            String[] ip = br.readLine().split(" ");
            for(int i=0;i<n;i++)
                p[i] = Integer.parseInt(ip[i]);
            int[] position = new int[n];
            String[] im = br.readLine().split(" ");
            for(int i=0;i<n;i++)
                position[i] = Integer.parseInt(im[i]);
            boolean check = false;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n/* && j!=i && position[j]!=position[i]*/;j++)
                {
                    int total= p[i] + p[j];
                    if(j==i)
                        continue;
                    else if(position[i]==position[j])
                        continue;
                    check = false;
                    if(total<=(100-s))
                    {
                        check = true;
                        break;
                    }
                }
                if(check)
                {
                    break;
                }
            }
            if(check)
                pw.println("yes");
            else
                pw.println("no");
        }
	      pw.flush();
        pw.close();
	}
}
