package com.introsolutions.introalgorithms;

import java.util.Comparator;

public class NumberComparator implements Comparator<Number> {

    @Override
    public int compare(Number first, Number second) {
        double firstDouble = first.doubleValue();
        double secondDouble = second.doubleValue();
        return Double.compare(firstDouble, secondDouble);
    }
}
