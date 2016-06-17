package com.fundacionjala.movies;

class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }


    public double calculateCharge() {

        return movie.calculateCharge(getDaysRented());
    }

    public int calculateFrequentRenterPoints() {

        return movie.calculatePoints(getDaysRented());
    }

    public int getDaysRented() {

        return daysRented;
    }

    public Movie getMovie() {

        return movie;
    }
}

