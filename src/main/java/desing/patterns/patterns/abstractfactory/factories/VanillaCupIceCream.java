/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.abstractfactory.factories;

import desing.patterns.patterns.abstractfactory.ice.creams.flavors.IceCreamFlavor;
import desing.patterns.patterns.abstractfactory.ice.creams.flavors.VanilaIceCreamFlavor;
import desing.patterns.patterns.abstractfactory.ice.creams.types.IceCreamCup;
import desing.patterns.patterns.abstractfactory.ice.creams.types.IceCreamType;

/**
 * @author Veljko
 */
public class VanillaCupIceCream implements AbstractIceCreamFactory {

    @Override
    public IceCreamType createIceCreamType() {
        return new IceCreamCup();
    }

    @Override
    public IceCreamFlavor createIceCreamFlavor() {
        return new VanilaIceCreamFlavor();
    }

}
