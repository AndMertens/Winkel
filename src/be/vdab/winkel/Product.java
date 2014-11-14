/*
 * Product.java
 */
package be.vdab.winkel;


/**
 *
 * @author Andy.mertens
 */

public class Product {
    private String omschrijving;
    private double prijs;

    public Product(String omschrijving, double prijs){
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }
    
    /**
     * @return the omschrijving
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * @return the prijs
     */
    public double getPrijs() {
        return prijs;
    }
        
}
