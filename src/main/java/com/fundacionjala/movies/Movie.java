package com.fundacionjala.movies;

public abstract class Movie {

    protected static final int POINTS = 1;
    protected final String title;
    protected final double rent_price;
    protected final int retard;
    protected final double price_retard;



    public Movie(String title, double rent_price, int retard, double price_retard)
    {
        this.title = title;
        this.rent_price = rent_price;
        this.retard = retard;
        this.price_retard = price_retard;

    }

    public abstract double calculateCharge(int daysRented);

    public abstract int calculatePoints(int daysRented);



    public String getTitle() {

        return title;
    }

    public double getRent_Price(){
        return rent_price;
    }

    public int getRetard(){
        return retard;
    }

    public double getPrice_Retard(){
        return price_retard;
    }

}

