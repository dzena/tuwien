package services.interfaces;

/**
 * @author Favre-Bulle, Rauscha
 * Advanced Internet Computing
 * Assignment 1
 */

import java.math.BigDecimal;

import javax.jws.WebParam;
import javax.jws.WebService;

import entities.Customer;

/**
 * CustomerWrapperService Interface Handles Customer RESTFUL Service
 */
@WebService(name = "CustomerWrapperService", targetNamespace = "http://infosys.tuwien.ac.at/aic10/ass1/dto/shipping")
public interface CustomerWrapperService {

	public Customer getCustomer(@WebParam(name = "id") String id);

	public void updateCustomer(@WebParam(name = "customer") Customer customer);

	public void addCustomer(@WebParam(name = "customer") Customer customer);

	public void deleteCustomer(@WebParam(name = "id") String id);

	public void notify(@WebParam(name = "customer") String customer,
			@WebParam(name = "message") String message);

	public void update_account(@WebParam(name = "customer") Customer customer,
			@WebParam(name = "valueChanged") BigDecimal valueChanged);
}
