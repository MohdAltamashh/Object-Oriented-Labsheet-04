class Medicine {
    private String name;
    private double price;
    private int quantity;

    Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Question02 {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Paracetamol", 25.50, 10);
        medicine.display();
    }
}
