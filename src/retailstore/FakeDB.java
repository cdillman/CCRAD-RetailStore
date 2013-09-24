/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class FakeDB extends LineItem{
    
    private Product[] product = {
        new Product("1" ,"white T", 9.95),
        new Product("2" ,"hat", 19.95),
        new Product("3" ,"shorts", 35.95),
        new Product("4" ,"dress shirt", 45.95),
        new Product("5" ,"pants", 40.95)
    
    };
    
    private Customer[] customer = {
        new Customer("100", "Dillman", "Corbin", "29301 north st."),
        new Customer("101", "Mary", "Mark", "9302 south st."),
        new Customer("102", "Goop", "Tyler", "93020 west rd."),
        new Customer("103", "Sure", "Not", "49302 round ct.")
    };
    
    
    
    
    
}
