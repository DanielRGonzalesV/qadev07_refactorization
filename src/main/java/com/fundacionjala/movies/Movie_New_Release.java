package com.fundacionjala.movies;

/**
 * Created by danielgonzales on 6/11/2016.
 */
public class Movie_New_Release extends Movie {

    private static final double RENT_PRICE = 1;
    private static final int RETARD = 1;
    private static final double PRICE_RETARD = 3;


    public Movie_New_Release(String title)
    {
        super(title, RENT_PRICE, RETARD, PRICE_RETARD);

    }

    public double calculateCharge(int daysRented){
        double charge = getRent_Price();
               charge += daysRented * getPrice_Retard();
        return charge;
    }

    public int calculatePoints(int daysRented){
    int points = POINTS;
        if ( daysRented > 1)
            points++;
        return points;
    }
}