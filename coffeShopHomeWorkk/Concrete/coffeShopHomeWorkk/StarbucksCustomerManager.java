package coffeShopHomeWorkk;


public class StarbucksCustomerManager extends CustomerManager {
	private CustomerCheckService customercheckservice;
	
	
	
public StarbucksCustomerManager(CustomerCheckService customercheckservice) {
		super();
		this.customercheckservice = customercheckservice;
	}



@Override
public  void Save(Customer customer) {
	if(customercheckservice.CheckIfRealPerson(customer)) {
	System.out.println("Saved to db:  "+ customer.firstName);
	}else {
		System.out.println("Not a valid person");
	}
}



}