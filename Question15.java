class HospitalStaff {
    private String name;
    private String role;
    private int staffId;

    HospitalStaff(String name, String role, int staffId) {
        this.name = name;
        this.role = role;
        this.staffId = staffId;
    }

    void display() {
        System.out.println("Hospital Staff Record");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Staff ID: " + staffId);
    }
}

class HospitalSystem {
    private HospitalStaff staff;

    HospitalSystem() {
        staff = new HospitalStaff("Dr. Ayesha", "Doctor", 501);
    }

    void run() {
        staff.display();
    }
}

public class Question15 {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
