import java.util.*;

class TestClass 
{
    public static int columnSearch(long[][] arr,long value)
    {
        for(int i=0;i<10;i++)
        {
            if(arr[i][0]==value)
                return i;
        }
        return -1;
    }

    public static boolean rowSearch(long[][] arr,long value,int row)
    {
        for(int i=1;i<10;i++)
        {
            if(arr[row][i]==value)
            {
                arr[row][i]=0;
                return true;
            }
        }
        return false;
    }

    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long[][] man = new long[10][10];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                man[i][j] = s.nextLong();
            }
        }
        long handshakes = (n*n-n)/2;
        for(int i=0;i<10;i++)
        {
            for(int j=1;j<10;j++)
            {
                if(man[i][j]==0)
                    continue;
                int x = columnSearch(man,man[i][j]);
                if(x==-1)
                {
                    handshakes--;
                    man[i][j]=0;
                }
                else
                {
                    if(rowSearch(man,man[i][0],x))
                    {
                        handshakes--;
                        man[i][j]=0;
                    }
                    else 
                    {
                        handshakes--;
                        man[i][j]=0;
                    }
                }
                            
            }
        }
        System.out.println(handshakes);
    }
}
