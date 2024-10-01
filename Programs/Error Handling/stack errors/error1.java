class stack{

	int size = 100;
	int arr [] = new int[size];
	int top = -1;

	public void push(int ele) throws overflow{

		if(top!=size){

		top++;
		arr[top] = ele;

		}else{
			throw new overflow();
		}

	}

	public void pop() throws underflow{
		if(top!=-1){
			int popped = arr[top--];
			System.out.println("popped : " + popped);
			// return popped;
		}else{
			throw new underflow();
		}
	}
	

	public void display(){
		for(int i = 0; i<=top;i++){
			System.out.print(" " + arr[i] + " ");
		}
	}

	// public static void print(){

	// }

}

class overflow extends Exception{
	overflow(){
		System.out.println("Stack has been overflowed");
	}
}

class underflow extends Exception{
	underflow(){
		System.out.println("Stack has been underflowed");
	}
}



class error1{
	public static void main(String [] args) throws overflow,underflow{
		stack s = new stack();

		s.push(10);
		s.push(11);
		s.push(12);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}



}