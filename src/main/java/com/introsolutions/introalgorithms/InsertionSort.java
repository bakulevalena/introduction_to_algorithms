package com.introsolutions.introalgorithms;

public class InsertionSort<T extends Number> implements ArraySort<T> {

    private NumberComparator numberComparator = new NumberComparator();

    public T[] sortAsc(T[] array) {
        if (array == null) {
            return null;
        }

        for (int j = 1; j < array.length; j++) {
            T key = array[j];
            int i = j - 1;
            while (i >= 0 && (numberComparator.compare(array[i], key) > 0)) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        return array;
    }

    public T[] sortDesc(T[] array) {
        if (array == null) {
            return null;
        }
        for (int j = 1; j < array.length; j++) {
            T key = array[j];
            int i = j - 1;
            while (i >= 0 && (numberComparator.compare(array[i], key) < 0)) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        return array;

    }
}
