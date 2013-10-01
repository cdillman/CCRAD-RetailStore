/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class ConsoleOutPut implements OutputStrategy{
    private LineItem line;
    
    public void printProdInfo(){
        System.out.println(line);
    }

    @Override
    public void printProductInfo() {
        System.out.println();
    }
    
    
}
