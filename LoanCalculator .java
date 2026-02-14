class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float emi;
        emi = (principal * rate * time) / (100 * 12);
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double emi;
        emi = (principal * rate * time) / (100 * 12);
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        float rate = 10;
        float emi;
        emi = (principal * rate * time) / (100 * 12);
        System.out.println("Personal Loan EMI (10% fixed): " + emi);
    }

    public static void main(String[] args) {

        System.out.println("Enrollment No. 240390107032");

        LoanCalculator obj = new LoanCalculator();

        obj.calculateEMI(500000, 5, 7.5f);

        obj.calculateEMI(200000.0, 3, 8.5);

        obj.calculateEMI(100000, 2);
    }
}
