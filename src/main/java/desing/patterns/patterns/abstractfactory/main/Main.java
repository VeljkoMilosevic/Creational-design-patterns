/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.abstractfactory.main;

import desing.patterns.patterns.abstractfactory.factories.AbstractIceCreamFactory;
import desing.patterns.patterns.abstractfactory.factories.ChocolateConeIceCream;
import desing.patterns.patterns.abstractfactory.factories.VanillaCupIceCream;
import desing.patterns.patterns.abstractfactory.ice.creams.flavors.IceCreamFlavor;
import desing.patterns.patterns.abstractfactory.ice.creams.types.IceCreamType;

/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) {
        createVanillaCupIceCream();
        System.out.println("====================");
        createChocolateConeIceCream();
    }

    private static void createVanillaCupIceCream() {
        final AbstractIceCreamFactory factory = new VanillaCupIceCream();
        final IceCreamType iceCreamType = factory.createIceCreamType();
        iceCreamType.showIceCreamType();
        final IceCreamFlavor iceCreamFlavor = factory.createIceCreamFlavor();
        iceCreamFlavor.showFlavor();
    }

    private static void createChocolateConeIceCream() {
        final AbstractIceCreamFactory factory = new ChocolateConeIceCream();
        final IceCreamType iceCreamType = factory.createIceCreamType();
        iceCreamType.showIceCreamType();
        final IceCreamFlavor iceCreamFlavor = factory.createIceCreamFlavor();
        iceCreamFlavor.showFlavor();
    }
}
