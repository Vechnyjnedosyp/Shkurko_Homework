package eu.senla.task8.myArray;

import eu.senla.task8.myExceptions.MyArrayIndexOutOfBoundsException;
import eu.senla.task8.myExceptions.MyIllegalArgumentException;

import java.util.Comparator;
import java.util.ListIterator;

public interface MyList <E> {

    void add(E obj);

    void add(int index, E obj);

    void growList();

    boolean addAll(int index, MyList<? extends E> col);

    int size();

    int elementInList();

    E get(int index);

    int indexOf(E obj);

    int lastIndexOf(E obj);

    ListIterator<E> listIterator();

    @SafeVarargs
    static <E> MyList<E> of(E... objects) {
        MyList<E> myList = new MyArrayList<>(objects.length);
        for (int i = 0; i < myList.size(); i++){
            myList.set(i, objects[i]);
        }
        return myList;
    }

    E remove(int index);

    E set(int index, E obj);

    void sort(Comparator<? super E> comp);

    MyList<E> subList(int start, int end) throws MyArrayIndexOutOfBoundsException, MyIllegalArgumentException;

    boolean checkIfListFull();

}
