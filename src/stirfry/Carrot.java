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
public class Carrot extends Vegetable {

    public Carrot() {
        super("Carrot", "Orange");
    }
    
    @Override
    public boolean isTasty() {
        return true;
    }

}
