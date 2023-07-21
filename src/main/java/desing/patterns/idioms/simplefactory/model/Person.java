/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.simplefactory.model;

/**
 * @author Veljko
 */
public abstract class Person {

    String name;
    String surname;
    String identicalNumber;

    protected Person(final String identicalNumber, final String name, final String surname) {
        this.name = name;
        this.surname = surname;
        this.identicalNumber = identicalNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getIdenticalNumber() {
        return identicalNumber;
    }

    public void setIdenticalNumber(final String identicalNumber) {
        this.identicalNumber = identicalNumber;
    }
}
