package com.madhu.restapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.restapi.entity.CustomerDetails;
import com.madhu.restapi.service.CustomerDetailsService;

@RestController
@RequestMapping("/api")
public class CustomerDetailsRestContoller {

	@Autowired
	private CustomerDetailsService customerdetailsservice;
	
	@GetMapping("/customerdetails")
	public List<CustomerDetails> getCustomerDetails(){
		return customerdetailsservice.getCustomerDetails();
	}
	
	@PostMapping("/customerdetails")
	public CustomerDetails addCustomer(@RequestBody CustomerDetails customerdetails) {
			
		//customerdetails.setId(0);
		customerdetailsservice.saveCustomerDetails(customerdetails);
			
		return customerdetails;
	}
	
		//Update Customer
	
		@PutMapping("/customerdetails")
		public CustomerDetails updateCustomer(@RequestBody CustomerDetails customerdetails) {
			
			customerdetailsservice.saveCustomerDetails(customerdetails);
			
			return customerdetails;
		}
}
