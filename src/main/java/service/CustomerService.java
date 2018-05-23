package service;

import java.util.List;

import model.Customer;

public interface CustomerService {
	    
		List getAllCustomers();
		
		Customer getCustomer(int id);
	
		Customer addCustomer(Customer Customer);
	     
	    Customer updateCustomer(Customer Customer);
	     
	    void deleteCustomerById(int id);
}
