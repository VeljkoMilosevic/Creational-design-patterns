/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.idioms.simplefactory.main;

import desing.patterns.idioms.simplefactory.factories.PersonFactory;
import desing.patterns.idioms.simplefactory.factories.StaticPersonFactory;
import desing.patterns.idioms.simplefactory.model.Person;

import static desing.patterns.idioms.simplefactory.factories.PersonType.EMPLOYEE;
import static desing.patterns.idioms.simplefactory.factories.PersonType.PROFESSOR;
import static desing.patterns.idioms.simplefactory.factories.PersonType.STUDENT;


/**
 * @author Veljko
 */
public class Main {

    public static void main(final String[] args) {
        callingNonStaticPersonFactory();
        callingStaticPersonFactory();
    }

    private static void callingNonStaticPersonFactory() {
        final PersonFactory personFactory = new PersonFactory();

        final Person employee = personFactory.createPerson(EMPLOYEE, "6317356252823", "James", "Campbell");
        System.out.println(employee);

        final Person student = personFactory.createPerson(STUDENT, "2915863108541", "Margaret", "Roy");
        System.out.println(student);

        final Person professor = personFactory.createPerson(PROFESSOR, "9829896975578", "Harry", "Robertson");
        System.out.println(professor);

        try {
            personFactory.createPerson("DevOps engineer", "9473346014521", "Gracie", "Chambers");
        } catch (final RuntimeException ex) {
            System.out.println("Expected exception:" + ex.getMessage());
        }
    }

    private static void callingStaticPersonFactory() {
        final Person employee = StaticPersonFactory.createPerson(EMPLOYEE, "9045147424743", "William", "Chapman");
        System.out.println(employee);

        final Person student = StaticPersonFactory.createPerson(STUDENT, "8021969175222", "Edward", "Fish");
        System.out.println(student);

        final Person professor = StaticPersonFactory.createPerson(PROFESSOR, "4945621363900", "Wilma", "Linger");
        System.out.println(professor);

        try {
            StaticPersonFactory.createPerson("Software developer", "5457072861548", "Angela", "Shook");
        } catch (final RuntimeException ex) {
            System.out.println("Expected exception:" + ex.getMessage());
        }
    }
}
