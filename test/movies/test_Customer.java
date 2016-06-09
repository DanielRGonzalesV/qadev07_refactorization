package movies;


import static org.junit.Assert.*;

import org.junit.Test;
import movies.Customer;

public class test_Customer {

	@Test
	public void aCustomerIsCreatedWithName() {
		Customer customer = new Customer("Juan");
		assertNotNull(customer);
	}

	@Test
	public void theNameCustomerIsEqualToTheObjectnameCreated() {
		Customer customer = new Customer("Paul");
		assertEquals("Paul", customer.getName());
	}
	
	
	
}

