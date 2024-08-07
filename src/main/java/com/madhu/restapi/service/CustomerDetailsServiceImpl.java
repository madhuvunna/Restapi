package com.madhu.restapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.madhu.restapi.dao.CustomerDetailsDAO;
import com.madhu.restapi.entity.CustomerDetails;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{
	@Autowired
	private CustomerDetailsDAO customerdetaildao;
	
	@Override
	@Transactional
	public List<CustomerDetails> getCustomerDetails() {
		return customerdetaildao.getCustomerDetails();
	}

	@Override
	@Transactional
	public void saveCustomerDetails(CustomerDetails customerdetail) {
		customerdetaildao.saveCustomerDetails(customerdetail);
	}
}
