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
		    int num = Integer.parseInt(br.readLine());
		    int reverse=0;
		    while(num!=0)
		    {
		        reverse = reverse*10 + num%10;
		        num/=10;
		    }
		    System.out.println(reverse);
		}
	}
}
