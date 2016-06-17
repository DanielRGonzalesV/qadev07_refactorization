package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danielgonzales on 6/12/2016.
 */
public class test_Movie_New_Release {


    String title_movie = "Batman";

    @Test
    public void aMovieRegularIsCreatedWithNameAndPriceCode() {
        Movie myMovie = new Movie_New_Release(title_movie);
        Assert.assertNotNull(myMovie);
    }

    @Test
    public void theConstructorMethodIsInstanceOfMovieRegularClass(){
        Movie myMovie = new Movie_New_Release(title_movie);
        Assert.assertTrue(myMovie instanceof Movie);
    }
    @Test
    public void theTitleMovieRegularIsEqualToTheObjectTitleCreated() {
        Movie myMovie = new Movie_New_Release(title_movie);
        Assert.assertEquals(title_movie, myMovie.getTitle());
    }



}
