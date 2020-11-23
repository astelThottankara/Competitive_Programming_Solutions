#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

void solve() {
	string a, b;
	cin >> a >> b;
	int al = a.length(), i, steps=0;
	stack<int> st;
	if(a[0]==b[0])
		st.push(0);
	else
		st.push(1);
	for(i=2;i<al;i+=2) {
		if(a[i]==b[i] && st.top())
			st.push(0);
		else if(a[i]!=b[i] && !st.top())
			st.push(1);
	}
	while(!st.empty()) {
		if(st.top())
			steps++;
		st.pop();
	}

	if(a[1]==b[1])
		st.push(0);
	else
		st.push(1);
	for(i=3;i<al;i+=2) {
		if(a[i]==b[i] && st.top())
			st.push(0);
		else if(a[i]!=b[i] && !st.top())
			st.push(1);
	}
	while(!st.empty()) {
		if(st.top())
			steps++;
		st.pop();
	}
	cout << steps << '\n';
}

int main() {
	//boost;
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}
