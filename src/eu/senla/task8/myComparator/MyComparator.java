package eu.senla.task8.myComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
