#include <bits/stdc++.h>
#define boost ios::sync_with_stdio(false); cin.tie(0)
#define ll long long int
#define uint unsigned int
using namespace std;

const ll N = 300001;

vector<ll> tree[N], memo[N];
vector< vector<int> > level;
int parent[N], depth[N], idx[N];
uint weight[N], dot[N];
bool known[N];
int max_depth=0;

void dfs(int v, int par = 1, int dpt=0) {
	// Store parents and depth
	parent[v] = par;
	depth[v] = dpt;
	// Calculate max depth helpful later 
	max_depth = max(max_depth, dpt);

	// Precomputing values if both the nodes become same
	dot[v] = dot[par] + weight[v]*weight[v];

	// Traverse through childs
	for(auto u: tree[v]) {
		if(par == u)
			continue;
		dfs(u, v, dpt+1);
	}
}

void addEdge(ll parent, ll child) {
	tree[parent].push_back(child);
	tree[child].push_back(parent);
}

uint processQuery(int u, int v) {
	uint sum=0;
	
	// Calculating till both nodes arrive at same node or at a precomputed level
	while(u!=v && !known[u]) {
		sum += weight[u]*weight[v];
		u = parent[u], v = parent[v];
	}
	if(u==v)
		sum += dot[u];
	
	// Arrived at a precomputed level
	else
		sum += memo[depth[u]][idx[u]*level[depth[u]].size() + idx[v]];
	return sum;
}

int main() {
	boost;
	int n, q, i, j, u, v;
	cin >> n >> q;
	// Input Weights
	for(i=1;i<=n;i++) 
		cin >> weight[i];

	// Construct tree
	for(i=1;i<n;i++) {
		cin >> u >> v;
		addEdge(u, v);
	}

	// Precompute parents and depth of each node
	dfs(1);

	// Precompute the levels at which each node is present
	level = vector< vector<int> >(max_depth+1);
	for(i=1;i<=n;i++)	
		level[depth[i]].push_back(i);

	// Traverse through each block(sqrt decomposition)
	int block_size = sqrt(n);
	for(i=0;i<=max_depth;i+=block_size) {

		// Find level with minimum nodes
		int lvl=i, min_size = level[i].size();
		for(j=i;j<=min(i+block_size, max_depth);j++) {
			if(level[j].size() < min_size) {
				min_size = level[j].size();
				lvl = j;
			}
		}
		
		// Indexing each node in the minimum level for ease in next step
		int id=0;
		for(auto x: level[lvl])
			idx[x] = id++;

		// Calculating dot product for all possible pairs of min level
		for(auto x: level[lvl]) {
			for(auto y: level[lvl]) {
				if(idx[x] <= idx[y])
					memo[lvl].push_back(processQuery(x,y));
				
				// Already precomputed the value, so we push back that precomputed value
				else
					memo[lvl].push_back(memo[lvl][idx[y]*min_size + idx[x]]);	
			}
			known[x] = true;
		}
	}

	while(q--) {
		cin >> u >> v;
		cout << processQuery(u, v) << '\n';
	}
	return 0;
}