/*

    author - astelThottankara

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class Solution 
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
            num=1;
            int a=j-1,b=j+1;
            while(b<n && block[b++]==0)
                num++;
            while(a>=0 && block[a--]==0)
                num++;
            if(num>max)
                max = num;
        }
        System.out.println(max);
    }
}
