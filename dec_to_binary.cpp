string dec_to_binary(ll n){
	ll r;
	string bin = "";
	while(n!=0){
		r = n%2;
		n = n/2;
		if(r==0)
			bin = "0" + bin;
		else
			bin = '1' + bin;
	}
	return bin;
}