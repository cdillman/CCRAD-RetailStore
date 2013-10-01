/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public interface DBStrategy {
    
    public abstract Product getProductById(final String prodId);
}
