import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTests {
	
	
	@Test
	//test Cash class
	void testCashPay() {
		Cash cash = new Cash();
		cash.pay(10.5);
		assertEquals(cash.toString().trim(), "10.5 paid with cash");
	}
	
	
	@Test
	//test Cash class
	void testDriver() {
		Driver ourDriver = new Driver();
		String[] args = null;
		ourDriver.main(args);
		assertNotEquals(ourDriver, null);
	}
	
	

	@Test
	//test Computer class
	void testCompOrderNo() {
		Computer computer = new Computer();
		int compOrder = computer.orderNo();
		assert(compOrder == 1);
	}

	@Test
	//test CreditCard class
	void testCCPay() {
		CreditCard card = new CreditCard(112233);
		card.pay(22.7);
		assertEquals(card.toString().trim(), "22.7 paid with credit card number 112233");
	}
	
	@Test
	//test kiosk class
	void testKiosk() {
		Kiosk kiosk = new Kiosk();
		assertNotEquals(kiosk, null);
	}
	
	@Test
	//test order class
	void testOrder() {
		Order order = new Computer();
		assertEquals(order.orderNo(), 1);
	}
	
	@Test
	//test order class
	void testPayment() {
		Payment method = new Cash();
		method.pay(11.11);
		assertNotEquals(method.toString().trim(), 10);
	}

	@Test
	//test Shops class
	void testOrderFuncs() {
		Order testOrder = new Computer();
		Shops testShops = new Store();
		Payment cc = new CreditCard(224466);
		int num;
		testShops.setOrder(testOrder);
		num = testShops.orderNo();
		assertEquals(num, 1);
		testShops.setPayment(cc);
	}
	
	@Test
	void testPaymentFuncs() {
		Shops testingShops = new Store();
		Payment cc = new CreditCard(224466);
		testingShops.setPayment(cc);
		testingShops.pay(12.99);
		assertEquals(testingShops.toString().trim(), "12.99 paid with credit card number 224466");
	}
	
	@Test 
	//test store class
	void testChangePayment() {
		Store testStore = new Store();
		Shops testingShops = new Store();
		Payment cc = new Cash();
		testingShops.setPayment(cc);
		testStore.changePayment();
		assertNotEquals(testStore, testingShops);
	}

	
	@Test
	//test Ticket class
	void testTicketOrderNo() {
		Ticket ticket = new Ticket();
		int i = 0;
		int j = 0;
		int ourOrder = ticket.orderNo();
		assert(ourOrder == 1);
	}

}
