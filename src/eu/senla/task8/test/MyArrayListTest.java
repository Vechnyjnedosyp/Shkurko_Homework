package eu.senla.task8.test;

import eu.senla.task8.myArray.MyArrayList;
import eu.senla.task8.myArray.MyList;
import eu.senla.task8.myComparator.MyComparator;
import eu.senla.task8.myExceptions.MyArrayIndexOutOfBoundsException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("It's test class of MyArrayList")
public class MyArrayListTest {

    MyList<String> testList;

    @BeforeEach
    public void setUp() {
        testList = new MyArrayList<>();
    }

    @Test
    @DisplayName("Return size 0 when creating an empty list.")
    public void testFirstConstructor() {
        assertEquals(0, testList.size());
    }

    @Test
    @DisplayName("Creating a new MyArrayList with a ready collection.")
    public void testSecondConstructor() {
        testList = new MyArrayList<>();
        testList.add("cat");
        testList.add("dog");
        testList.add("bird");
        testList.add("fox");
        MyList<String> test = new MyArrayList<>(testList);
        assertNotEquals(testList, test, "They shouldn't equal");
    }

    @Test
    @DisplayName("Creating a new MyArrayList with a specific size,objects = null.")
    public void testAnotherConstructor() {
        testList = new MyArrayList<>(4);
        for (int i = 0; i < testList.size(); i++){
            Assertions.assertNull(testList.get(i), "Object '"+ testList.get(i) + "' != null");
        }
    }

    @Test
    @DisplayName("Add new object in MyArrayList.")
    public void testAddNewObjectInList(){
        testList = new MyArrayList<>();
        testList.add("Hi");
        Assertions.assertNotNull(testList.get(0), "Object '"+ testList.get(0) + "' = null");
    }

    @Test
    @DisplayName("Add new object in an empty MyArrayList by index.")
    public void testAddNewObjectInEmptyListByIndex(){
        testList = new MyArrayList<>();
        Exception exception = assertThrows(MyArrayIndexOutOfBoundsException.class, ()->testList.add(4,"User"));
        assertEquals("Index should be 0.", exception.getMessage());
    }

    @RepeatedTest(2)
    @DisplayName("Add all objects in MyArrayList by index.")
    public void whenUseAddAllReturnTrue() {
        testList.add("cat");
        testList.add("dog");
        testList.add("bird");
        testList.add("fox");
        MyList<String> test = new MyArrayList<>();
        test.addAll(0,testList);
        assertTrue(true);
        test.addAll(2,testList);
        assertTrue(true);
    }

    @Test
    @DisplayName("Checking elements in list.")
    public void whenAddNewObjectsReturnTheirQuantity() {
        testList = new MyArrayList<>();
        testList.add("Hi");
        testList.add("User");
        assertEquals(2, testList.elementInList());
    }

    @Test
    @DisplayName("Checking the getter is working.")
    public void whenAddNewObjectGetHimComeBack() {
        testList = new MyArrayList<>();
        testList.add("Hi");
        assertEquals("Hi", testList.get(0));
    }

    @Test
    @DisplayName("Object is searched by index")
    public void testIndexOf() {
        testList = new MyArrayList<>();
        testList.add("Hi");
        testList.add("User");
        testList.add("!");
        assertEquals(2, testList.indexOf("!"));
    }

    @Test
    @DisplayName("Searches for the last occurrence of the object and returns the index.")
    public void testLastIndexOf() {
        testList = new MyArrayList<>();
        testList.add("Hi");
        testList.add("User");
        testList.add("Hi");
        assertEquals(2, testList.lastIndexOf("Hi"));
    }

    @Test
    @DisplayName("Doubles the sheet size.")
    public void testGrowList() {
        testList = new MyArrayList<>(3);
        testList.growList();
        assertEquals(6, testList.size());
    }

    @Test
    @DisplayName("Doubles the sheet size.")
    public void testRemoveObject() {
        testList = new MyArrayList<>(3);
        testList.add("Hi");
        testList.add("User");
        testList.add("Hi");
        testList.remove(2);
        assertEquals(2, testList.size());
    }

    @Test
    @DisplayName("Sorting MyArrayList.")
    public void testSortMethod() {
        testList = new MyArrayList<>();
        testList.add("f");
        testList.add("g");
        testList.add("b");
        testList.add("A");
        MyComparator comparator = new MyComparator();
        testList.sort(comparator);
        assertEquals("A", testList.get(0));
    }
}
