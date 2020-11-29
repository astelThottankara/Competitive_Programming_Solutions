#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
	int n, m, r, c;
	cin >> n >> m >> r >> c;
	int res = max(r+c-2, max(n-r+c-1, max(m-c+r-1, n-r+m-c)));
	cout << res << '\n';
}

int main() {
	boost;
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}
