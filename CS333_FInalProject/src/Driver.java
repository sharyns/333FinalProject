public class Driver {

	public static void main(String[] args) {
		Shops store = new Store();
		Shops kiosk = new Kiosk();
		
		int storeOrder;
		int kioskOrder;
		
		//Store Order w/ cash
		System.out.println("Store Order\n-----------------");
		storeOrder = store.orderNo();
		System.out.println(storeOrder + " is the order number");
		store.pay(2.16);
		System.out.println("\n");

		
		//Store Order w/ credit
		System.out.println("Store Order\n-----------------");
		storeOrder = store.orderNo();
		System.out.println(storeOrder + " is the order number");
		store.setPayment(new CreditCard(123456789));
		store.pay(5.67);
		System.out.println("\n");
		
		
		//Kiosk Order
		System.out.println("Kiosk Order\n-----------------");
		kioskOrder = kiosk.orderNo();
		System.out.println(kioskOrder + " is the order number");
		kiosk.pay(4.39);
		System.out.println("\n");

	}

}

