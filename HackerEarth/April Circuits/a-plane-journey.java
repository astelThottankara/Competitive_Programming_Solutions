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
            int i=n-1,j=m-1;
            int trips=0,temp=0;
            int source=m,destination=0;
            int reached = 0;
            boolean[] firstTrip = new boolean[m];
            while(j>=0 && i>=0 && b[j]>=a[i])
            {
                if(!firstTrip[j])
                {
                    temp=1;
                    reached++;
                    firstTrip[j]=true;
                    i--;
                    
                    if(temp>trips)
                        trips = temp;
                    if(i>=0 && j>=1 && b[j-1]>=a[i])
                    {
                        if(temp>trips)
                            trips = temp;
                        j--;
                    }   
                    continue;
                }
                if(i>=1 && j>=1 && b[j-1]>=a[i-1])
                {
                    if(temp>trips)
                        trips = temp;
                    j--;
                }   
                temp += 2;
                i--;
                reached++;
                if(trips<temp)
                    trips = temp;
                if(j==0 && trips==temp)
                    break;
                 
            }
            int remaining = n-reached;
            if(remaining>0)
                trips += 2*(remaining/m + 1);
            pw.println(trips);

        }
        pw.flush();
        pw.close();
    }
}
