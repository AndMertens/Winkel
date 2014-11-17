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
    
    private HashMap<Product,Integer>artikelen = new HashMap<>();
    
    public Mand(Product p, int aantal){
       this.artikelen.put(p, aantal);
    }
    
    public Mand(){
        
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
        Iterator i = artikelen.keySet().iterator();
        while(i.hasNext()){
            Product Prod = (Product)i.next();
            totaalBedrag+=Prod.getPrijs() * artikelen.get(Prod);
        }
        return totaalBedrag;
    }
    
    public Iterator iterator(){
        return artikelen.entrySet().iterator();
    }
    
    @Override public String toString(){
        Iterator values = this.artikelen.keySet().iterator();
        StringBuilder inhoudMandje = new StringBuilder();
        inhoudMandje.append("Inhoud van uw mand\n");
        inhoudMandje.append("------------------\n");
        inhoudMandje.append("ProdID  Product  Prijs \tAantal \n");
        
        while(values.hasNext()){
            Product P = (Product)values.next();
            inhoudMandje.append(P);
            inhoudMandje.append("\t");
            inhoudMandje.append(this.artikelen.get(P));
            inhoudMandje.append("\n");
        }
        
       return inhoudMandje.toString(); 
    }        
}

