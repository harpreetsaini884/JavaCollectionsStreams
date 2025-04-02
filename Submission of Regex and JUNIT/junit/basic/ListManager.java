package org.rituraj.junit.basic;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    // Adds an element to the list
    public static List<Integer> addElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.add(element);
        return list;
    }

    // Removes an element from the list if present
    public static List<Integer> removeElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.remove(Integer.valueOf(element)); // Avoids index-based removal issue
        return list;
    }

    // Returns the size of the list
    public static int getSize(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.size();
    }
}
