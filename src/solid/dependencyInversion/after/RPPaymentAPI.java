package solid.dependencyInversion.after;

public class RPPaymentAPI implements PaymentAPIInterface {

    void createPaymentLink() {}

    @Override
    public void getLink() {

    }

    @Override
    public void doRefund() {

    }

    public void checkStatus() {}

    void refund() {}
}
