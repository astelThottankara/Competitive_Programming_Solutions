/*
    author - astelThottankara
*/

import java.util.*;

class TestClass 
{
    private static Scanner s = new Scanner(System.in);

    public static void queryOne(int[] arr)
    {
        int L = s.nextInt();
        int R = s.nextInt();
        int X = s.nextInt();
        for(int i=L-1;i<R;i++)
            arr[i] |= X;
        
    }

    public static void queryTwo(int[] arr)
    {
        int L = s.nextInt();
        int R = s.nextInt();
        int X = s.nextInt();
        for(int i=L-1;i<R;i++)
            arr[i] &= X;
            
    }

    public static void queryThree(int[] arr)
    {
        int L = s.nextInt();
        int R = s.nextInt();
        int X = s.nextInt();
        for(int i=L-1;i<R;i++)
            arr[i] ^= X;
            
    }

    public static void queryFour(int[] arr)
    {
        int L = s.nextInt();
        int R = s.nextInt();
        long sum=0;
        for(int i=L-1;i<R;i++)
            sum += arr[i];
            
        System.out.println(sum);
    }

    public static void queryFive(int[] arr)
    {
        int L = s.nextInt();
        int R = s.nextInt();
        long xor=arr[L-1];
        for(int i=L;i<R;i++)
            xor ^= arr[i];
            
        System.out.println(xor);
    } 

    public static void main(String args[] ) throws Exception 
    {
        int n = s.nextInt();
        int[] arr = new int[n];
        int q = s.nextInt();
        int query;
        while(q-->0)
        {
            query = s.nextInt();
            switch(query)
            {
                case 1:
                    queryOne(arr);
                    break;
                case 2:
                    queryTwo(arr);
                    break;
                case 3:
                    queryThree(arr);
                    break;
                case 4:
                    queryFour(arr);
                    break;
                case 5:
                    queryFive(arr);
                    break;
                default:
                    break;
                
            }
        }
    }
}
