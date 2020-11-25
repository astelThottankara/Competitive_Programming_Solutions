#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
    int n, i;
    cin >> n;
    int a[n];
    map<int, int> mp;
    for(i=0;i<n;i++) {
        cin >> a[i];
        if(mp.find(a[i])==mp.end())
            mp.insert(make_pair(a[i], i+1));
        else
            mp.find(a[i])->second = -1;
    }
    for(auto itr: mp)
        if(itr.second != -1) {
            cout << itr.second << '\n';
            return;
        }
    cout << "-1\n";
}

int main() {
	boost;
	int t;
    cin >> t;
    while(t--)
        solve();
	return 0;
}