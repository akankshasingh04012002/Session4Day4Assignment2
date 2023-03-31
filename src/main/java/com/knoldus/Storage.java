package com.knoldus;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Integer> elements = new ArrayList<>();

    public void addElement(int element) {
        elements.add(element);
    }

    public boolean removeElement(int element) {
        return elements.remove(Integer.valueOf(element));
    }

    public void removeAll() {
        elements.clear();
    }

    public boolean checkIfContains(int element) {
        return elements.contains(element);
    }
}
