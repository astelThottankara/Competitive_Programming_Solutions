#include <bits/stdc++.h>
using namespace std;

#define ll long long int

void solve() {
	ll n, c0, c1, h, i;
	string s;
	scanf("%lld %lld %lld %lld", &n, &c0, &c1, &h);
	cin >> s;
	ll freq0=0, freq1=0, sum=0;
	for(i=0;i<n;i++) {
		if(s[i]=='0'){
			sum += c0;
			freq1++;
		} else {
			sum += c1;
			freq0++;
		}
	}
	ll temp = sum;
	for(i=0;i<n;i++) {
		if(s[i]=='1') {
			if(((temp-c1)+c0+h < temp)) {
				temp = temp - c1 + c0 + h;
			}
		} else {
			if(((temp-c0)+c1+h < temp)) {
				temp = temp - c0 + c1 + h;
			}
		}
	}
	printf("%lld\n", temp);
}

int main() {
	ll t;
	scanf("%lld", &t);
	while(t--) 
		solve();
	return 0;
}
