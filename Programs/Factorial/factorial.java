class factorial{

	public static void main(String[] args){
	
		int n = 6;
		int r = 2;
		
		int ans = fact(6);

		System.out.println("the factorial is " +ans);	

		int ncr = (fact(n))/(fact(r)*fact(n-r));

		System.out.println("the ncr is " +ncr);

	}

	
	public static int fact(int n){
		int x=1;
		for(int i =1;i<=n;i++){
			
			x=x*i;

		}

		return x;
	
	}

}