// Base class
package mscbdaoop;
class Loan {
    private int loanId;          // private
    public String customerName;   // public
    protected double loanAmount;  // protected
    double rateOfInterest;        // default

    Loan(int loanId, String customerName, double loanAmount, double rateOfInterest) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.rateOfInterest = rateOfInterest;
    }

    public int getLoanId() {
        return loanId;
    }
}

// HomeLoan class
class HomeLoan extends Loan {
    double propertyValue;
    int tenureYears;
    double emi;

    HomeLoan(int loanId, String customerName, double loanAmount, double rateOfInterest,
             double propertyValue, int tenureYears) {
        super(loanId, customerName, loanAmount, rateOfInterest);
        this.propertyValue = propertyValue;
        this.tenureYears = tenureYears;
    }

    void calculateEMI() {
        int n = tenureYears * 12;
        double r = rateOfInterest / (12 * 100);
        emi = (loanAmount * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    void display() {
        System.out.println("Home Loan:");
        System.out.println("Loan ID: " + getLoanId());
        System.out.println("Customer: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Property Value: " + propertyValue);
        System.out.println("EMI: " + emi);
    }
}

// CarLoan class
class CarLoan extends Loan {
    String carModel;
    int tenureYears;
    double emi;

    CarLoan(int loanId, String customerName, double loanAmount, double rateOfInterest,
            String carModel, int tenureYears) {
        super(loanId, customerName, loanAmount, rateOfInterest);
        this.carModel = carModel;
        this.tenureYears = tenureYears;
    }

    void calculateEMI() {
        int n = tenureYears * 12;
        double r = rateOfInterest / (12 * 100);
        emi = (loanAmount * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        emi += 0.01 * loanAmount; // 1% processing fee
    }

    void display() {
        System.out.println("Car Loan:");
        System.out.println("Loan ID: " + getLoanId());
        System.out.println("Customer: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Car Model: " + carModel);
        System.out.println("EMI: " + emi);
    }
}

// Main class
public class loan {
    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan(101, "Alice", 5000000, 7.5, 6000000, 20);
        hl.calculateEMI();
        hl.display();

        System.out.println();

        CarLoan cl = new CarLoan(102, "Bob", 1500000, 9.0, "Toyota Camry", 5);
        cl.calculateEMI();
        cl.display();
    }
}
