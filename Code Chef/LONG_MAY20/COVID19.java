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
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            boolean[] infected = new boolean[11];
            String[] in = br.readLine().split(" ");
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(in[i]);
                infected[a[i]] = true;
            }
            int min=50,max=-1,temp=0;
            boolean flag = true;
            for(int i=0;i<11;i++)
            {
                if(!flag)
                {
                    temp=0;
                    flag = true;
                }
                if(infected[i])
                {
                    temp++;
                    if((i+2)<=10 && !infected[i+1] && !infected[i+2])
                    {
                        if(temp<min)    
                            min = temp;
                        //pw.println(temp+" ||");
                        if(temp>max)
                            max = temp;
                        //pw.println(temp+" ??");
                        flag = false;
                        i+=2;
                    }
                }
            }
            if(temp>max)
                max = temp;
            if(temp<min && temp!=0)    
                min = temp;
            pw.println(min+" "+max);
        }
        pw.close();
	}
}
