class biggest{

	public static void main(String [] args){

		int a = 5;
		int b = 10;
		int c = 15;

		int largest = max(a,b,c);

		System.out.println("The largest of the given numbers is " + largest);

	
	}

	
	public static int max(int a, int b, int c){

		int big = 0;

		if(a>b && a>c){
		big = a;}

		if(b>c && b>a){
		big = b;}

		if(c>a && c>b){
		big = c;}

		return big;

	}

}