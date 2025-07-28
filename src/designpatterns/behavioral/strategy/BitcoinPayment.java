package designpatterns.behavioral.strategy;

public class BitcoinPayment implements PaymentStrategy {
    
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of ₿" + amount + " with Bitcoin Wallet (" + walletAddress + ")");
    }
}
