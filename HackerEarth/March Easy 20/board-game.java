/*
    author - astelThottankara
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

class TestClass 
{
    //Modular Exponentiation
    static long expo(long base,long exponent,long mod)
    {
        if(exponent==0)
            return 1;
        else if(exponent%2 == 0)        
            return expo((base*base)%mod,exponent/2,mod);
        else                   
            return (base*expo((base*base)%mod,(exponent-1)/2,mod))%mod;

    }
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
                ways = expo(2,28,1000000007);
                ways = expo(2,term-28,1000000007);
            }
            ways = expo(2,term,1000000007);
            System.out.println(ways);
        }
    }
}
