import java.util.Scanner;

class apple{

	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		n = sc.nextInt();

		int arr[] = new int[n];


		
		for(int i =0; i<n; i++){
			arr[i] = i+1;
		} 

		for(int k=0; k<n; k++){
			System.out.println(arr[k]);

		}

	}





}