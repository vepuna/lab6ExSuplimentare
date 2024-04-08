package org.example.ex5;
import java.util.LinkedList;

class CustomLinkedList extends LinkedList<Integer> {
    private int totalElementeAdaugate = 0;

    @Override
    public boolean add(Integer element) {
        boolean isSuccesful = super.add(element);
        if (isSuccesful) {
            totalElementeAdaugate++;
        }
        return isSuccesful;
    }

    @Override
    public boolean addAll(java.util.Collection<? extends Integer> colectie) {
        boolean isSuccesful = super.addAll(colectie);
        if (isSuccesful)
        {
            totalElementeAdaugate += colectie.size();
        }
        return isSuccesful;
    }

    public int getTotalElementeAdaugate() {
        return totalElementeAdaugate;
    }
}
