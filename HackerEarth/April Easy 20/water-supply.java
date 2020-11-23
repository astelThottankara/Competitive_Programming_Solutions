/*

    author - astelThottankara

*/
import java.io.*;
import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in;
        for(int i=1;i<n;i++)
        {
            in = br.readLine().split(" ");
        }
        int[] block = new int[n];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<n;i++)
        {
            block[i] = Integer.parseInt(inp[i]);
        }
        int num=0;
        int max=-1;
        for(int j=0;j<n;j++)
        {
            left=1;
            right=1;
            int a=j-1,b=j+1;
            while(b<n && block[b++]==0)
                right++;
            while(a>=0 && block[a--]==0)
                left++;
            if(left>right)
                num=left;
            else
                num = right;
            if(num>max)
                max = num;
        }
        System.out.println(max);
    }
}

