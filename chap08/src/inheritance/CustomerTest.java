package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cKim = new VIPCustomer(2, "Kim"); //��ĳ����
		
		System.out.println(cKim.showCustomerInfo());
		
	}

}
