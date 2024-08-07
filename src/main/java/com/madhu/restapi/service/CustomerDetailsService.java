package com.madhu.restapi.service;

import java.util.List;

import com.madhu.restapi.entity.CustomerDetails;

public interface CustomerDetailsService 
{
		public List<CustomerDetails> getCustomerDetails();
		
		public void  saveCustomerDetails(CustomerDetails customerdetail);
}
