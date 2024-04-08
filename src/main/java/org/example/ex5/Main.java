package org.example.ex5;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CustomHashSet customHashSet = new CustomHashSet();
        customHashSet.add(10);
        customHashSet.addAll(new HashSet<>(Set.of(10, 50, 30)));
        System.out.println("Elements in CustomHashSet: " + customHashSet.getTotalAddedElements());


        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(50);
        customLinkedList.addAll(new LinkedList<>(List.of(30, 40, 80)));
        System.out.println("Elements in CustomLinkedList: " + customLinkedList.getTotalElementeAdaugate());
    }
}

