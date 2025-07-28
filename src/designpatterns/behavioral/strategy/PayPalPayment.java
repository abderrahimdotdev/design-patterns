package designpatterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying $" + amount + " with PayPal(" + email + ")");
    }
}
