package designpatterns.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {

        /*
         *************
         * Strategy *
         *************
         *
         * The Strategy Design Pattern is a behavioral design pattern that enables a
         * client to choose an algorithm from a family of algorithms at runtime. It
         * allows you to define a set of algorithms, encapsulate each one, and make them
         * interchangeable. This pattern is useful when you need to vary an algorithm or
         * behavior in an object without altering the object's code.
         */

        ShoppingCart paymentContext = new ShoppingCart();

        // Payment using Credit Card
        paymentContext.setPaymentStrategy(new PayPalPayment("abc@example.com"));
        paymentContext.executePayment(25); // OUTPUT: Processing payment of 25 with PayPal(abc@example.com)

        // Payment using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234"));
        paymentContext.executePayment(19); // OUTPUT: Processing payment of 19 with Credit Card nº1234
    }
}
