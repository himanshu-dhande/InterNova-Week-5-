package Interface;

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        System.out.println("UPI Payment");
        p1.pay();
        p1.showPaymentDetails();

        System.out.println();

        System.out.println("Card Payment");
        p2.pay();
        p2.showPaymentDetails();
    }
}