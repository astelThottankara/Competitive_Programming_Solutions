#include <bits/stdc++.h>
using namespace std;

void solve() {
	int n, q, count=1;
	scanf("%d %d", &n, &q);
	int a[n];
	scanf("%d", &a[0]);
	for(int i=1;i<n;i++) {
		scanf("%d", &a[i]);
		count += (a[i-1]!=a[i]); 
	}
	while(q--) {
		int x, y;
		scanf("%d %d", &x, &y);
		x--;
		if(a[x] != y) {
			if(x>0) {
				count -= a[x-1]!=a[x];
				count += y!=a[x-1];
			}
			if(x+1<n) {
				count -= a[x+1]!=a[x];
				count += y!=a[x+1];
			}
		}
		a[x] = y;
		printf("%d\n", count);
	}
}

int main() {
	int t;
	scanf("%d", &t);
	while(t--)
		solve();
	return 0;
}