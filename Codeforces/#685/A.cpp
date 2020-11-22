#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
	int n, steps=0;
	cin >> n;
	if(n==1)
		cout << 0 << '\n';
	else if(n==2)
		cout << 1 << '\n';
	else if(n%2==0 || n==3)
		cout << 2 <<'\n';
	else if(n%3==0)
		cout << 3 << '\n';
	else 
		cout << 3 << '\n';
}

int main() {
	boost;
	int t;
	cin >> t;
	while(t--) {
		solve();
	}
	return 0;
}
