class PatientBill {
    private double consultationFee;
    private double medicineFee;
    private double testFee;

    void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) this.consultationFee = consultationFee;
    }

    void setMedicineFee(double medicineFee) {
        if (medicineFee >= 0) this.medicineFee = medicineFee;
    }

    void setTestFee(double testFee) {
        if (testFee >= 0) this.testFee = testFee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee + testFee;
    }

    void displayBill() {
        System.out.println("Consultation fee: " + consultationFee);
        System.out.println("Medicine fee: " + medicineFee);
        System.out.println("Test fee: " + testFee);
        System.out.println("Total bill: " + calculateTotal());
    }
}

public class Question08 {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(300);
        bill.setMedicineFee(450);
        bill.setTestFee(250);
        bill.displayBill();
    }
}
