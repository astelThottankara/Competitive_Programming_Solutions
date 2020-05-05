/*

    author - astelThottankara

*/

import java.io.*;
import java.lang.*;

class TestClass 
{
    static int stringChanges(String s)
    {
        int n = s.length();
        int[][] prefix = new int[n][2];
        int countA=0,countB=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='A')
                countA++;
            else   
                countB++;
            prefix[i][0] = countA;
            prefix[i][1] = countB;
        }
        int[][] changes = new int[n+2][2];
        changes[0][0] = 0;
        changes[0][1] = countA;
        changes[n+1][0] = countB;
        changes[n+1][1] = 0;
        for(int i=1;i<n+1;i++)
        {
            if(i==1)
            {
                changes[i][1] = countA - prefix[i-1][0];
                continue;    
            }
            changes[i][0] = prefix[i-2][1];
            changes[i][1] = countA - prefix[i-1][0];
        }
        int count=Integer.MAX_VALUE,temp;
        for(int i=0;i<n+2;i++)
        {
            temp = changes[i][0]+changes[i][1];
            if(temp<count)
                count = temp;
        }
        return count;
    }

    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            pw.println(stringChanges(s));
        }
        pw.close();
    }
}
