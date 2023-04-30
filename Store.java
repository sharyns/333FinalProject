public class Store extends Shops {
	
	public Store() {
		theOrder = new Computer();
		thePayment = new Cash();
	}
	
	public void changePayment() {
		this.setPayment(new CreditCard(123456789));
	}
}