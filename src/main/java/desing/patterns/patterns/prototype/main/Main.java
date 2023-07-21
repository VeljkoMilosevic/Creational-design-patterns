/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desing.patterns.patterns.prototype.main;

import desing.patterns.patterns.prototype.model.Index;
import desing.patterns.patterns.prototype.model.Student;

import java.util.Date;

/**
 * @author Veljko
 */
public class Main {

    private static final String SHALLOW_CLONE = "shallow";
    private static final String DEEP_CLONE = "deep";

    public static void main(final String[] args) {
        System.out.println("=========SHALLOW CLONE===================");
        testCloneType(SHALLOW_CLONE);
        System.out.println("=========DEEP CLONE===================");
        testCloneType(DEEP_CLONE);
    }

    private static Student shallowClone(final Student sourceStudent) {
        System.out.println("Shallow coping student...");
        return (Student) sourceStudent.shallowClone();
    }

    private static Student deepClone(final Student sourceStudent) {
        System.out.println("Deep coping student...");
        return (Student) sourceStudent.deepClone();
    }

    private static void testCloneType(final String cloneType) {
        final Index index = new Index("2020", "0244");
        final Student student = new Student("John", "Doe", index, new Date());

        final Student copiedStudent = cloneType.equals(SHALLOW_CLONE) ? shallowClone(student) : deepClone(student);
        System.out.println("Source and copied students are same via == operator:" + (student == copiedStudent));
        System.out.println("Source and copied students are same via equals() method:" + student.equals(copiedStudent));
        System.out.println("References to student's indexes are showing on same object in memory:" + (student.getIndex() == copiedStudent.getIndex()));

        System.out.println("Changing index of second student...");
        copiedStudent.getIndex().setNumber("3333");
        copiedStudent.getIndex().setYear("2016");
        System.out.println("Source and copied students are still same via equals() methods:" + student.equals(copiedStudent));
        System.out.println("References to indexes of source and copied student are showing on same object in memory:" + (student.getIndex() == copiedStudent.getIndex()));
    }
}
