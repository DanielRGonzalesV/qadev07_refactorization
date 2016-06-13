package com.fundacionjala.movies;

/**
 * Created by danielgonzales on 6/11/2016.
 */
public class Movie_New_Release extends Movie {

    private static final double RENT_PRICE = 1;
    private static final double PRICE_RETARD = 3;
    private static int POINTS = 1;

    public Movie_New_Release(String title, int priceCode) {
        super(title, priceCode);
    }

    public double calculateCharge(int daysRented){
        double charge = RENT_PRICE;
               charge += daysRented * PRICE_RETARD;
        return charge;
    }

    public int calculatePoints(int daysRented){
        if ( daysRented > 1)
            POINTS++;
        return POINTS;
    }
}