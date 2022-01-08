package solid.dependencyInversion.after;

public class PayUPaymentAPI implements PaymentAPIInterface {

    void checkIfPaymentMade() {}

    boolean makePaymentMethodChnage() {return false;}

    void pay() {}


    @Override
    public void getLink() {

    }

    @Override
    public void doRefund() {

    }

    @Override
    public void checkStatus() {

    }
}
