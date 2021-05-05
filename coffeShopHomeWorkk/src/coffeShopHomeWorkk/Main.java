package coffeShopHomeWorkk;



public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDateOfBirth(1993);
		customer.setFirstName("Zakaria");
		customer.setLastName("Rezoug");
		customer.setNationalityId(12345678910L);
		customerManager.Save(customer);
	}

}
