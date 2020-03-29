#include <iostream>
#include <bits/stdc++.h> 

using namespace std;

int main()
{

        int t;
		scanf("%d", &t);
        int n=0;
        int min;
        while(t-->0)
        {
            scanf("%d", &n);
            int a[n];
            for(int i=0;i<n;i++)
            {
                scanf("%d", &a[i]);
            }
            int var;

            sort(a,a+n);
            int min = INT_MAX;
            
            for(int i=0;i<n-1;i++)
            {
               var = a[i]^a[i+1];
                if(var<min)
                    min = var;
            }

            printf("%d\n", min);

        }
}
