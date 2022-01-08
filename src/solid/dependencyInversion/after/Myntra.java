package solid.dependencyInversion.after;

public class Myntra {

    public static void main(String[] args) {

        Payment payment = new Payment(new PayUPaymentAPI());
    }
}


// Invversion of Control
// Dependencies will be passed the framework/ library that you ae using