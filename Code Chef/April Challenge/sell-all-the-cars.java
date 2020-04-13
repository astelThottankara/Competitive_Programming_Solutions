import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine());
		    String in[] = br.readLine().split(" ");
		    int[] car = new int[n];
		    for(int i=0;i<n;i++)
		        car[i] = Integer.parseInt(in[i]);
		    Arrays.sort(car);
		    long sum=0;
		    for(int i=n-1,j=0;i>=0;i--,j++)
		    {
		        if(car[i]-j>0)
		            sum = (sum+car[i]-j)%1000000007;
		    }
		    System.out.println(sum);
		}
	}
}
