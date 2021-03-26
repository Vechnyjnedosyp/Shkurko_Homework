package eu.senla.task8.test;

import eu.senla.task8.myArray.MyArrayList;
import eu.senla.task8.myArray.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void whenCreateNewBlankMyArrayListReturnSizeZero() {
        MyList<String> test = new MyArrayList<>();
        assertEquals(0, test.size());
    }

    @Test
    public void whenCreateNewBlankMyArrayListReturnObjectNull() {
        MyList<String> test = new MyArrayList<>(4);
        //test.add(2,"3");
        for (int i = 0; i < test.size(); i++){
            Assertions.assertNull(test.get(i), "Object '"+ test.get(i) + "' != null");
        }
    }

    @Test
    public void whenUseAddAllReturnTrue() {
        MyList<String> animal = new MyArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("bird");
        animal.add("fox");
        MyList<String> test = new MyArrayList<>();
        test.addAll(0,animal);
        assertTrue(true);
    }

}
