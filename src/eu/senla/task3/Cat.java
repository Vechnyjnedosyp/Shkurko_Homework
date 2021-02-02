package eu.senla.task3;

import java.util.ArrayList;
import java.util.Objects;

public class Cat {
    private String name;
    private Integer catAge;
    private final ArrayList <String> nameCat;

    {
        nameCat = new ArrayList<>();
        nameCat.add("Соня");
        nameCat.add("Клеопатра");
        nameCat.add("Цунами");
        nameCat.add("Забияка");
        nameCat.add("Матильда");
        nameCat.add("Кнопка");
        nameCat.add("Масяня");
        nameCat.add("Царапка");
        nameCat.add("Серсея");
        nameCat.add("Ворсинка");
        nameCat.add("Амели");
        nameCat.add("Наоми");
        nameCat.add("Маркиза");
        nameCat.add("Изольда");
        nameCat.add("Гарфилд");
        nameCat.add("Том");
        nameCat.add("Гудвин");
        nameCat.add("Рокки");
        nameCat.add("Ленивец");
        nameCat.add("Пушок");
        nameCat.add("Спорти");
        nameCat.add("Бегемот");
        nameCat.add("Пират");
        nameCat.add("Гудини");
        nameCat.add("Зорро");
        nameCat.add("Саймон");
        nameCat.add("Альбус");
        nameCat.add("Базилио");
        nameCat.add("Леопольд");
        nameCat.add("Нарцисс");
        nameCat.add("Атос");
        nameCat.add("Каспер");
    }

    public Cat() {
        name = "Kitty";
        catAge = 0;
    }

    @Override
    public String toString() {
        return " Cat " +
                "name is " + name +
                " and his(her) age " + catAge +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catAge.equals(cat.catAge) && name.equals(cat.name);
    }

   @Override
    public int hashCode() {
        return Objects.hash(name, catAge);
    }

    public void firstTenCats() {
        int index = 1;
        while (index <= 10) {
            Cat firstTenCats = new Cat();
            System.out.println(1 + "." + index + firstTenCats.toString());
            index++;
        }
        System.out.println("\t");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public void secondTenCats() {
        for ( int i = 1; i <= 10 ; i++ ){
            Cat secondTenCats = new Cat();
            secondTenCats.setCatAge(1 + (int) (Math.random() * 15));
            secondTenCats.setName(nameCat.get((int) (Math.random() * 30)));
            System.out.println(2 + "." + i + " Cat " + "name is " + secondTenCats.getName() +
                    " and his(her) age " + secondTenCats.getCatAge() + '.');
        }
        System.out.println("\t");
    }



    public Cat(String name, int catAge) {
        this.name = name;
        this.catAge = catAge;
    }

    public void thirdTenCats() {
        int index = 1;
        do {
            name = nameCat.get((int) (Math.random() * 30));
            catAge = 1 + (int) (Math.random() * 15);
            Cat thirdTenCats = new Cat(name, catAge);
            System.out.println(3 + "." + index + thirdTenCats.toString());
            index++;
        } while (index <= 10);
        System.out.println("\t");
    }

    public void lastFiveCats() {
        Cat [] lastFiveCats = new Cat[5];
        for (int i = 0; i < lastFiveCats.length; i++){
            name = nameCat.get((int) (Math.random() * 30));
            catAge = 1 + (int) (Math.random() * 15);
            lastFiveCats[i] = new Cat (name, catAge);
        }
        int numberLastCats = 1;
        for ( Cat i: lastFiveCats) {
            System.out.print(4 + "." + numberLastCats);
            System.out.println(i);
            numberLastCats++;
        }
        numberLastCats = 0;
        for (int i = 0; i < lastFiveCats.length; i++){
            if ( i != 0 ) {
                System.out.println("\t" + i + "." + " Matching check of cats " + (4 + "." + numberLastCats) +
                        " and " + (4 + "." + (numberLastCats + 1)) + ": " + lastFiveCats[i-1].equals(lastFiveCats[i]));
            }
            numberLastCats++;
        }
    }
}
