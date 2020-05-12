import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
	    int t = Integer.parseInt(br.readLine());
        while(t-->0)
	    {
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int q = Integer.parseInt(in[1]);
            String s = br.readLine();
            while(q-->0)
            {
                int c = Integer.parseInt(br.readLine());
                long que=0;
                int[] freq = new int[26];
                for(int i=0;i<s.length();i++)
                    freq[s.charAt(i)-'a']++;
                for(int i=0;i<26;i++)
                    freq[i] -= c;
                for(int i=0;i<26;i++)
                    if(freq[i]>0)
                        que += freq[i];
                pw.println(que);
            }
        }
        pw.close();
	}
}
