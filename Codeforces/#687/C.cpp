#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
	int n, p, k, x, y;
	string a;
	cin >> n >> p >> k >> a >> x >> y;
	int dp[n] = {0};
	int res = 0, minRes = INT_MAX;

	// Precomputed number of zeroes encountered for every shift of cost "y"
	for(int i=n-1; i>=0; i--) {
		if(a[i] == '0')
			dp[i] += 1;
		if(i+k < n)
			dp[i] += dp[i+k];	
	}

	// Finding minimum value by incorporating "x" and "y" as required
	for(int i=p-1; i<n; i++) {
		res = (i-p+1)*y + dp[i]*x;
		if(res < minRes)
			minRes = res;
	}
	cout << minRes << '\n';
}

int main() {
	boost;
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}