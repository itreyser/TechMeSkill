package lesson11.additionalTask;

import java.util.Arrays;
import java.util.Objects;

public class ArraySlava {
    private int size;
    private final int capacity;
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

    public void remove(Integer elements) {
        Integer[] newArray = new Integer[this.elements.length - 1];
        int counter = 0;
        for (Integer element : this.elements) {
            if (Objects.equals(element, elements)) {
                continue;
            } else {
                newArray[counter] = element;
                counter++;
            }
            this.elements = newArray;
        }
        size--;

    }

    public void search(Integer elements) {
        boolean flag = false;
        for (Integer i : this.elements) {
            if (Objects.equals(i, elements)) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

    public void getElements(int i) {
        System.out.println(elements[i]);
    }

    public void clean() {
        elements = new Integer[elements.length];

    }

    private void grow() {
        elements = Arrays.copyOf(elements, capacity * 2);
    }

    public void print() {

        String newElements = Arrays.toString(Arrays.copyOf(elements, size));
        System.out.println(newElements);
    }


}
