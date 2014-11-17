/*
 * Product.java
 */
package be.vdab.winkel;


/**
 *
 * @author Andy.mertens
 */

public class Product implements Comparable{
    private String omschrijving;
    private double prijs;
    private int prodID;
    private static int ProdCounter = 0;

    public Product(String omschrijving, double prijs){
        this.omschrijving = omschrijving;
        this.prijs = prijs;
        ProdCounter++;
        this.prodID = ProdCounter;
        
        
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
    
    @Override public String toString(){
        return (this.prodID + "\t" + this.omschrijving + "\t " + this.prijs);
    }
    
    @Override public boolean equals(Object o){
        if(!(o instanceof Product))
            return false;
        else {
            Product anderProd = (Product)o;
            return this.prodID == anderProd.prodID;
        }
    }
    
    @Override public int hashCode(){
        return this.prodID;
    }
    
    @Override public int compareTo(Object o){
        if(!(o instanceof Product))
            return 0;
        else if (this.equals(o))
            return -1;
        else                    
            return 1;
    }
    
}
