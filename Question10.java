class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String license;

    Pharmacist(String name, int id, String license) {
        super(name, id);
        this.license = license;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License: " + license);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Mehta", 301, "Cardiology");
        Pharmacist pharmacist = new Pharmacist("Ravi", 302, "PH-1024");

        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
