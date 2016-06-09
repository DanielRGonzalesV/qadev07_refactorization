package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_Rental {

	@Test
	public void aRentalIsCreatedWithAMovieAndDayRent() {
		Rental myRental = new Rental(new Movie("The Revenant", 1), 2);
		assertNotNull(myRental);
	}

	@Test
	public void theDaysRentedOfRentalIsEqualToTheObjectWithDaysRentedCreated() {
		Rental myRental = new Rental(new Movie("The Revenant", 1), 2);
		assertEquals(2, myRental.getDaysRented());
	}
	
	@Test
	public void theMovieOfRentalIsEqualToTheObjectWithMovieCreated() {
		Movie myMovie= new Movie("The Revenant", 1);
		Rental myRental = new Rental(myMovie, 2);
		assertEquals(myMovie, myRental.getMovie());
	}
	
}
