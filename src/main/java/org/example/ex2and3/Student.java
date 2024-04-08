package org.example.ex2and3;

public class Student {
    private String name;
    private float media;

    public Student(String name, float media) {
        this.name = name;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + name + '\'' +
                ", medie=" + media +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Float.compare(student.media, media) == 0 &&
                name.equals(student.name);
    }

    // ex 3
    public boolean equals(Student student) {
        return false;
    }


    @Override
    public int hashCode() {
        return 31 * name.hashCode() + Float.hashCode(media);
    }
}
