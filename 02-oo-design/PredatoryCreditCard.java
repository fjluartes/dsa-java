public class PredatoryCreditCard extends CreditCard {
    private double apr;

    // constructor for this subclass
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal); // initialize superclass attributes
        apr = rate;
    }

    public void processMonth() {
        if (balance > 0) {
            double monthlyFactor = Math.pow(1 + apr, 1.0/12); // monthly rate
            balance *= monthlyFactor; // assess interest
        }
    }

    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if (!isSuccess) {
            balance += 5; // assess a $5 penalty
        }
        return isSuccess;
    }
}
