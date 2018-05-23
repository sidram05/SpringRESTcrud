package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Customer;

public class CustomerServiceImpl implements CustomerService{
	static HashMap<Integer,Customer> customerMap=getcustomerMap();
	
	public CustomerServiceImpl() {
		super();
		if(customerMap == null) {
			customerMap = new HashMap<Integer,Customer>();
			Customer cust1 = new Customer(1, "SID", 23, 70000);
			Customer cust2 = new Customer(2, "ARJUN", 24, 65000);
			Customer cust3 = new Customer(3, "NITISH", 25, 60000);
			
			customerMap.put(1, cust1);
			customerMap.put(2, cust2);
			customerMap.put(3, cust3);
		}
	}
	public List getAllCustomers() {
		List customers = new ArrayList(customerMap.values());
		return customers;
	}
	
	public Customer getCustomer(int id) {
		Customer customer = customerMap.get(id);
		return customer;
	}

	public Customer addCustomer(Customer Customer) {
		Customer.setId(getMaxId()+1);
		customerMap.put((int) Customer.getId(), Customer);
		return Customer;
	}

	public Customer updateCustomer(Customer Customer) {
			customerMap.put((int)Customer.getId(), Customer);
			 return Customer;
	}

	public void deleteCustomerById(int id) {
		customerMap.remove(id);
		
	}
	
	public static HashMap<Integer, Customer> getcustomerMap() {
		 return customerMap;
	}
	
	// Utility method to get max id
	 public static int getMaxId()
	 { int max=0;
	 for (int id:customerMap.keySet()) { 
	 if(max<=id)
	 max=id;
	 
	 } 
	 return max;
	 }
	

}
