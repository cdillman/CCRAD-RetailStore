/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public abstract class LineItem extends Reciept{
    private double quantity;
    private Product prod;
    private double itemTot;

    public LineItem() {
        this.quantity = quantity;
        this.prod = prod;
        this.itemTot = itemTot;
    }

    
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public double getItemTot() {
        return itemTot;
    }

    public void setItemTot(double itemTot) {
        this.itemTot = prod.getPrice() * quantity;
    }
    
    
    
    
}
