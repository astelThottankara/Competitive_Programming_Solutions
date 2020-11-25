#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
    int n;
    cin >> n;
    int a[n];
    map<int, int> mp;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        if(mp.find(a[i])==mp.end())
            mp.insert(make_pair(a[i], 0));
    }
    if(mp.size()==1) {
        cout << "0\n";
        return;
    }
    int current = a[0];
    map<int, int>::iterator itr;
    for(itr = mp.begin();itr != mp.end(); itr++)
        if(itr->first != a[0]) 
            itr->second += 1;
    for(int i=1;i<n;i++) {
        if(a[i] != current) {
            mp.find(current)->second++;
            current = a[i];
        }
    }
    int min = INT_MAX-3;
    for(auto itr: mp)
        if(itr.second < min)
            min = itr.second;
    cout << min << '\n';
}   

int main() {
	boost;
	int t;
    cin >> t;
    while(t--)
        solve();
	return 0;
}