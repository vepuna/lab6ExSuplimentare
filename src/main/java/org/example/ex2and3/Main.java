package org.example.ex2and3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        addStudent(studentSet, new Student("Alexe", 9.5f));
        addStudent(studentSet, new Student("Vladimir", 8.8f));
        addStudent(studentSet, new Student("Ion", 8.5f));
        addStudent(studentSet, new Student("Stanislav", 9.2f));
        addStudent(studentSet, new Student("Ion", 8.5f));

        for (Student student : studentSet) {
            System.out.println(student);
        }

        /////// Exercitiu  3
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            System.out.println("element.equals(element): " + element.equals(element));
            System.out.println("((Object)element).equals(element): " + ((Object)element).equals(element));
        }
    }

    public static void addStudent(Set<Student> set, Student student) {
        if (!set.add(student)) {
            System.out.println("Studentul " + student + " este prezentat în set!");
        }
    }
}
