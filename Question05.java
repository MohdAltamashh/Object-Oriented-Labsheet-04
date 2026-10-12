class Patient {
    private String name;
    private int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void classifyPatient() {
        if (age < 0) {
            System.out.println("Invalid age for " + name);
        } else if (age < 12) {
            System.out.println(name + " is a child patient.");
        } else if (age < 60) {
            System.out.println(name + " is an adult patient.");
        } else {
            System.out.println(name + " is a senior patient.");
        }
    }
}

public class Question05 {
    public static void main(String[] args) {
        Patient patient = new Patient("Aman", 35);
        patient.classifyPatient();
    }
}
