package lesson3;

//1. Написать метод, который меняет два элемента массива местами (массив может быть любого
//        ссылочного типа);+
//        2. Задача:
//        a. Даны классы Fruit+, Apple extends Fruit+, Orange extends Fruit+;
//        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
//        фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;+
//        c. Для хранения фруктов внутри коробки можно использовать ArrayList (ArrayList обсудим
//        на следующем уроке);+
//        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
//        и их количество: вес яблока – 1.0f+, апельсина – 1.5f+ (единицы измерения не важны);+
//        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
//        коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
//        равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
//        апельсинами;+
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
//        объекты, которые были в первой; +
//        g. Не забываем про метод добавления фрукта в коробку. +


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        System.out.println("Часть 1");
        changeArr();

        System.out.println("Часть 2");
        Box<Apple> box1 = new Box<>();
        box1.addFruitToBox(new Apple());
        box1.addFruitToBox(new Apple());
        box1.getFruitBoxWeight();

        Box<Apple> box2 = new Box<>();
        box2.addFruitToBox(new Apple());
        box2.addFruitToBox(new Apple());
        box2.addFruitToBox(new Apple());
        box2.addFruitToBox(new Apple());
        box2.getFruitBoxWeight();

        box1.transferToBox(box2);

        Box<Orange> box3 = new Box<>();
        box3.addFruitToBox(new Orange());
        box3.addFruitToBox(new Orange());
        box3.addFruitToBox(new Orange());
        box3.addFruitToBox(new Orange());
        box3.getFruitBoxWeight();

        System.out.println(box1.compareBoxes(box3));
    }


    public static void changeArr(){
        //объявляем первоначальный массив
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        System.out.println(array.toString());
        //поиск случайных элементов массива для замены мест
        int random = (int) (Math.random()*array.size());
        int random2 = (int) (Math.random()*array.size());
        //проверяем, не попался ли одинаковый элемент
        if (random == random2) {
            System.out.println("Случайно выбраны одинаковые элементы массива");
            System.out.println(array.toString());
            //меняем элементы местами, если они разные
        } else {

            int firstRandomInt = array.get(random);
            int secondRandomInt = array.get(random2);
            array.set(random, secondRandomInt);
            array.set(random2, firstRandomInt);
            System.out.println(array.toString());
        }
    }
}
