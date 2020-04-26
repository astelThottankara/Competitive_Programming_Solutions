import java.io.*;
import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int[] a = new int[n];
        String[] ia = br.readLine().split(" ");
        for(int i=0;i<n;i++)
            a[i] = Integer.parseInt(ia[i]);
        int[] b = new int[m];
        String[] ib = br.readLine().split(" ");
        for(int i=0;i<m;i++)
            b[i] = Integer.parseInt(ib[i]);
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n-1]>b[m-1])
            pw.println(-1);
        else
        {
            boolean[] trip = new boolean[n];
            Arrays.fill(trip,false);
            int i=n-1,j=m-1,trips=0,temp=0;
            boolean secondTrip = false;
            while(true)
            {
                if(b[j]>=a[i] && trip[i]==false)
                {
                    trip[i] = true;
                    j--;
                    i--;
                    temp++;
                }
                else if(b[j]>=a[i] && trip[i]==true)
                {
                    i--;
                }
                else 
                {
                    j--;
                }

                if(i==-1 || j==-1)
                {
                    if(secondTrip)
                    {
                        trips+=2;
                        i=n-1;
                        j=m-1;
                    }
                    else
                    {
                        secondTrip=true;
                        trips++;
                        i=n-1;
                        j=m-1;
                    }
                }

                if(temp==n)
                {
                    break;
                }   
            }
            pw.println(trips);
        }
        pw.flush();
        pw.close();
    }
}
