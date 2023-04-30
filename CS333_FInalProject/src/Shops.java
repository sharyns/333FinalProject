public abstract class Shops {
	Payment thePayment;
	Order theOrder;
	
	public Shops() {
	}
	
	public void pay(double paid) {
		thePayment.pay(paid);
	}
	
	public int orderNo() {
		return theOrder.orderNo();
	}
	
	public void setPayment(Payment p) {
		thePayment = p;
	}
	
	public void setOrder(Order o) {
		theOrder = o;
	}
}
