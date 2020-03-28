import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long l,r,s;
        long count=0,min=0,max=0;
        while(t-->0)
        {
            l = sc.nextLong();
            r = sc.nextLong();
            s = sc.nextLong();
            count=0;
            min=-1;
            max=-1;
            if(l>r)
            {
                System.out.println("-1 -1");
                continue;
            }
            if(l%s==0)
                min = l/s;
            else if(l+s<r)
                min = (l+s)/s;
            else if(r%s==0)
                min= r/s;

            if(min!=-1)
                max = r/s;    
            System.out.println(min+" "+max);
        }
    }
}
