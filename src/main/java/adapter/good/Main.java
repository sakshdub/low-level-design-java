package adapter.good;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor =
                new RazorPayAdapter(new RazorPay());

        processor.pay();
    }
}
