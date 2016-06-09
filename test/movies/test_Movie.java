package movies;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_Movie {
	
	@Test
	public void aMovieIsCreatedWithNameAndPriceCode() {
		Movie myMovie = new Movie("Terminator", 0);
		assertNotNull(myMovie);
	}
	
	@Test
	public void theTitleMovieIsEqualToTheObjectTitleCreated() {
		Movie myMovie = new Movie("Terminator", 0);
		assertEquals("Terminator", myMovie.getTitle());
	}
	
	@Test
	public void thePriceCodeOfMovieIsEqualToTheObjectPriceCodeCreated() {
		Movie myMovie = new Movie("The Ring", 0);
		assertEquals(0, myMovie.getPriceCode());
	}
	
	@Test
	public void thePriceCodeMovieChangedIsUpdatedInTheObject() {
		Movie myMovie = new Movie("Bambi", 1);
		assertEquals(1, myMovie.getPriceCode());
		myMovie.setPriceCode(2);
		assertEquals(2, myMovie.getPriceCode());
	}
	
	
}
