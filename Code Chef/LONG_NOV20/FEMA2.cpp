#include <bits/stdc++.h>
using namespace std;

void solve() {
	int n, k;
	string s;
	scanf("%d %d", &n, &k);
	cin>>s;
	int magnet=0, iron=0, sheet=0, count=0, power, temp;
	while(magnet<n && iron<n) {
		if(s[magnet]=='M') {
			if(s[iron]=='I') {
                temp = min(iron, magnet);
                sheet = 0;
                while(++temp < max(iron, magnet)) {
                    if(s[temp]==':')
                        sheet++;
                }
				power = k + 1 - abs(magnet - iron) - sheet;
				if(power>0) {
					count++;
					magnet++;
					iron++;
				}
				else {
					if(iron > magnet)	// Checking for closer magnet 
						magnet++;
					else if(iron < magnet)	// Checking for closer iron
						iron++;
				}	
			} else if(s[iron]=='X') {
				iron++;
				magnet = iron;
				sheet = 0;
			} else {
				iron++;
			}
		} else if(s[magnet]=='X') {
			magnet++;
			iron = magnet;
			sheet = 0;
		} else {
			magnet++;
		}
	}
	printf("%d\n", count);
}

int main() {
	int t;
	scanf("%d", &t);
	while(t--)
		solve();
	return 0;
}