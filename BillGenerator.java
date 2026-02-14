class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Regular Customer");
        System.out.println("Total Bill: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalBill = itemTotal - discount;
        System.out.println("Privileged Customer");
        System.out.println("Total Bill: " + itemTotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double discount = itemTotal * discountPercent / 100;
        double finalBill = itemTotal - discount;
        System.out.println("Festive Offer Customer");
        System.out.println("Total Bill: " + itemTotal);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {

        BillGenerator b = new BillGenerator();

        b.generateBill(4000);
        System.out.println();

        b.generateBill(4000, 500);
        System.out.println();

        b.generateBill(4000, 10.0);
    }
}
