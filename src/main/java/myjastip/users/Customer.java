package myjastip.users;

import myjastip.payment.Order;
import myjastip.payment.Payable;
import myjastip.payment.Payment;
import myjastip.storage.Cart;
import myjastip.storage.Item;

import java.util.ArrayList;

public class Customer extends User implements Payable {
	private String address;
	private Cart cart;
        private ArrayList<Payment> paymentHistory;
        private ArrayList<Item> listItem;

	public Customer(String userId, String name, String email, String password, String phoneNumber, String address, Cart cart) {
		super(userId, name, email, password, phoneNumber);
		this.address = address;
		this.cart = cart;
	}

	@Override
	public void payment(double amount) {
            Payment payment = new Payment();
            payment.processPayment(amount, "Sukses");
            payment.getReceipt();
            paymentHistory.add(payment);
	}

	@Override
	public void refund(long orderId) {
            System.out.println("Refund Order : " + orderId);
	}

	@Override
	public ArrayList<Payment> getPaymentHistory() {
		return paymentHistory;
	}

	public ArrayList<Item> searchItem(String keyword) {
            ArrayList<Item> hasilCari = new ArrayList<>();
            for(Item item : listItem ){
                if (item.getItemName().toLowerCase().contains(keyword.toLowerCase())) {

                    hasilCari.add(item);
                }
            }
            return hasilCari;
           
	}

	public void addToCart(Item item, int qty) {
		cart.addItem(item, qty);
                System.out.println("Nama Barang = " + item);
                System.out.println("Jumlah barang = " + qty);
                System.out.println("Berhasil dimasukan ke Keranjang Belanja");
	}

	public void cancelOrder(String orderld) {
            System.out.println("Order dengan ID " + orderld + " berhasil dibatalkan.");
	}

	public Order createOrder() {
            Order order = new Order();
            order.calculateTotalBill();
            return order;
	}

	public void rate(Jastiper service, int value) throws InvalidRatingException {
            service.setRating(value);
            System.out.println("Berhasil memberi rating " + value);
	}

	public String getAddress(String address) {
            return address;
	}

	public void setAddress(String address) {
            this.address = address;
	}

	public void confirmReceipt(String orderld) {
            System.out.println("Pesanan" + orderld + " telah diterima");
	}

	public void pay(double amount) {
            Payment payment = new Payment();
            payment.processPayment(amount, "Sukses");
            paymentHistory.add(payment);
	}

	public void refund(String orderld) {
            System.out.println("Refund order : " + orderld);
	}
}
