public class Computer implements Order {
	int i = 0;
	int n = 0;
	
	//order #
	public int orderNo() {
		while (i <= n) {
			i++;
		}
		n = i;
		return i;
	}
}
