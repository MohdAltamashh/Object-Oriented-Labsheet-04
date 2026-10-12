class Employee {
    protected String name;
    protected int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Pharmacist extends Employee {
    private String licenseNumber;

    Pharmacist(String name, int employeeId, String licenseNumber) {
        super(name, employeeId);
        this.licenseNumber = licenseNumber;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License Number: " + licenseNumber);
    }
}

public class Question09 {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist("Sara", 202, "PH-4582");
        pharmacist.displayPharmacist();
    }
}
