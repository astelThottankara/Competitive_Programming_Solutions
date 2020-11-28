#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
	int n;
	cin >> n;
	int f[n];
	for(int i=0;i<n;i++)
		cin >> f[i];
	int gasoline = f[0], distance = 0, i=0;
	while(gasoline>0) {
		gasoline--;
		i++, distance++;
		gasoline += f[i];
		if(i==n-1)
			break;
	}
	distance += gasoline;
	cout << distance << '\n';
}

int main() {
	boost;
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}
