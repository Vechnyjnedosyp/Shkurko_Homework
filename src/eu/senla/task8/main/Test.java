package eu.senla.task8.main;

import eu.senla.task8.myArray.MyArrayList;
import eu.senla.task8.myArray.MyList;
import eu.senla.task8.myExceptions.MyArrayIndexOutOfBoundsException;
import eu.senla.task8.myExceptions.MyIllegalArgumentException;
import eu.senla.task8.myExceptions.MyNegativeArraySizeException;

public class Test {

    public static void main(String[] args) {

//        MyList<String> animal = new MyArrayList<>();
//        animal.add("cat");
//        animal.add("dog");
//        animal.add("bird");
//        animal.add("fox");
//
//        MyArrayList<String> rave = new MyArrayList<>(animal);
//
//        System.out.println("Размер списка " + rave.size());
//        System.out.println("Количество заполненных ячеек " + rave.elementInList());


//
//        rave.add("monday");
//        rave.add("tuesday");
//        rave.add("wednesday");
//        System.out.println("Список заполнен? " + rave.checkIfListFull());
//
//        System.out.println(rave);
//        System.out.println("возвращает индекс первого вхождения объекта obj в список \"monday\" " + rave.indexOf("monday"));
//
//        rave.add("monday");
//        System.out.println(rave);
//
//        System.out.println("возвращает индекс последнего вхождения объекта obj в список \"monday\" " + rave.lastIndexOf("monday"));
//        System.out.println("Размер списка " + rave.size());
//        System.out.println("Количество заполненных ячеек " + rave.elementInList());
//        System.out.println("Список заполнен? " + rave.checkIfListFull());
//        System.out.println("Возвращает объект из списка по индексу index " + rave.get(2));
//        System.out.println("Присваивает значение объекта obj элементу, который находится по индексу index " + rave.set(0, "Biba"));
//        System.out.println(rave);
//        rave.add(2, "New element");
//        System.out.println(rave);
//
//        rave.add("конец");
//        System.out.println(rave);
//        System.out.println("Размер списка " + rave.size());
//        System.out.println("Количество заполненных ячеек " + rave.elementInList());
//        System.out.println("Список заполнен? " + rave.checkIfListFull());
//
//        rave.add("или нет :)");
//
//        System.out.println(rave);
//        System.out.println("Размер списка " + rave.size());
//        System.out.println("Количество заполненных ячеек " + rave.elementInList());
//        System.out.println("Список заполнен? " + rave.checkIfListFull());
//
//        System.out.println("Удаляет объект из списка по индексу index, возвращая при этом удаленный объект " + rave.remove(4));
//        System.out.println(rave);
//
//
//        System.out.println("Размер списка " + rave.size());
//        System.out.println("Количество заполненных ячеек " + rave.elementInList());
//        System.out.println("Список заполнен? " + rave.checkIfListFull());
//
//
//        MyList<String> transport = new MyArrayList<>();
//        transport.add("bike");
//        transport.add("car");
//        transport.add("bus");
//        transport.add("motorcycle");
//        transport.add("helicopter");
//        transport.add("scooter");
//
//        System.out.println("Список изменен? " + rave.addAll(2, transport));
//        System.out.println(rave);
//
//
//        System.out.println("Размер списка " + rave.size());
//        System.out.println("Количество заполненных ячеек " + rave.elementInList());
//        System.out.println("Список заполнен? " + rave.checkIfListFull());
//
//        System.out.println("Sublist " + rave.subList(2, 6));
//
//
//        System.out.println("Финальный лист " + rave);
//
//
//        MyList<String> list = MyList.of("I'm", "very", "tired");
//        System.out.println("Static method " + list);
//
//        MyComparator str = new MyComparator();
////        Comparator<String> str = new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                return o1.compareToIgnoreCase(o2);
////            }
////        };
//        rave.sort(str);
//        System.out.println("Отсортированный список " + rave);
//
//        ListIterator<String> litr = rave.listIterator();
//
//        while (litr.hasNext()) {
//            System.out.print(litr.next() + ", ");
//        }
//
//        System.out.println();
//
//        while (litr.hasPrevious()) {
//            System.out.print(litr.previous() + ", ");
//        }
//        System.out.println();

        Test testException = new Test();
        testException.firstException();
        testException.secondException();
        testException.thirdException();

    }

    private void finallyMessage() {
        System.err.println("Exception worked. If you want to try again, JUST DO IT!" + "\n");
    }

    private void firstException() {
        try {
            MyList<String> firstException = new MyArrayList<>(-3);
            firstException.add("123");
            System.out.println(firstException);
        } catch (MyNegativeArraySizeException ex) {
            System.err.println("Trouble is related to the size of the list.");
            ex.printStackTrace();
        } finally {
            finallyMessage();
        }
    }

    private void secondException() {
        try {
            MyList<String> secondException = MyList.of("a", "b", "c", "d");
                System.out.println(secondException.subList(3,0));
//            System.out.println(secondException.subList(-1,0));
//            System.out.println(secondException.subList(1,6));
        } catch (MyArrayIndexOutOfBoundsException | MyIllegalArgumentException ex) {
            System.err.println("You entered an invalid index.");
            ex.printStackTrace();
        } finally {
            finallyMessage();
        }
    }

    private void thirdException() {
        try {
            MyList<String> thirdException = MyList.of("1", "2", "3", "4");
            thirdException.add(7, "");
            System.out.println(thirdException);
        } catch (MyArrayIndexOutOfBoundsException ex){
            System.err.println("You entered an invalid index.");
            ex.printStackTrace();
        } finally {
            finallyMessage();
        }
    }

}

