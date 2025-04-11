// Student.java
class Student {
    private int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// Test.java
class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public int getSub1() {
        return sub1;
    }

    public int getSub2() {
        return sub2;
    }
}

// Sports.java
interface Sports {
    int sMarks = 20;  // Sports marks (constant)

    void set();  // abstract method to be implemented
}

// Result.java
class Result extends Test implements Sports {
    private int total;

    // Implementation of set() from Sports interface
    public void set() {
        System.out.println("Sports marks set to: " + sMarks);
    }

    public void display() {
        total = sub1 + sub2 + sMarks;
        System.out.println("----- Student Result -----");
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Subject 1 Marks: " + getSub1());
        System.out.println("Subject 2 Marks: " + getSub2());
        System.out.println("Sports Marks: " + sMarks);
        System.out.println("Total Marks: " + total);
    }
}

// TestApplication.java
public class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();

        // Setting roll number and marks
        r.setRollNo(101);
        r.setMarks(85, 90);
        r.set();  // from Sports interface

        // Display the result
        r.display();
    }
}
