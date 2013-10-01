/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;
import javax.swing.JOptionPane;

/**
 *
 * @author Corbin
 */
public class GuiOutput implements OutputStrategy{
   private LineItem line;

    @Override
    public void printProductInfo() {
       JOptionPane.showMessageDialog(null, line);
    }
    
    
    
    
}
