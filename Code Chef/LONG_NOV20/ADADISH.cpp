#include <bits/stdc++.h>
using namespace std;

void solve() {
	int n, k, i;
	cin >> n;
	int c[n--];
	for(i=0;i<=n;i++)	
		cin >> c[i];
	sort(c, c+n+1);
	int burnerA=0, burnerB=0;
	for(int i=n;i>=0;i--) {
		if(burnerA <= burnerB) {
			burnerA += c[i];
		} else {
			burnerB += c[i];
		}
	}
	cout << max(burnerA, burnerB) << endl;
}

int main() {
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}