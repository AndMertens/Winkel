/*
 * Mand.java
 */
package be.vdab.winkel;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Andy.mertens
 */
public class Mand {
    
    private HashMap<Product,Integer>artikelen;
    
    public Mand(Product p, int aantal){
        
    }
    
    public Mand(){
       artikelen=null; 
    }
    
    public void Add(Product prod,int aantal){
         artikelen.put(prod, aantal);
        
    }
    public int Set(Product prod,int aantal){
         if(artikelen.put(prod, aantal)==null)
             return 1;
         else
             return (artikelen.put(prod, aantal)+1);
    }
    
    public int Remove(Product prod){
        if(artikelen.get(prod)!=null)
            return (artikelen.remove(prod)-1);
        else
            return 0;
    }
    
    public void Clear(){
        artikelen.clear();
    }
    
    public double getSom(){
        double totaalBedrag=0;
        Iterator i = artikelen.entrySet().iterator();
        while(i.hasNext()){
            Product Prod = (Product)i.next();
            totaalBedrag+=Prod.getPrijs().doubleValue() * artikelen.get(Prod).doubleValue();
        }
        return totaalBedrag;
    }
    
    public Iterator iterator(){
        return artikelen.entrySet().iterator();
        }
    
}

