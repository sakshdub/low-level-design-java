package adapter.good;

public class RazorPayAdapter implements PaymentProcessor{

    private RazorPay razorPay;
    public RazorPayAdapter(RazorPay razorPay){
        this.razorPay = razorPay;
    }
    public void pay(){
        razorPay.makePayment();
    }
}
