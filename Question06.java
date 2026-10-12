class MedicineProduct {
    private String name;
    private double price;
    private String manufacturer;

    MedicineProduct(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    void displayData() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

public class Question06 {
    public static void main(String[] args) {
        MedicineProduct product =
                new MedicineProduct("Vitamin C", 120.00, "ABC Pharma");
        product.displayData();
    }
}
