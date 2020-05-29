void top_sort(ll u){
	visited[u] = 1;
	act[u] = 1;
	for(ll v : adj[u]){
		if(act[v] && u!=v){
			f = 0;
		}
		else{
			if(!visited[v])
				top_sort(v);
		}
	}
	act[u]=0;
	ans+=(u+'A');
}

// f detects cycles