#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
    int n;
    cin >> n;
    if(n%2==0) {
        for(int i=n;i>0;i--)
            cout << i << " ";
    } else {
        for(int i=2;i<=n;i++)
            cout << i << " ";
        cout << 1;
    }
    cout << endl;
}

int main() {
	boost;
	int t;
    cin >> t;
    while(t--)
        solve();
	return 0;
}
