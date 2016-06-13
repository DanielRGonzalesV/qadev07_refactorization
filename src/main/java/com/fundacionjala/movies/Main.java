package com.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Daniel");
        Movie movieChildren = new Movie_Childrens("Bambi", 3);
        Movie movieNewRelease = new Movie_New_Release("Batman", 2);
        Movie movieRegular = new Movie_Regular("Superman", 1);
        customer.addRental(new Rental(movieChildren, 3));
        customer.addRental(new Rental(movieNewRelease, 1));
        customer.addRental(new Rental(movieRegular, 1));
        System.out.println(customer.statement());
    }
}
