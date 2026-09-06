package Interface;

class CardPayment implements Payment {

    public void pay() {
        System.out.println("Payment done through Card");
    }

    public void showPaymentDetails() {
        System.out.println("Card Number: XXXX1234");
        System.out.println("Amount: Rs. 2000");
    }
}