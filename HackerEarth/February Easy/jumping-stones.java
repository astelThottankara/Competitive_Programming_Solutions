/*
    created by astelThottankara ;)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        long[] way = new long[n];
        if(k>n)
            k = n-1;
        way[0]=1;
        way[1]=1;
        long sum=way[0]+way[1];
        for(int i=2;i<=k;i++)
        {
            way[i] = sum;
            sum = (sum+way[i])%1000000007;
        }
        for(int i=k+1;i<n;i++)
        {
            for(int j=1;j<=k;j++)
                way[i] = (way[i]+way[i-j])%1000000007;
        }
        System.out.println((way[n-1]));
    }
}
