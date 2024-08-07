package com.madhu.restapi.dao;

import java.util.List;

import com.madhu.restapi.entity.CustomerDetails;

public interface CustomerDetailsDAO {
	
	public List<CustomerDetails> getCustomerDetails();
	
	public void  saveCustomerDetails(CustomerDetails customerdetail);
	
//	public CustomerDetails getCustomerDetails(int Id);
//	
//	public void deleteCustomerDetails(int Id);
}
