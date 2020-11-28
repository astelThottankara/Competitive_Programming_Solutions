#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
using namespace std;

struct Data {
	int a1, a2, b1, b2, c1, c2;
	Data(int p1, int p2, int q1, int q2, int r1, int r2) {
		a1 = p1, a2 = p2, b1 = q1, b2 = q2, c1 = r1, c2 = r2;
	}
};

void solve() {
	int n, m, count = 0;
	cin >> n >> m;
	int table[n][m];
	vector<Data*> vect;
	for (int i=0; i<n; i++) 
		for (int j=0; j<m; j++) 
			scanf("%1d", table[i] + j);
	for(int j=m-1; j>=2; j--) {
		for(int i=0; i<n; i++) {
			if(i==n-1 && table[i][j]) {
				table[i][j-1] = !table[i][j-1];
				table[i-1][j-1] = !table[i-1][j-1];
				table[i][j] = !table[i][j];
				Data* temp = new Data(i, j-1, i-1, j-1, i, j);
				vect.push_back(temp);
			} else if(table[i][j]) {
				table[i][j-1] = !table[i][j-1];
				table[i+1][j-1] = !table[i+1][j-1];
				table[i][j] = !table[i][j];
				Data* temp = new Data(i, j-1, i+1, j-1, i, j);
				vect.push_back(temp);
			}
		}
	}
	for(int i=n-1; i>=2; i--) {
		if(table[i][0]) {
			if(table[i][1]) {
				table[i][0] = !table[i][0];
				table[i][1] = !table[i][1];
				if(table[i-1][0]) {
					table[i-1][0] = !table[i-1][0];
					Data* temp = new Data(i, 0, i, 1, i-1, 0);
					vect.push_back(temp);
				}
				else {
					table[i-1][1] = !table[i-1][1];
					Data* temp = new Data(i, 0, i, 1, i-1, 1);
					vect.push_back(temp);
				}
			} else {
				table[i][0] = !table[i][0];
				table[i-1][1] = !table[i-1][1];
				table[i-1][0] = !table[i-1][0];
				Data* temp = new Data(i, 0, i-1, 1, i-1, 0);
				vect.push_back(temp);
			}
		} else {
			if(table[i][1]) {
				table[i-1][1] = !table[i-1][1];
				table[i][1] = !table[i][1];
				table[i-1][0] = !table[i-1][0];
				Data* temp = new Data(i-1, 1, i, 1, i-1, 0);
				vect.push_back(temp);
			}
		}
	}
	
	for(int i=0;i<6;i++) {
		if(table[1][0]) {
			if(table[1][1]) {
				if(table[1-1][0]) {
					if(table[1-1][1]) {
						table[1-1][1] = !table[1-1][1];			//	1 1
						table[1][1] = !table[1][1];				//  1 1
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 1, 1, 1, 1, 0);
						vect.push_back(temp);
					} else {
						table[1-1][0] = !table[1-1][0];			//	1 0
						table[1][1] = !table[1][1];				//	1 1
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 0, 1, 1, 1, 0);
						vect.push_back(temp);
					}
				} else {
					if(table[1-1][1]) {
						table[1-1][1] = !table[1-1][1];			//	0 1
						table[1][1] = !table[1][1];				//	1 1
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 1, 1, 1, 1, 0);
						vect.push_back(temp);
					} else {
						table[1-1][1] = !table[1-1][1];			// 	0 0
						table[1][1] = !table[1][1];				//	1 1
						table[1-1][0] = !table[1-1][0];
						Data* temp = new Data(0, 1, 1, 1, 0, 0);
						vect.push_back(temp);
					}
				}
			} else {
				if(table[1-1][0]) {
					if(table[1-1][1]) {
						table[1-1][1] = !table[1-1][1];				//	1 1
						table[1][0] = !table[1][0];					//	1 0		
						table[1-1][0] = !table[1-1][0];
						Data* temp = new Data(0, 1, 1, 0, 0, 0);
						vect.push_back(temp);
					} else {
						table[1-1][1] = !table[1-1][1];				//	1 0			
						table[1][1] = !table[1][1];					//	1 0			
						table[1-1][0] = !table[1-1][0];
						Data* temp = new Data(0, 1, 1, 1, 0, 0);
						vect.push_back(temp);
					}
				} else {
					if(table[1-1][1]) {
						table[1-1][0] = !table[1-1][0];			//	0 1
						table[1][1] = !table[1][1];				//	1 0
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 0, 1, 1, 1, 0);
						vect.push_back(temp);
					} else {
						table[1-1][1] = !table[1-1][1];			//  0 0
						table[1][1] = !table[1][1];				//	1 0
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 1, 1, 1, 1, 0);
						vect.push_back(temp);
					}
				}
			}
		} else {
			if(table[1][1]) {
				if(table[1-1][0]) {
					if(table[1-1][1]) {
						table[1-1][1] = !table[1-1][1];			//	1 1
						table[1][1] = !table[1][1];				//	0 1
						table[1-1][0] = !table[1-1][0];
						Data* temp = new Data(0, 1, 1, 1, 0, 0);
						vect.push_back(temp);
					} else {
						table[1-1][0] = !table[1-1][0];			//	1 0
						table[1][1] = !table[1][1];				//	0 1
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 0, 1, 1, 1, 0);
						vect.push_back(temp);
					}
				} else {
					if(table[1-1][1]) {
						table[1-1][1] = !table[1-1][1];				//	0 1		
						table[1][0] = !table[1][0];					//	0 1		
						table[1-1][0] = !table[1-1][0];
						Data* temp = new Data(0, 1, 1, 0, 0, 0);
						vect.push_back(temp);
					} else {
						table[1-1][1] = !table[1-1][1];				//	0 0
						table[1][1] = !table[1][1];					//	0 1
						table[1-1][0] = !table[1-1][0];
						Data* temp = new Data(0, 1, 1, 1, 0, 0);
						vect.push_back(temp);
					}
				}
			} else {
				if(table[1-1][0]) {
					if(table[1-1][1]) {
						table[1-1][1] = !table[1-1][1];				//	1 1
						table[1][1] = !table[1][1];					//	0 0
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 1, 1, 1, 1, 0);
						vect.push_back(temp);
					} else {
						table[1-1][0] = !table[1-1][0];				//	1 0			
						table[1][1] = !table[1][1];					//	0 0			
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 0, 1, 1, 1, 0);
						vect.push_back(temp);
					}
				} else {
					if(table[1-1][1]) {
						table[1-1][0] = !table[1-1][0];			//	0 1
						table[1-1][1] = !table[1-1][1];			//	0 0
						table[1][0] = !table[1][0];
						Data* temp = new Data(0, 0, 0, 1, 1, 0);
						vect.push_back(temp);
					} else {
						break;
					}
				}
			}
		}
	}
	cout << vect.size() << '\n';
	for(auto entry: vect) 
		printf("%d %d %d %d %d %d\n", entry->a1+1, entry->a2+1, entry->b1+1, entry->b2+1, entry->c1+1, entry->c2+1);
}

int main() {
	//boost;
	int t;
	cin >> t;
	while(t--)
		solve();
	return 0;
}