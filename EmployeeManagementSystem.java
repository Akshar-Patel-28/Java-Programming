class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    static int employeeCount = 0;

    public Employee() {
        this(0, "Unknown", "General", 0.0);
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        employeeCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary);
    }
}

class ContractEmployee extends Employee {
    private int contractDuration;

    public ContractEmployee(int id, String name, String department, double salary, int contractDuration) {
        super(id, name, department, salary);
        this.contractDuration = contractDuration;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Contract, Duration: " + contractDuration + " months");
    }
}

class PermanentEmployee extends Employee {
    private String benefits;

    public PermanentEmployee(int id, String name, String department, double salary, String benefits) {
        super(id, name, department, salary);
        this.benefits = benefits;
    }

    public String getBenefits() {
        return benefits;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Permanent, Benefits: " + benefits);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Alice", "HR", 50000);
        ContractEmployee ce = new ContractEmployee(102, "Bob", "IT", 40000, 12);
        PermanentEmployee pe = new PermanentEmployee(103, "Charlie", "Finance", 60000, "Health Insurance");

        emp1.displayInfo();
        System.out.println();

        emp2.displayInfo();
        System.out.println();

        ce.displayInfo();
        System.out.println();

        pe.displayInfo();
        System.out.println();

        System.out.println("Is ce a ContractEmployee? " + (ce instanceof ContractEmployee));
        System.out.println("Is pe a PermanentEmployee? " + (pe instanceof PermanentEmployee));
        System.out.println("Is pe an Employee? " + (pe instanceof Employee));

        System.out.println("\nTotal Employees Created: " + Employee.getEmployeeCount());
    }
}
