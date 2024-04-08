package org.example.ex5;
import java.util.HashSet;

class CustomHashSet extends HashSet<Integer> {
    private int totalAddedElements = 0;

    @Override
    public boolean add(Integer element) {
        boolean isSuccesful = super.add(element);
        if (isSuccesful) {
            totalAddedElements++;
        }
        return isSuccesful;
    }

    @Override
    public boolean addAll(java.util.Collection<? extends Integer> collection) {
        boolean isSuccesful = super.addAll(collection);
        if (isSuccesful) {
            totalAddedElements += collection.size();
        }
        return isSuccesful;
    }

    public int getTotalAddedElements() {
        return totalAddedElements;
    }
}
