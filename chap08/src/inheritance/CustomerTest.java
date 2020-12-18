package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cLee = new Customer();
		cLee.setCustomerId(1);
		cLee.setCustomerName("Lee");
		
		VIPCustomer cKim = new VIPCustomer();
		cKim.setCustomerId(2);
		cKim.setCustomerName("Kim");
		
		System.out.println(cLee.showCustomerInfo());
		System.out.println(cKim.showCustomerInfo());

	}

}
