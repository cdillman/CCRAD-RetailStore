/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

/**
 *
 * @author Corbin
 */
public class FakeRetaileStore1 extends Reciept{
    private final String storeName = "JC PENNY'S";
    private final String address = "12342 BROOKFEILD RD.";
    private final String city = "BROOKFEILD";
    private final String state = "WI";
    
    public String getHeadder(){
        return storeName + "\n" + address + "\n" + city + ", " + state;
    }
}
