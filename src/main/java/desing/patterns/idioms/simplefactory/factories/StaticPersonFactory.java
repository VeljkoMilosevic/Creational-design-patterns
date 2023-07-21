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

import static desing.patterns.idioms.simplefactory.factories.PersonType.EMPLOYEE;
import static desing.patterns.idioms.simplefactory.factories.PersonType.PROFESSOR;
import static desing.patterns.idioms.simplefactory.factories.PersonType.STUDENT;

/**
 * @author Veljko
 */
public class StaticPersonFactory {

    private StaticPersonFactory() {
    }

    public static Person createPerson(final String personType, final String uniqueNumber, final String name, final String surname) {
        switch (personType) {
            case PROFESSOR -> {
                return new Professor(uniqueNumber, name, surname);
            }
            case EMPLOYEE -> {
                return new Employee(uniqueNumber, name, surname);
            }
            case STUDENT -> {
                return new Student(uniqueNumber, name, surname);
            }
            default -> throw new UnknownTypeException(String.format("Wrong person type:%s!", personType));
        }
    }
}

