/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public abstract class Reciept {
    private LineItem[] lineItem;
    private Customer customer;
    private double total;
    
    public void Reciept(String custId){
         
    }
    
    public double getTotalBDiscount(){
        return total;
    }
}
