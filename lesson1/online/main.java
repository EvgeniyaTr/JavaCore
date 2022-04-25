package lesson1.online;

public class main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Русская голубая", "Смертокрыл", "male", 3);
        cat1.allInfo();
        cat1.voice();
        cat1.move();

        Cat cat2 = new Cat("Смертокрыл", "male", 3);
        cat2.allInfo("Серый");

        Animal cat3 = new Cat("Русская голубая", "Смертокрыл", "male", 3);
        cat3.eat();

        System.out.println(cat1);





    }
}
