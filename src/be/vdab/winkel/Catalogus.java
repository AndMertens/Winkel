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
    LinkedList<Product> productCatalogus;
    
    public Catalogus(List <Product> lijstProdukten){
        if(!(lijstProdukten.isEmpty()))
                this.productCatalogus.addAll(lijstProdukten);
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
    
    public ListIterator ListIterator(int index){
        if(index==0)
            return productCatalogus.listIterator();
        else    
            return productCatalogus.listIterator(index);
    }
    
}
