
class Student {
    int roll_no;

 
    Student(int roll) {
        this.roll_no = roll;
    }

    void displayRollNumber() {
        System.out.println("Roll Number: " + roll_no);
    }
}


class Test extends Student {
    int sub1, sub2;

 
    Test(int roll, int marks1, int marks2) {
        super(roll);  
        this.sub1 = marks1;
        this.sub2 = marks2;
    }

   
    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}


class Result extends Test {
    
    Result(int roll, int marks1, int marks2) {
        super(roll, marks1, marks2);  
    }


    void displayResult() {
        int total = sub1 + sub2;
        displayRollNumber();
        displayMarks();
        System.out.println("Total Marks: " + total);
    }
}

// Main class to test the multilevel inheritance
public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        // Create Result object
        Result student1 = new Result(101, 85, 90);
        student1.displayResult();
    }
}
