#include <bits/stdc++.h>
using namespace std;

void printResult(long a[], long n) {
	long long result = 0, sum = 0;
	for(int i=0;i<n;i++) {
		result |= a[i];
		sum += a[i];
		result |= sum;
	}
	cout << result << endl;
}

int main() {
	int t;
	cin >> t;
	while(t--) {
	    int n;
		cin >> n;
		long a[n];
		for(int i=0;i<n;i++)
			cin >> a[i];
		printResult(a, n);
	}
	return 0;
}