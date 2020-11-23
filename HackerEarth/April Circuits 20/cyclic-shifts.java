import java.util.*;

class TestClass 
{
    private static final long x = 16;
    
    static long left(long n, long d) 
    { 
        int[] bits = new int[16];
        for(int i=0;i<16;i++)
            if((n&(1<<i))!=0)
                bits[i]=1;
        if(d>=16)
            d = d%16;
        while(d-->0)
        {
            int temp=bits[15];
            for(int i=14;i>=0;i--)
                bits[i+1] = bits[i];
            bits[0] = temp;
        }
        long newNum=0;
        for(int i=0;i<16;i++)
            if(bits[i]==1)
                newNum |= (1<<i);
        return newNum;
    } 

    static long right(long n, long d) 
    { 
        int[] bits = new int[16];
        for(int i=0;i<16;i++)
            if((n&(1<<i))!=0)
                bits[i]=1;
        if(d>=16)
            d = d%16;
        while(d-->0)
        {
            int temp=bits[0];
            for(int i=0;i<15;i++)
                bits[i] = bits[i+1];
            bits[15] = temp;
        }
        long newNum=0;
        for(int i=0;i<16;i++)
            if(bits[i]==1)
                newNum |= (1<<i);
        return newNum;
    } 

    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            long n = s.nextLong();
            long d = s.nextLong();
            char c = s.next().charAt(0);
            if(c=='L')
                System.out.println(left(n,d));
            else if(c=='R')
                System.out.println(right(n,d));
        }
    }
}

