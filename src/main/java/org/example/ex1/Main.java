package org.example.ex1;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        try {
            addElement(stringSet, "Alexei");
            addElement(stringSet, "Vladimir");
            addElement(stringSet, "Alexei");
            addElement(stringSet, "Ecaterina");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Collectia finala: " + stringSet);
    }

    public static void addElement(Set<String> set, String element) throws Exception {
        if (!set.add(element)) {
            throw new Exception("Elementul \"" + element + "\" se afla in set!");
        }
    }
}