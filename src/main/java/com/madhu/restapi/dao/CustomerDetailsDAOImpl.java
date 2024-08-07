package com.madhu.restapi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.madhu.restapi.entity.CustomerDetails;
@Repository
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO
	{
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<CustomerDetails> getCustomerDetails() 
	{
		Session currentSession = sessionfactory.getCurrentSession();
		
		Query<CustomerDetails> theQuery = 
				currentSession.createQuery("from customerdetails2",
											CustomerDetails.class);
		List<CustomerDetails> customerdetail = theQuery.getResultList();
		return customerdetail;
	}

	@Override
	public void saveCustomerDetails(CustomerDetails customerdetail) {
		Session currentSession = sessionfactory.getCurrentSession();
		currentSession.saveOrUpdate(customerdetail);
	}

//	@Override
//	public CustomerDetails getCustomerDetails(int thecustomerdetails) {
//		Session currentSession = sessionfactory.getCurrentSession();
//		CustomerDetails Customerdetails = currentSession.getClass(CustomerDetails.class,Id);
//		return Customerdetails;
//	}
//
//	@Override
//	public void deleteCustomerDetails(int thecustomerdetails) {
//		Session currentSession = sessionfactory.getCurrentSession();
//		Query theQuery = currentSession.createQuery("delete from customerdetails1 from id =:customerId");
//		theQuery.setParameter("customerId",Id);
//		theQuery.executeUpdate();
//	}
//	
	
}
