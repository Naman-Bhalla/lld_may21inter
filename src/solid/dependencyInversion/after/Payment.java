package solid.dependencyInversion.after;

public class Payment {
    PaymentAPIInterface paymentAPIInterface;

    Payment(PaymentAPIInterface apiInterface) {
        this.paymentAPIInterface = apiInterface;
    }

    void pay() {
        paymentAPIInterface.getLink();

        paymentAPIInterface.checkStatus();

        if (false) {
            paymentAPIInterface.doRefund();
        }
    }
}
