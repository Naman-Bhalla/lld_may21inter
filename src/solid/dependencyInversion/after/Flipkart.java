package solid.dependencyInversion.after;

public class Flipkart {
    public static void main(String[] args) {
        Payment payment = new Payment(new RPPaymentAPI());
    }
}
