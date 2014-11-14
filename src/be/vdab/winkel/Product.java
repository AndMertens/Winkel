/*
 * Product.java
 */
package be.vdab.winkel;


/**
 *
 * @author Andy.mertens
 */
import java.math.BigDecimal;
public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    /**
     * @return the omschrijving
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * @return the prijs
     */
    public BigDecimal getPrijs() {
        return prijs;
    }
        
}
