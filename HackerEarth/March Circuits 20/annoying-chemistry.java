import java.util.*;

class TestClass 
{
    public static long gcd(long a,long b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long y = s.nextLong();
        long p = s.nextLong();
        long q = s.nextLong();

        long a,b,c;
        a=p*y;
        b=q*x;
        long div = gcd(a,b);
        a/=div;
        b/=div;
        c=1;
        if((a*x)%p==0)
            System.out.print(a+" "+b+" "+((a*x)/p));
        else
        {
            
            while((a*x*c)%p!=0)
            {
                c++;
            }
            System.out.print((a*c)+" "+(b*c)+" "+((a*x*c)/p));
        }
    }
}
