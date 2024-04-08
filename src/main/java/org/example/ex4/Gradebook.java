package org.example.ex4;
import java.util.*;

public class Gradebook extends TreeMap<Float, List<Student>> {
    private float MIN_MEDIE = 0f;
    private float MAX_MEDIE = 10f;

    private Comparator<Float> comparator;

    public Gradebook(Comparator<Float> comparator) {
        super(comparator);
        this.comparator = comparator;
    }

    @Override
    public List<Student> put(Float key, List<Student> value) {
        if (key < MIN_MEDIE || key > MAX_MEDIE) {
            throw new IllegalArgumentException("Media invalida. Trebuie sa fie intre " + MIN_MEDIE + " si " + MAX_MEDIE);
        }
        return super.put(key, value);
    }

    public void add(Student student) {
        float mediaRounded = Math.round(student.media);
        List<Student> listaStudenti = this.getOrDefault(mediaRounded, new ArrayList<>());
        listaStudenti.add(student);
        this.put(mediaRounded, listaStudenti);
    }

    public void sortStudents() {
        for (Map.Entry<Float, List<Student>> entry : this.entrySet()) {
            List<Student> listaStudenti = entry.getValue();
            Collections.sort(listaStudenti);
        }
    }

    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook(Comparator.reverseOrder());

        gradebook.add(new Student("Alexei", 9.3f));
        gradebook.add(new Student("Vladimir", 9.7f));
        gradebook.add(new Student("Max", 7.9f));
        gradebook.add(new Student("Anastasia", 9.8f));

        gradebook.sortStudents();

        for (Map.Entry<Float, List<Student>> entry : gradebook.entrySet()) {
            System.out.println("Media: " + entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println("\t" + student);
            }
        }
    }
}
