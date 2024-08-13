import java.util.Scanner;

class Employee {
     String Ename;
     int Eid;
     double Basic;
     double DA;
     double Gross_Sal;
     double Net_Sal;


    public void read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        Ename = in.nextLine();
        System.out.print("Enter employee ID: ");
        Eid = in.nextInt();
        System.out.print("Enter basic salary: ");
        Basic = in.nextDouble();
        in.close();
    }

   
    public void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.3 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

   
    public void display() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.read();
        emp.compute_net_sal();
        emp.display();
    }
}
