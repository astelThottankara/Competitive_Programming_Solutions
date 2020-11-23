import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            char prev = ',';
            int count=0;
            for(int i=0;i<n;i++)
            {
                //System.out.println(prev+" "+s.charAt(i));
                if(s.charAt(i)!=prev)
                {
                    prev = s.charAt(i);
                    count++;
                }
            }
            
            System.out.println(count);
        }

    }
}
