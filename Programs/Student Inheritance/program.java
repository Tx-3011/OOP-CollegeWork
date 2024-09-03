class STUDENT {
    String name;
    int Marks1;
    int Marks2;

    public void compute() {
        int totalMarks = this.Marks1 + this.Marks2;
        int avgMarks = (this.Marks1 + this.Marks2) / 2;


        System.out.println("");
        System.out.println("Arts Student deets : ");
        System.out.println("total marks: " + totalMarks);
        System.out.println("average marks: " + avgMarks);
        System.out.println("");
    }
}

class scienceStudent extends STUDENT {
    private int practicalMarks;

    public void setPracticalMarks(int practicalMarks) {
        this.practicalMarks = practicalMarks;
    }

    public void displayPracticalMarks() {
        System.out.println("Practical Marks of that Science Student is " + this.practicalMarks);
    }

    @Override
    public void compute() {
        int totalMarks = this.Marks1 + this.Marks2 + practicalMarks;
        int avgMarks = totalMarks / 3;

        System.out.println("Science Student deets : ");
        System.out.println("total marks: " + totalMarks);
        System.out.println("average marks: " + avgMarks);
        System.out.println("");
    }
}

class artsStudent extends STUDENT {
    private String electiveSubject;

    public void compute() {
        super.compute();
    }
}

class program {
    public static void main(String[] args) {
        artsStudent A1 = new artsStudent();
        A1.Marks1 = 100;
        A1.Marks2 = 100;

        A1.compute();

        scienceStudent S1 = new scienceStudent();
        S1.Marks1 = 200;
        S1.Marks2 = 300;
        S1.setPracticalMarks(100);

        S1.compute();
    }
}
