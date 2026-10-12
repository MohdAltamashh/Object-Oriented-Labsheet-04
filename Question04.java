class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + " - Stock: " + quantity);
    }
}

class Inventory {
    private MedicineStock[] stocks;

    Inventory() {
        stocks = new MedicineStock[] {
            new MedicineStock("Paracetamol", 50),
            new MedicineStock("Cetirizine", 25),
            new MedicineStock("Antacid", 40)
        };
    }

    void displayInventory() {
        for (MedicineStock stock : stocks) {
            stock.display();
        }
    }
}

public class Question04 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}
