/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.abstractfactory.factories;

import desing.patterns.patterns.abstractfactory.ice.creams.flavors.IceCreamFlavor;
import desing.patterns.patterns.abstractfactory.ice.creams.types.IceCreamType;

/**
 * @author Veljko
 */
public interface AbstractIceCreamFactory {

    IceCreamType createIceCreamType();

    IceCreamFlavor createIceCreamFlavor();
}
