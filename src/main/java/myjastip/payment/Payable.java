package myjastip.payment;

import java.util.ArrayList;

public interface Payable {
    void pay(Payment payment) throws InsufficientBalanceException ;
    void refund(Order order);
    ArrayList<Payment> getPaymentHistory();
}
