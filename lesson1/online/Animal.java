package lesson1.online;

public abstract class Animal implements Move, Eat{

    protected String name;
    protected int age;
    protected String sex;

    public Animal(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public abstract void voice();

}
