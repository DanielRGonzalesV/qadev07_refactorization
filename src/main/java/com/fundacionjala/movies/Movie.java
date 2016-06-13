package com.fundacionjala.movies;

public abstract class Movie {
    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public abstract double calculateCharge(int daysRented);

    public abstract int calculatePoints(int daysRented);


    public int getPriceCode() {

        return priceCode;
    }

    public void setPriceCode(int arg) {

        priceCode = arg;
    }

    public String getTitle() {

        return title;
    }
}

