package designpatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " with Credit Card nº" + cardNumber);
    }

}
