#include <bits/stdc++.h>
using namespace std;

int primes[283146];

bool isPrime(int n) 
{ 
    if (n<=3) 
        return true; 
    if (n%2==0 || n%3==0) 
        return false; 
    for (int i=5; i*i<=n; i=i+6) 
        if (n%i==0 || n%(i+2)==0) 
            return false; 
    return true; 
} 

void processPrime() 
{ 
	int l=0;
    for (int i=4*1e6; i>=2; i--) { 
        if (isPrime(i)) 
            primes[l++] = i;
    } 
} 

void solve() {
	int n, l=0, k=283146;
	cin >> n;
	int b[n--], res[n+1];
	map<int, int> end;
	int max = 0;
	//set<int> blocked;
	//set<int>::iterator itr;
	for(int i=0;i<=n;i++) {
		scanf("%d", &b[i]);
		if(b[i] > max)
			max = b[i];
	}
	for(int i=0;i<=n;i++) {
		if(b[i]==(i+1)) {
			if(end.find(b[i])!=end.end()) 
				res[i] = res[i] = end.at(b[i]);
			else
				res[i] = primes[l++]; 
		} else {
			if(end.find(b[i])!=end.end()) {
				res[i] = end.at(b[i]);
			} else {
				end.insert({b[i], primes[--k]});
				res[i] = primes[k];
			}
		}
	}
	for(int i=0;i<=n;i++)
		printf("%d ", res[i]);
	printf("\n");
}

int main() {
	processPrime();
	int t;
	scanf("%d", &t);
	while(t--)
		solve();
	return 0;
}
