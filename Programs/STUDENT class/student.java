import java.util.Scanner;

class student{

	String sname;
	int marks_array[] = new int[100];
	int total;
	int avg;

	public int assign(){
		
	Scanner input = new Scanner(System.in);

	System.out.println("Enter name: ");
	this.sname = input.next();
	
	int n;
	System.out.println("Enter number of subjects: ");
	n = input.nextInt();
	System.out.println("Enter marks in each subject:");
	for(int i = 0; i<n; i++){

		this.marks_array[i] = input.nextInt();	

		}


		return n;
	}

	public void compute(int n){
	for(int i=0;i<marks_array.length;i++){
		this.total += marks_array[i];
	
		}
	avg = this.total/n;

	}

	
	public void display(int n){

	System.out.println("name: " + this.sname);
	System.out.println("total marks: " + this.total);
	System.out.println("average marks: " + this.avg);

	System.out.println("Individual Subject marks: ");

	for(int i=0; i<n; i++){
	System.out.println(this.marks_array[i]);
	}

	}

	public static void main(String[] args){

	student nausheen = new student();

	int p = nausheen.assign();
	nausheen.compute(p);
	nausheen.display(p);

		

	}

}

