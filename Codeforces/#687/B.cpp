#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
	int n, k;
	cin >> n >> k;
	int c[n];
	set<int> st;
	int max = -1, maxFreq = -1;

	// Created a set with all the values of colors that are present
	for(int i=0; i<n; i++) {
		cin >> c[i];
		st.insert(c[i]);
	}
	int days=0, minDays=INT_MAX;
	set<int>::iterator itr;

	// Brute force
	// Checked minimum days for each color in set by starting from leftmost number not equal to the current color
	for(itr=st.begin(); itr!=st.end(); itr++) {
		days = 0;
		for(int i=0; i<n; i++) {
			if(c[i]!=*itr) {
				days++;
				i+=k-1;
			}
		}
		if(days < minDays)
			minDays = days;
	}
	cout << minDays << '\n';
}

int main() {
	boost;
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}