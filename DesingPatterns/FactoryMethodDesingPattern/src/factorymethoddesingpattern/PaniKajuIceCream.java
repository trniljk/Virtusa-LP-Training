/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethoddesingpattern;

/**
 *
 * @author Night_King
 */
public class PaniKajuIceCream extends IceCream{
    @Override
    protected void createIceCream(){
        ingredients.add(new IceCreamMixer());
        ingredients.add(new Vanila());
        ingredients.add(new Honey());
        ingredients.add(new CashewNut());
    }
}
