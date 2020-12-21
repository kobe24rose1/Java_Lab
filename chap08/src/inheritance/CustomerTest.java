package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cKim = new VIPCustomer(2, "Kim"); //업캐스팅
		
		System.out.println(cKim.showCustomerInfo());
		
	}

}
