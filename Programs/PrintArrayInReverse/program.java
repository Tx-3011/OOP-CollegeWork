class program{

	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arrRev[] = new int[arr.length];
		int p =0;

		
		for(int i=9; i>=0; i--){
			arrRev[p] = arr[i];
			p++;
		
		}

		for(int k = 0; k<arrRev.length; k++){
			System.out.println(arrRev[k]);

		}
	
	}






}