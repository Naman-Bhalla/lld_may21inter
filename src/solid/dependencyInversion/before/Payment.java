package solid.dependencyInversion.before;

public class Payment {
//    RPPaymentAPI rp = new RPPaymentAPI();
    PayUPaymentAPI payU = new PayUPaymentAPI();

    void pay() {
//        rp.createPaymentLink();

        payU.pay();

        payU.checkIfPaymentMade();

//        if (false) {
//            rp.refund();
//        }
    }
}
