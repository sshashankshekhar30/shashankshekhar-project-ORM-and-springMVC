package com.GL.CS.DAO;

import java.util.List;
import com.GL.CS.Model.Customer;
public interface CustomerDAO {
	public void saveCustomer(Customer customer);

	public void DeleteCustomer(int id);

	public List<Customer> findAll();

	public Customer findbyid(int id);


}
