/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.simplefactory.model;

/**
 * @author Veljko
 */
public class Professor extends Person {

    public Professor(final String identicalNumber, final String name, final String surname) {
        super(identicalNumber, name, surname);
    }

    @Override
    public String toString() {
        return "Professor: {" + "identicalNumber=" + identicalNumber + ", name=" + name + ", surname=" + surname + '}';
    }

}
