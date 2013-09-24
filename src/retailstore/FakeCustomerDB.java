/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class FakeCustomerDB extends Reciept{
   
    private Customer[] customer = {
        new Customer("100", "Dillman", "Corbin", "29301 north st."),
        new Customer("101", "Mary", "Mark", "9302 south st."),
        new Customer("102", "Goop", "Tyler", "93020 west rd."),
        new Customer("103", "Sure", "Not", "49302 round ct.")
    };
}
