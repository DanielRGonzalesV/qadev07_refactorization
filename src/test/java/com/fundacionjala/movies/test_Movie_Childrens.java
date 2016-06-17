package com.fundacionjala.movies;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danielgonzales on 6/12/2016.
 */
public class test_Movie_Childrens {

        String title_movie = "Bambi";

        @Test
        public void TestCreateMovieChildrenWithName() {
            Movie myMovie = new Movie_Childrens(title_movie);
            Assert.assertNotNull(myMovie);
        }

        @Test
        public void TestMovieChildrenIsAInstanceOfMovie(){
            Movie myMovie = new Movie_Childrens(title_movie);
            Assert.assertTrue(myMovie instanceof Movie);
        }
        @Test
        public void TestTheTitleMovieRegularIsEqualToTheObjectTitleCreated() {
            Movie myMovie = new Movie_Childrens(title_movie);
            Assert.assertEquals(title_movie, myMovie.getTitle());
        }


    }
