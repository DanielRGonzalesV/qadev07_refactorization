package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danielgonzales on 6/12/2016.
 */
public class test_Movie_Childrens {

        int days_rented = 1;
        String title_movie = "Bambi";

        @Test
        public void aMovieRegularIsCreatedWithNameAndPriceCode() {
            Movie myMovie = new Movie_Childrens(title_movie, days_rented);
            Assert.assertNotNull(myMovie);
        }

        @Test
        public void theConstructorMethodIsInstanceOfMovieRegularClass(){
            Movie myMovie = new Movie_Childrens(title_movie, days_rented);
            Assert.assertTrue(myMovie instanceof Movie);
        }
        @Test
        public void theTitleMovieRegularIsEqualToTheObjectTitleCreated() {
            Movie myMovie = new Movie_Childrens(title_movie, days_rented);
            Assert.assertEquals(title_movie, myMovie.getTitle());
        }

        @Test
        public void thePriceCodeOfMovieIsEqualToTheObjectPriceCodeCreated() {
            Movie myMovie = new Movie_Childrens(title_movie, days_rented);
            Assert.assertEquals(days_rented, myMovie.getPriceCode());
        }

        @Test
        public void thePriceCodeMovieChangedIsUpdatedInTheObject() {
            int days_rented_changed = 2;
            Movie myMovie = new Movie_Childrens(title_movie, days_rented);
            myMovie.setPriceCode(days_rented_changed);
            Assert.assertEquals(days_rented_changed, myMovie.getPriceCode());
        }

    }
