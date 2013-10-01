/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class FakeDB implements DBStrategy {

    private Product[] products = {
        new Product("1", "white T", 9.95),
        new Product("2", "hat", 19.95),
        new Product("3", "shorts", 35.95),
        new Product("4", "dress shirt", 45.95),
        new Product("5", "pants", 40.95)
    };
    
    private Customer[] customers = {
        new Customer("100", "Dillman", "Corbin", "29301 north st."),
        new Customer("101", "Mary", "Mark", "9302 south st."),
        new Customer("102", "Goop", "Tyler", "93020 west rd."),
        new Customer("103", "Sure", "Not", "49302 round ct.")
    };

    @Override
    public final Product getProductById(final String prodId) {
        if(prodId == null || prodId.length() == 0){
            System.out.println("Invalid Product");
            return null;
            
        }
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProdId())) {
                product = p;
                break;
                
            }
        }
        return product;
    }

    public final Customer getCustomerById(final String custId) {
        if(custId == null || custId.length() == 0){
            System.out.println("Invalid Product");
            return null;
            
        }
        Customer customer = null;
        for (Customer c: customers) {
            if(custId.equals(c.getCustomerId()))
                customer = c;
                break;
        }
        return customer;
    }
    

    public static void main(String[] args) {
        FakeDB fa = new FakeDB();
        LineItem line = new LineItem();
        
        line.LineItem("2", 3);
        
        System.out.println(line.getProd().getProductName());

    }
}
