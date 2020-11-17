#include <bits/stdc++.h>
using namespace std;

#define ll long long int

void solve() {
	ll n, k, i;
	scanf("%lld %lld", &n, &k);
	ll a[n*k];
	for(i=0;i<n*k;i++) 
		scanf("%lld", &a[i]);
	if(n<3) {
		ll sum=0;
		for(i=0;i<n*k;i+=n) 
			sum += a[i];
		printf("%lld\n", sum);
	} else if(n%2) {
		ll sum=0;
		ll median = ceil(n/2)+1;
		for(i=n*k-median;i>=0 && k--;i-=median) {
			sum += a[i];
		}
		printf("%lld\n", sum);
	} else {
		ll sum=0;
		ll median = ceil(n/2);
		ll diff = n-median+1;
		for(i=n*k-diff;i>=0 && k--;i-=diff) {
			sum += a[i];
		}
		printf("%lld\n", sum);
	}
}

int main() {
	ll t;
	scanf("%lld", &t);
	while(t--) 
		solve();
	return 0;
}
