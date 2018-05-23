package controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Customer;
import service.CustomerServiceImpl;

@RestController
public class CustomerController {
	CustomerServiceImpl customerService = new CustomerServiceImpl();
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List getCustomers() {
		List listOfCustomers = customerService.getAllCustomers();
		return listOfCustomers;
	}
	
	 @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Customer getCountryById(@PathVariable int id) {
	 return customerService.getCustomer(id);
	 }
	 
	 @RequestMapping(value = "/customers", method = RequestMethod.POST, headers = "Accept=application/json")
	 public Customer addCountry(@RequestBody Customer customer) {
	 return customerService.addCustomer(customer);
	 }
	 
	 @RequestMapping(value = "/customers", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public Customer updateCountry(@RequestBody Customer customer) {
	 return customerService.updateCustomer(customer);
	 
	 }
	 
	 @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteCountry(@PathVariable("id") int id) {
		 customerService.deleteCustomerById(id);
	 
	 } 
	
}
