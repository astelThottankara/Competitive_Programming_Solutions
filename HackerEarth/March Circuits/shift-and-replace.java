import java.util.*;

class TestClass 
{
    /*public static void shift(ArrayList<Integer> al,int n)
    {
        int temp=al.get(0);
        al.remove(0);
        al.add(temp);
    }*/

    public static int checkIdentity(ArrayList<Integer> al,int k,int n,int fac)
    {
        int count=k;
        while(fac<n)
            fac -= n;
        for(int i=0;i<n;i++)
        {
            if(al.get(i-(fac-n))!=i+1)
                count++;
        }
        return count;
    }

    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp;
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int q = s.nextInt();
        int x,b;
        while(q-->0)
        {
            x = s.nextInt();
            b = s.nextInt();
            a[x-1]=b;
            ArrayList<Integer> al = new ArrayList();
            for(int i=0;i<n;i++)
                al.add(a[i]);
            
            int min=100000000;
            int var=0;
            
            //al.set(x-1,b);
            for(int i=0;min>=i;i++)
            {
                if(i==0)
                {
                    var = checkIdentity(al,i,n,0);
                    if(var<min)
                        min = var;
                }
                else
                {
                    //shift(al,n);
                    var = checkIdentity(al,i,n,i);
                    if(var<min)
                        min = var;
                }
                //for(int j=0;j<n;j++)
                  //  System.out.print(al.get(j)+" ");
                //System.out.println(" - "+var);    
            }
            System.out.println(min);
        }
    }
}
