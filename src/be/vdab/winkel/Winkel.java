/*
 * Winkel.java
 */
package be.vdab.winkel;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Andy.mertens
 */
public class Winkel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Catalogus mijnCatalogus = new Catalogus(vulCatalogus());
        drukCatalogus(mijnCatalogus);
        System.out.println();
        Mand mijnMand = new Mand();
        vulMandje(mijnMand,mijnCatalogus);
        drukMandje(mijnMand);
        System.out.println("Totaal bedrag voor mandje : "+ Double.toString(mijnMand.getSom()));
        Product P = (Product)mijnCatalogus.getProduct(2-1);
        mijnMand.Set(P,5);
        drukMandje(mijnMand);
        
    }
        
    private static LinkedList vulCatalogus(){
        LinkedList<Product> mijnCatalogus = new LinkedList<>();
        mijnCatalogus.add(new Product("Cola",0.80));
        mijnCatalogus.add(new Product("Spa",0.65));
        mijnCatalogus.add(new Product("Fanta",0.80));
        mijnCatalogus.add(new Product("Leffe",1.40));
        return mijnCatalogus;
    }
    
    private static void drukCatalogus(Catalogus mijnCatalogus){
        System.out.println("Inoud van de catalogus \n----------------------");
        ListIterator i = mijnCatalogus.productCatalogus.listIterator();
        while(i.hasNext()){
            Product P = (Product)i.next();
            System.out.println(P);
        }
    }
    
    private static void vulMandje(Mand mijnMand, Catalogus mijnCatalogus){
        ListIterator li = mijnCatalogus.productCatalogus.listIterator();
        while(li.hasNext()){
            Product p = (Product) li.next();
            mijnMand.Add(p,3);
        }
        
    }
    
    private static void drukMandje(Mand mijnMand){
        System.out.println(mijnMand.toString());
    }     

}
