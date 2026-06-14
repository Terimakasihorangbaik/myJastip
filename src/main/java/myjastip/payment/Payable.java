package myjastip.payment;

import java.util.ArrayList;

public interface Payable {
    void pay(EscrowPayment payment) throws InsufficientBalanceException ;
    ArrayList<EscrowPayment> getPaymentHistory();
}
