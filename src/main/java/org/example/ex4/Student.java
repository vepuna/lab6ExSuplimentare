package org.example.ex4;

public class Student implements Comparable<Student> {
    private String name;
    protected float media;

    public Student(String name, float media) {
        this.name = name;
        this.media = media;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + name + '\'' +
                ", medie=" + media +
                '}';
    }
}
