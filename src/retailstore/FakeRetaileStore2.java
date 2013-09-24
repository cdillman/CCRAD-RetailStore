/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class FakeRetaileStore2 extends Reciept{
    private final String storeName = "KOHLS";
    private final String address = "38291 DELIFEILD RD.";
    private final String city = "DELIFEILD";
    private final String state = "WI";
    
    public String getHeadder(){
        return storeName + "\n" + address + "\n" + city + ", " + state;
    }
}
