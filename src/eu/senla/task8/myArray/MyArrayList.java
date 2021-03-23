package eu.senla.task8.myArray;

import java.util.*;

public class MyArrayList <E> implements MyList <E>{

    private E [] elements;
    private int elementsInList;

    public MyArrayList() {
        this(0);
    }

    public MyArrayList(MyList<? extends E> col) {
        elements = (E[]) new Object[col.size()];
        for (int i = 0; i < col.size(); i++){
            elements[i] = col.get(i);
            elementsInList++;
        }
    }

    public MyArrayList(int capacity){
            this.elements = (E[]) new Object[capacity];
            this.elementsInList = 0;
    }

    @Override
    public void add(E obj) {
        E[] temp = elements;
        elements = (E[]) new Object[temp.length + 1];
        for (int i = 0; i < temp.length; i++) {
            elements[i] = temp[i];
            }
        elements[elementsInList] = obj;
        elementsInList++;
    }

    @Override
    public void add(int index, E obj) {
        if (checkIfListFull()) {
            growList();
        }
        for (int i = elementsInList; i >= 0; i--) {
            if (i > index){
                elements[i] = elements[i-1];
            }
             elements [i] = elements[i];
        }
        elements[index] = obj;
        elementsInList++;
    }

    @Override
    public void growList() {
        E[] temp = elements;
        elements = (E[]) new Object[(int) (temp.length * 1.75)];
        for (int i = 0; i < temp.length; i++)
            elements[i] = temp[i];
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
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < elementsInList; i++)
                if (obj.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E obj) {
        if (obj == null) {
            for (int i = elementsInList -1; i >= 0; i--)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = elementsInList -1; i >= 0; i--)
                if (obj.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public E remove(int index) {
        E remove = get(index);
        elements[index] = null;
        elementsInList--;
        for (int i = 0; i <= elementsInList; i++) {
            if (i > index){
                elements[i-1] = elements[i];
            } else {
                elements[i] = elements[i];
            }
        }
        elements[elementsInList] = null;
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
                    elements[j - 1] = get(j);
                    elements[j] = (E) temp;
                }
            }
        }
    }

    @Override
    public MyList<E> subList(int start, int end) {
        MyList<E> myList = new MyArrayList<>(end-start);
        int counter = 0;
        for (int i = start; i < end; i++ ){
            myList.add(counter, get(i));
            counter++;
        }
        return myList;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements) ;
    }

   @Override
    public boolean checkIfListFull() {
        return this.elements.length == this.elementsInList;
    }
}
