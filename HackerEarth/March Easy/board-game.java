/*
    author - astelThottankara
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
 
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());
        long temp=0,ways=0,term;
        while(q-->0)
        {
            ways=0;
            temp = Long.parseLong(br.readLine().trim());
            if(temp%2==0 || temp==1)
            {
                System.out.println(ways);
                continue;
            }
            ways=1;
            term = (temp-3)/2;
            if(term>29)
            {
                ways = (long)(Math.pow(2.0,28)%1000000007);
                for(int i=29;i<=term;i++)
                    ways = (ways*2)%1000000007;
            }
            ways = (long)(Math.pow(2.0,(double)term)%1000000007);
            System.out.println(ways);
        }
    }
}
