/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stirfry;

/**
 *
 * @author haki
 */
public class GreenPepper extends Vegetable {

    
    public GreenPepper() {
        super("GreenPepper", "Green");
    }
    
    @Override
    public boolean isTasty() {
        return true;
    }
    
}
