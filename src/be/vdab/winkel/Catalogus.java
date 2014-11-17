/*
 * Catalogus.java
 */
package be.vdab.winkel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Andy.mertens
 * @param <Product>
  */
public class Catalogus<Product> {
    LinkedList<Product> productCatalogus= new LinkedList<>();
    
    public Catalogus(List <Product> lijstProdukten){
        if(!(lijstProdukten.isEmpty()))
                productCatalogus.addAll(lijstProdukten);
        else
            this.productCatalogus = null;
    } 
    
    public Catalogus(Product [] lijstProdukten){
        if(lijstProdukten.length>0){
            productCatalogus.addAll(Arrays.asList(lijstProdukten));
            
        }
        else
            this.productCatalogus = null;
    } 
    
    public Product getProduct(int index){
        if(index==0)
            return (Product)productCatalogus.getFirst();
        else    
            return (Product)productCatalogus.get(index);
    }
    
}
