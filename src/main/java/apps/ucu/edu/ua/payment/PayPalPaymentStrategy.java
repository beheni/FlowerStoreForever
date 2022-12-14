package apps.ucu.edu.ua.payment;

import lombok.ToString;

import java.util.Map;

@ToString
public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Sorry, now your PayPal has less money....");
        return true;
    }

    @Override
    public Map<String, String> getDetails() {
        return Map.of("Payment type", "PayPal");
    }
}
