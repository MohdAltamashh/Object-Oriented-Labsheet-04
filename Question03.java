class Pharmacy {
    static String pharmacyName = "Care Pharmacy";
    static String location = "Saharanpur";

    void display() {
        System.out.println("Pharmacy: " + pharmacyName + ", Location: " + location);
    }
}

public class Question03 {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();

        p1.display();
        p2.display();

        Pharmacy.pharmacyName = "Health Plus Pharmacy";
        System.out.println("After changing the static name:");
        p1.display();
        p2.display();
    }
}
