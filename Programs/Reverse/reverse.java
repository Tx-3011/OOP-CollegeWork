class reverse{

	public static void main(String[] args){
		
		int n = 123;

		int ans = reverseDigits(n);

		System.out.println("the reversed is " +ans);

		if(ans==n){
		System.out.println("Yesh, Palindrome");}else{System.out.println("Lmao");}
	
	}


	public static int reverseDigits(int n){

		
		int x = 0;
		int p = 0;
		while(n>0){
		
		p = n%10;
		x=x*10+p;
		n=n/10;

		
	
		}

		return x;
	
	}
	
}