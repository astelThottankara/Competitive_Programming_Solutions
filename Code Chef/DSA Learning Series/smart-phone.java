import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] budget = new long[n];
		for(int i=0;i<n;i++)
		    budget[i] = s.nextLong();
		Arrays.sort(budget);
		long revenue=0;
		long max=-1;
		for(int j=0;j<n;j++)
		{
		    revenue = budget[j]*(n-j);
		    if(revenue>max)
		        max = revenue;
		}
		System.out.println(max);
	}
}
