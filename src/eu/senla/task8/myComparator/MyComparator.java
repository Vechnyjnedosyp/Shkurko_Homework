package eu.senla.task8.myComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1 != null && o2 != null) {
            return o1.compareToIgnoreCase(o2);
        } return -2;
    }
}
