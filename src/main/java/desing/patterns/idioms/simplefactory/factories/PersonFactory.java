/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.simplefactory.factories;


import desing.patterns.idioms.simplefactory.model.Employee;
import desing.patterns.idioms.simplefactory.model.Person;
import desing.patterns.idioms.simplefactory.model.Professor;
import desing.patterns.idioms.simplefactory.model.Student;
import desing.patterns.idioms.simplefactory.model.UnknownTypeException;

/**
 * @author Veljko
 */
public class PersonFactory {

    public Person createPerson(final String personType, final String uniqueNumber, final String name, final String surname) {
        switch (personType) {
            case PersonType.PROFESSOR:
                return new Professor(uniqueNumber, name, surname);
            case PersonType.EMPLOYEE:
                return new Employee(uniqueNumber, name, surname);
            case PersonType.STUDENT:
                return new Student(uniqueNumber, name, surname);
            default:
                throw new UnknownTypeException(String.format("Wrong person type:%s!", personType));
        }
    }
}
