package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

public class test_Movie_Regular {


    String title_movie = "Terminator";

    @Test
    public void aMovieRegularIsCreatedWithNameAndPriceCode() {
        Movie myMovie = new Movie_Regular(title_movie);
        Assert.assertNotNull(myMovie);
    }

    @Test
    public void theConstructorMethodIsInstanceOfMovieRegularClass(){
        Movie myMovie = new Movie_Regular(title_movie);
        Assert.assertTrue(myMovie instanceof Movie);
    }
    @Test
    public void theTitleMovieRegularIsEqualToTheObjectTitleCreated() {
        Movie myMovie = new Movie_Regular(title_movie);
        Assert.assertEquals(title_movie, myMovie.getTitle());
    }



}