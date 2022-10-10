package com.GL.CS.DAO;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.GL.CS.Model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;
	Session session;

	
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	@Override
	@Transactional
	public void DeleteCustomer(int id) {
		session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);	
	}

	@Override
	@Transactional
	public List<Customer> findAll() {
		session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	@Override
	@Transactional
	public Customer findbyid(int id) {
		session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

}
