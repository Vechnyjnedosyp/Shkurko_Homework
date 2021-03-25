package eu.senla.task8.myArray;

import eu.senla.task8.myException.MyArrayIndexOutOfBoundsException;
import eu.senla.task8.myException.MyIllegalArgumentException;
import eu.senla.task8.myException.MyNegativeArraySizeException;
import java.util.*;

public class MyArrayList <E> implements MyList <E> {


    private E [] elements;
    private int elementsInList;

    public MyArrayList()  {
        this(0);
    }

    public MyArrayList(MyList<? extends E> col) {
        elements = (E[]) new Object[col.size()];

        for (int i = 0; i < col.size(); i++){
            elements[i] = col.get(i);
            elementsInList++;
        }
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new MyNegativeArraySizeException("Illegal Capacity: " + capacity, capacity);
        } else {
            this.elements = (E[]) new Object[capacity];
            this.elementsInList = 0;
        }
    } // exception

    @Override
    public void add(E obj) {
        E[] temp = elements;
        elements = (E[]) new Object[temp.length + 1];

        for (int i = 0; i < temp.length; i++) {
            set(i, temp[i]);
            }

        set(elementsInList, obj);
        elementsInList++;
    }

    @Override
    public void add(int index, E obj) {
        if (index < 0 || index > size()){
            throw new MyArrayIndexOutOfBoundsException("Index: " + index + "; Size: " + size());
        }
        if (checkIfListFull()) {
            growList();
        }

        for (int i = elementsInList; i >= 0; i--) {
            if (i > index){
                set(i, get(i-1));
            }
            set(i, get(i));
        }

        set(index, obj);
        elementsInList++;
    } // exception

    @Override
    public void growList() {
        E[] temp = elements;
        elements = (E[]) new Object[(int) (temp.length * 1.75)];

        for (int i = 0; i < temp.length; i++) {
            set(i, temp[i]);
        }
    }

    @Override
    public boolean addAll(int index, MyList<? extends E> col) {
            if (checkIfListFull()) {
                growList();
            }

            int previousSize = size();
            int previousElements = elementInList();

            for (int i = 0; i < col.size(); i++){
                add(index, col.get(i));
                index++;
            }

        return previousSize != size() || previousElements != elementInList();
    }

    @Override
    public int size() {
        return this.elements.length;
    }

    @Override
    public int elementInList() {
        return elementsInList;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public int indexOf(E obj) {
        if (obj == null) {
            for (int i = 0; i < elementsInList; i++)
                if (get(i)==null)
                    return i;
        } else {
            for (int i = 0; i < elementsInList; i++)
                if (obj.equals(get(i)))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E obj) {
        if (obj == null) {
            for (int i = elementsInList -1; i >= 0; i--)
                if (get(i)==null)
                    return i;
        } else {
            for (int i = elementsInList -1; i >= 0; i--)
                if (obj.equals(get(i)))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {
            int nextIndex = 0;
            int previousIndex = size() - 1;

            @Override
            public boolean hasNext() {
                return nextIndex < size() && get(nextIndex) != null;
            }

            @Override
            public E next() {
                return get(nextIndex++);
            }

            @Override
            public boolean hasPrevious() {
                return previousIndex >= 0 && get(previousIndex) != null;
            }

            @Override
            public E previous() {
                return get(previousIndex--);
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
        };
    }

    @Override
    public E remove(int index) {
        E remove = get(index);
        set(index, null);
        elementsInList--;

        for (int i = 0; i <= elementsInList; i++) {
            if (i > index){
                set(i-1, get(i));
            } else {
                set(i,get(i));
            }
        }

        set(elementsInList, null);
        return remove;
    }

    @Override
    public E set(int index, E obj) {
        return elements[index] = obj;
    }

    @Override
    public void sort(Comparator<? super E> comp) {
        for (int i = 0; i < size() - 1; i++){
            for (int j = size() - 1; j > i; j--){
                if(comp.compare(get(j-1), get(j)) > 0){
                    Object temp = get(j - 1);
                    set(j - 1,get(j));
                    set(j,(E) temp);
                }
            }
        }
    }

    @Override
    public MyList<E> subList(int start, int end) throws MyIllegalArgumentException {
        if (start < 0) {
            throw new MyArrayIndexOutOfBoundsException("fromIndex "+ start +" < 0");
        }
        if (end > size()){
            throw new MyArrayIndexOutOfBoundsException("toIndex "+ end + " > sizeList " + size());
        }
        if (start > end){
            throw new MyIllegalArgumentException("startIndex " + start + " > " + "endIndex " + end);
        }
        MyList<E> myList = new MyArrayList<>(end-start);
        int index = 0;

        for (int i = start; i < end; i++ ){
            myList.add(index, get(i));
            index++;
        }

        return myList;
    } // exception

   @Override
    public boolean checkIfListFull() {
        return this.elements.length == this.elementsInList;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
