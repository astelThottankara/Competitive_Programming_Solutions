/*
    author - astelThotankara
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void way(String dir)
    {
        int n = dir.length();
        char temp='q';
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {      
            if(dir.charAt(i)=='L')
            {
                if(temp!=dir.charAt(i) && temp!='R')
                {
                    temp='L';
                    x--;
                }
            }
            else if(dir.charAt(i)=='R')
            {
                if(temp!=dir.charAt(i) && temp!='L')
                {
                    temp='R';
                    x++;
                }
            }
            else if(dir.charAt(i)=='U')
            {
                if(temp!=dir.charAt(i) && temp!='D')
                {
                    temp='U';
                    y++;
                }
            }
            else if(dir.charAt(i)=='D')
            {
                if(temp!=dir.charAt(i) && temp!='U')
                {
                    temp='D';
                    y--;
                }
            }
        }
        System.out.println(x+" "+y);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		String dir;
		while(t-->0)
		{
    		n = Integer.parseInt(br.readLine());
		    dir = br.readLine();
		    way(dir);
		}
	}
}
