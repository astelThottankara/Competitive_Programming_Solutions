#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

int main() {
	boost;
	int n, m, k, i, j, q, count = 0;
	cin >> n >> m >> k;
	int t[n][k];
	int tot[n] = {0};
	for(i=0;i<n;i++) {
		for(j=0;j<k;j++) {
			cin >> t[i][j];
			tot[i] += t[i][j];
		}
		cin >> q;
		if(tot[i] >= m && q <= 10)
			count++;
	}
	cout << count;
	return 0;
}
