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
        String[] in = br.readLine().split(" ");
        int r = Integer.parseInt(in[0]);
        int c = Integer.parseInt(in[1]);
        int x = Integer.parseInt(in[2]);
        int y = Integer.parseInt(in[3]);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int s = Math.abs(x-i);
                int t = Math.abs(y-j);
                System.out.print(Math.max(s,t)+" ");
            }
            System.out.println();
        }
    }
}
