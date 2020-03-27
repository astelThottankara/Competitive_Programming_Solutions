import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long sum=0;
        long a,b;
        for(int i=0;i<n;i++)
        {
            a = s.nextLong();
            b = s.nextLong();
            sum = a+b;
            System.out.println(sum/2);
        }
    }
}
