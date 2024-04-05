package lesson11.additionalTask;

import java.util.Arrays;

public class ArraySlava {
    private int size;
    private int capacity;
    private Integer[] elements;

    public ArraySlava() {
        capacity = 10;
        size = 0;
        elements = new Integer[capacity];
    }

    public ArraySlava(int capacity) {
        this.capacity = capacity;
        size = 0;
        elements = new Integer[capacity];
    }

    public void add(int element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public void remove(int element) {
        Integer[] newArray = new Integer[elements.length - 1];
        int counter = 0;
        for (Integer i : elements) {
            if (i == null) {
                continue;
            }
            if (i == element) {
                continue;
            } else {
                newArray[counter] = i;
                counter++;
            }
            elements = newArray;
        }
        size--;

    }

    public boolean search(int element) {
        boolean flag = false;
        for (Integer i : elements) {
            if (i == null) {
                continue;
            }
            if (i == element) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int getElements(int i) {
        return elements[i];
    }

    public void clean() {
        elements = new Integer[elements.length];

    }

    private void grow() {
        capacity *= 2;
        elements = Arrays.copyOf(elements, capacity);
    }

    public void print() {

        String newElements = Arrays.toString(Arrays.copyOf(elements, size));
        System.out.println(newElements);
    }


}
