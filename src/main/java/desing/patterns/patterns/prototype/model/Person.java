/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.prototype.model;

/**
 * @author Veljko
 */
public interface Person {

    Person shallowClone();

    Person deepClone();
}
