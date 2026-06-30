package adapter.bad;

public class Main {
    public static void main(String[] args) {
//        RazorPay razorPay=new RazorPay();
//        razorPay.makePayment();

        //Or

         Stripe stripe = new Stripe();

        stripe.processPayment();
    }
}
