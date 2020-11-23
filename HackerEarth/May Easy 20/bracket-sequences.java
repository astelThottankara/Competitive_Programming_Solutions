import java.io.*;
import java.util.*;
 
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String seq = br.readLine();
        char[] s = seq.toCharArray();
        int n = seq.length();
        int count=0;
        for(int j=0;j<n;j++)
        {
            boolean flag = true;
            Stack st = new Stack();
            st.push(s[j]);
            for(int i=j+1;i<n;i++)
            {
                if(s[i]==')')
                {
                    if(st.size()==0)
                        st.push(s[i]);
                    else if(st.peek()=='(')
                    {
                        st.pop();
                        continue;
                    }
                    else
                        st.push(s[i]);
                }
                else
                    st.push(s[i]);
            }
            for(int i=0;i<j;i++)
            {
                if(s[i]==')')
                {
                    if(st.size()==0)
                        st.push(s[i]);
                    else if(st.peek()=='(')
                    {
                        st.pop();
                        continue;
                    }
                    else
                        st.push(s[i]);
                }
                else
                    st.push(s[i]);
            }
            if(st.size()==0)
                count++;
        }
        System.out.println(count);
   }
}
