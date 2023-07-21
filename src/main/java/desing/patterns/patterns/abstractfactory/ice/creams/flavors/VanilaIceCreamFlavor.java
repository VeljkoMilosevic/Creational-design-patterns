/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.abstractfactory.ice.creams.flavors;

/**
 * @author Veljko
 */
public class VanilaIceCreamFlavor implements IceCreamFlavor {

    @Override
    public void showFlavor() {
        System.out.println("Vanilla ice cream flavor.");
    }

}
