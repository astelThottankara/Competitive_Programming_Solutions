import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        while(t-->0)
        {
            String[] in = br.readLine().split(" ");
            long n = Long.parseLong(in[0]);
            long k = Long.parseLong(in[1]);
            ArrayList<Long> al = new ArrayList<>();
            if(k>=n)
                k = k%n;
            for(long i=(2*k+2)>n?(2*k+2)%n:(2*k+2);i<=n;i++)
                al.add(i);
            for(long i=1;i<((2*k+2)>n?(2*k+2)%n:(2*k+2));i++)
                al.add(i);
            while(true)
            {
                if(al.size()==1)
                    break;

                if(al.size()%2==0)
                {
                    for(long i=0;i<n;i+=2)
                        al.remove(i);    
                }
                else
                {
                    for(long i=0;i<n;i+=2)
                        al.remove(i);
                    al.add(0,n);
                }
                System.out.println(al);
            }
            if(al.size()==2)
                System.out.println(al.get(1));
            else
                System.out.println(al.get(0));
            
        }
        pw.flush();
        pw.close();
    }
}

