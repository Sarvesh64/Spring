/**
 * 
 */
package com.cdac.mvc.service;

import java.util.List;

import com.cdac.mvc.model.Customer;

/**
 * @author Smita
 *
 */
public interface ICustomerService {
	public Customer addCustomer(Customer customer);//insert
	public Customer getCustomerById(Integer customerId);//search
	public List<Customer> listCustomer();//getAll /list
	public Customer removeCustomer(Integer customerId);//delete
	public Customer updateCustomer(Customer customer);//modify
}
