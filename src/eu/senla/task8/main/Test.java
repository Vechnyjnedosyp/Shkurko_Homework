package eu.senla.task8.main;


import eu.senla.task8.myArray.MyArrayList;
import eu.senla.task8.myArray.MyComparator;
import eu.senla.task8.myArray.MyList;


import java.util.Comparator;


public class Test {

    public static void main(String [] args) {

        MyList<String> animal = new MyArrayList<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("bird");
        animal.add("fox");

        MyArrayList<String> rave = new MyArrayList<>(animal);
        System.out.println(rave);
        System.out.println("Размер списка " + rave.size());
        System.out.println("Количество заполненных ячеек " + rave.elementInList());


        rave.add("monday");
        rave.add("tuesday");
        rave.add("wednesday");
        System.out.println("Список заполнен? " + rave.checkIfListFull());

        System.out.println(rave);
        System.out.println("возвращает индекс первого вхождения объекта obj в список \"monday\" " + rave.indexOf("monday"));

        rave.add("monday");
        System.out.println(rave);

        System.out.println("возвращает индекс последнего вхождения объекта obj в список \"monday\" " + rave.lastIndexOf("monday"));
        System.out.println("Размер списка " + rave.size());
        System.out.println("Количество заполненных ячеек " + rave.elementInList());
        System.out.println("Список заполнен? " + rave.checkIfListFull());
        System.out.println("Возвращает объект из списка по индексу index " + rave.get(2));
        System.out.println("Присваивает значение объекта obj элементу, который находится по индексу index " + rave.set(0,"Biba"));
        System.out.println(rave);
        rave.add(2,"New element"); //4
        System.out.println(rave);

        rave.add("конец");
        System.out.println(rave);
        System.out.println("Размер списка " + rave.size());
        System.out.println("Количество заполненных ячеек " + rave.elementInList());
        System.out.println("Список заполнен? " + rave.checkIfListFull());

        rave.add("или нет :)");

        System.out.println(rave);
        System.out.println("Размер списка " + rave.size());
        System.out.println("Количество заполненных ячеек " + rave.elementInList());
        System.out.println("Список заполнен? " + rave.checkIfListFull());

        System.out.println("Удаляет объект из списка по индексу index, возвращая при этом удаленный объект " + rave.remove(4));
        System.out.println(rave);


        System.out.println("Размер списка " + rave.size());
        System.out.println("Количество заполненных ячеек " + rave.elementInList());
        System.out.println("Список заполнен? " + rave.checkIfListFull());



        MyList<String> transport = new MyArrayList<>();
        transport.add("bike");
        transport.add("car");
        transport.add("bus");
        transport.add("motorcycle");
        transport.add("helicopter");
        transport.add("scooter");

        System.out.println("Список изменен? " + rave.addAll(2, transport));
        System.out.println(rave);


        System.out.println("Размер списка " + rave.size());
        System.out.println("Количество заполненных ячеек " + rave.elementInList());
        System.out.println("Список заполнен? " + rave.checkIfListFull());

        System.out.println("Sublist " + rave.subList(2,6));


        System.out.println("Финальный лист " + rave);


        MyList<String> list = MyList.of("I'm", "very", "tired");
        System.out.println("Static method " + list);

        MyComparator str = new MyComparator();
//        Comparator<String> str = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        };
        rave.sort(str);
        System.out.println("Отсортированный список " + rave);







//        ArrayList<String> arrayList = new ArrayList<>(4);
//        arrayList.add("q");
//        arrayList.add("w");
//        arrayList.add("e");
//        arrayList.add("r");
//        arrayList.add("t");
//        arrayList.add("y");
//        arrayList.add("u");
//        arrayList.add("i");
//
//        System.out.println(arrayList.subList(3,6));
//        System.out.println(arrayList);
//        System.out.println(arrayList.iterator().hasNext());
//        System.out.println(arrayList.iterator().next());
//        System.out.println(arrayList.iterator().hasNext());
//        System.out.println(arrayList.iterator().next());
//        System.out.println(arrayList.iterator().hasNext());
//        System.out.println(arrayList.iterator().next());
//        Comparator<String> str ;
//        arrayList.sort(str);
//        System.out.println(arrayList);





    }
}
