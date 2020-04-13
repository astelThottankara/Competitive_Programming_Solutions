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
		    int[] a = new int[n];
		    String[] in = br.readLine().split(" ");
		    for(int i=0;i<n;i++)
		        a[i] = Integer.parseInt(in[i]);
		    boolean inLine = true;
		    int index=-1;
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]==1 && index==-1)
		        {
		            index=j;
		        }
		        else if(a[j]==1 && index!=-1)
		        {
		            if(j-index<=5)
		            {
		                inLine = false;
		                break;
		            }
		            else
		                index=j;
		        }
		    }
		    if(inLine)
		        System.out.println("YES");
		    else    
		        System.out.println("NO");
		}
	}
}
