vector<ll> SieveOfEratosthenes(ll n) { 
	ll prime[N+1];

	vector<ll> v;

    memset(prime, 1, sizeof(prime)); 
  
    for (ll p=2; p*p<=n; p++) { 
        if (prime[p]) { 
            for (ll i=p*p; i<=n; i += p) 
                prime[i] = 0; 
        } 
    } 
    for (ll p=2; p<=n; p++) 
       if (prime[p]) 
       	v.pb(p);
    return v;  
} 