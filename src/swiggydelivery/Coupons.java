package swiggydelivery;

public class Coupons extends Orders {
    public int amount;
    public double discount;
    double finalAmount;

    public Coupons(String userId, String password, int noOfBiryani, String biryani, String starters,int noOfStarters) {
        super(userId, password, noOfBiryani, biryani, starters,noOfStarters);
    }
    public double getFinalAmount() {
        return finalAmount;
    }
    public boolean couponsProcess() {
        amount = totalAmount;
        System.out.println(amount);
        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.2;
        } else if (amount > 1000) {
            discount = amount * 0.3;
        } else {
            discount = 0;
            System.out.println("Below 500, no discount.");

        }
        finalAmount = amount - discount;

        if (discount > 0) {
            System.out.println("---Your discount amount: " + discount + " from total amount: " + amount +
                    " Your final amount to pay: " + finalAmount);

        }
        return false;
    }
}

