package com.fundacionjala.movies;

/**
 * Created by danielgonzales on 6/11/2016.
 */
public class Movie_Regular extends Movie {

    private static final double RENT_PRICE = 2;
    private static final int RETARD = 2;
    private static final double PRICE_RETARD = 1.5;
    private static final int POINTS = 1;


    public Movie_Regular(String title) {

        super(title, RENT_PRICE, RETARD, PRICE_RETARD);

    }

    public double calculateCharge(int daysRented){
        double charge = getRent_Price();
        if (daysRented > getRetard()) {
            charge += (daysRented - getRetard()) * getPrice_Retard();
        }
        return charge;
    }

    public int calculatePoints(int daysRented){

        return POINTS;
    }
}
