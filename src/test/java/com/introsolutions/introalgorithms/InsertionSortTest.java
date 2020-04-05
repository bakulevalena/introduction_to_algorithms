package com.introsolutions.introalgorithms;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    private InsertionSort<Integer> insertionSort = new InsertionSort<>();

    @Test
    public void sortAsc() {
        Integer[] array = new Integer[]{51, 48, 11, 12, 2};
        Integer[] expected = new Integer[]{2, 11, 12, 48, 51};
        Integer[] actual = insertionSort.sortAsc(array);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortAscSorted() {
        Integer[] array = new Integer[]{2, 12, 32, 48, 51};
        Integer[] expected = new Integer[]{2, 12, 32, 48, 51};
        Integer[] actual = insertionSort.sortAsc(array);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortAscNull() {
        Integer[] actual = insertionSort.sortAsc(null);

        Assert.assertNull(actual);
    }

    @Test
    public void sortDesc() {
        Integer[] array = new Integer[]{1, 11, 14, 16, 35};
        Integer[] expected = new Integer[]{35, 16, 14, 11, 1};
        Integer[] actual = insertionSort.sortDesc(array);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortDescSorted() {
        Integer[] array = new Integer[]{35, 16, 14, 11, 1};
        Integer[] expected = new Integer[]{35, 16, 14, 11, 1};
        Integer[] actual = insertionSort.sortDesc(array);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortDescNull() {
        Integer[] actual = insertionSort.sortDesc(null);

        Assert.assertNull(actual);
    }
}