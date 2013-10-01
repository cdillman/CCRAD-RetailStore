/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class PrinterOutput implements OutputStrategy{
    private Reciept receipt;
       
    

    @Override
    public void printProductInfo() {
        System.out.println(receipt);
    }
}
