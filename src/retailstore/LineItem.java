/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class LineItem {
    private double quantity;
    private Product prod;
    private DBStrategy db;
    private double itemTot;

    public void LineItem(String prodId, double quantity) {
        this.prod = findProduct(prodId);
        setQuantity(quantity);
    }

    private final Product findProduct(final String prodID){
        return db.getProductById(prodID);
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
    
    public static void main(String[] args) {
      FakeDB db = new FakeDB();
      LineItem line = new LineItem();
      
      line.LineItem("2", 3);
      
//      System.out.println(line.getProd().getProductName());
      
      
    }
    
    
}
