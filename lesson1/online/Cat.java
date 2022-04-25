package lesson1.online;

public class Cat extends Animal{

    private String poroda;
    private String voice = "мяу";


    public Cat(String poroda, String name, String sex, int age){
        super(name, sex, age);
        this.poroda = poroda;
    }

    public Cat(String name, String sex, int age){
        super(name, sex, age);
    }

    public void allInfo(){
        System.out.println("Порода " + poroda + " Имя " + name + " Пол " + sex + " Возраст " + age);
    }

    public void allInfo(String color){
        System.out.println("Порода " + poroda + " Имя " + name + " Пол " + sex + " Возраст " + age + " Цвет " + color);
    }

    @Override
    public void voice(){
        System.out.println(voice);
    }

    @Override
    public void move() {
        System.out.println("Бегает и прыгает");
    }

    public void setName(String name) {
        if (name.length()==2)
        this.name = name;
        else
            System.out.println("Длина слова не равна 2");
    }

    public String getName(){
        return name;
    }


    @Override
    public void eat() {
        System.out.println("Котик поел");
    }

    @Override
    public String toString() {
        return "Порода " + poroda + " Имя " + name + " Пол " + sex + " Возраст " + age;
    }
}
