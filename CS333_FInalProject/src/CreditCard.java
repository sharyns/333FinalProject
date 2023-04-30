public class CreditCard implements Payment{
	
	private int cardNum;
	
	public CreditCard(int num) {
		this.cardNum = num;
	}

	//pay
	public void pay(double totalPaid) {
		System.out.println(totalPaid + " paid with credit card number " + this.cardNum);
	}
}
