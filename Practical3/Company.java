

class Employee {
    protected String name, address, jobTitle;
    protected double salary;

    public Employee(String name, String address, String jobTitle, double salary) {
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for: " + name);
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, "Manager", salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for managers
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, "Developer", salary);
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, "Programmer", salary);
    }

    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Street, NY", 80000);
        Developer developer = new Developer("Bob", "456 Avenue, LA", 70000);
        Programmer programmer = new Programmer("Charlie", "789 Blvd, TX", 60000);

        System.out.println("Manager Bonus: " + manager.calculateBonus());
        manager.manageProject();
        manager.generatePerformanceReport();

        System.out.println("Developer Bonus: " + developer.calculateBonus());
        developer.writeCode();
        developer.generatePerformanceReport();

        System.out.println("Programmer Bonus: " + programmer.calculateBonus());
        programmer.debugCode();
        programmer.generatePerformanceReport();
    }
}
