/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class Product{
    private String prodId;
    private String productName;
    private double price;

        
    public Product(String prodId, String productName, double price) {
        setProdId(prodId);
        setProductName(productName);
        setPrice(price);
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(final String productId) {
        this.prodId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(final String productName) {
        this.productName = productName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }
    
    
}
