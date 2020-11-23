/*
	author - astelThottankara
*/

import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        int a,b;
	        while(t-->0)
	        {
	            a=s.nextInt();
	            b = s.nextInt();
	            if(a/10==0 || b/10==0)
	                System.out.println(a+b);
	            else if(a/10<b%10)
	            {
	                a = (b%10)*10+a%10+(b/10)*10+a/10;
	                System.out.println(a);
	            }
	            else if(b/10<a%10)
	            {
	                a = (a%10)*10+b%10+(a/10)*10+b/10;
	                System.out.println(a);
	            }
	            else
	                System.out.println((a+b));
	        }
	}			
}
