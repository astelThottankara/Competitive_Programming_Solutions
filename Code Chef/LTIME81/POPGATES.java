/*

    author - astelThottankara

*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

	public static void main (String[] args) throws IOException
	{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String s1=br.readLine(); 
	    if(s1!=null)
        {
    	   int a=Integer.parseInt(s1);
    	   int n=0,k=0;
           for(int i=1;i<=a;i++)
	       {
            String s=br.readLine();
            if(s!=null)
            {
                s=s.trim();
                n=Integer.parseInt(s.substring(0,s.indexOf(" ")));
                k=Integer.parseInt(s.substring(s.indexOf(" ")+1));
                String c[]=br.readLine().split(" ");
                int l=c.length-1;
                int y=k;
                while(k>0&&l>=0)
                     {
                         if(c[l].equals("H"))
                         {
                             for(int j=0;j<l;j++)
                             {
                                 if(c[j].equals("H"))
                                 c[j]="T";
                                 else
                                 c[j]="H";
                             }
                         }
                         l--;
                         k--;
                     }
                     int o=0;
                     for(int j=0;j<(c.length-y);j++)
                     {
                         if(c[j].equals("H"))
                         o++;
                     }
                     System.out.println(o);
            	    
            	}
            
            }
        }
	}
}
