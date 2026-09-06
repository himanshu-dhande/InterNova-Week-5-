package Interface;

class UPIPayment implements Payment {

    public void pay() {
        System.out.println("Payment done through UPI");
    }

    public void showPaymentDetails() {
        System.out.println("UPI ID: himanshu@upi");
        System.out.println("Amount: Rs. 1000");
    }
}