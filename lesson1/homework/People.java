package lesson1.homework;

/*
Добавить класс People который будет содержать характеристики спортсменов+
Добавить класс Team, который будет содержать:+
название команды;+
массив из четырех участников — в конструкторе можно сразу всех участников указывать);+
метод для вывода информации о членах команды, прошедших дистанцию;+
метод вывода информации обо всех членах команды.+
Добавить класс Course (полоса препятствий), в котором будут находиться:+
массив препятствий;+
метод, который будет просить команду пройти всю полосу.+
внутри метода отвечающего за прохождение полосы - добавить проверку возможностей людей на преодаление этой полосы+
И того
Создать 2 команды с 8 (Сумммарно) спортсмена и определить, какая команда победить в соревновании+

Шаблон в конце методички
 */
public class People {

    private String name;
    private int age;
    private int weight;
    private int height;
    private int swimSkill;
    private int runSkill;

    public People(String name, int age, int height, int weight, int swimSkill){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.swimSkill = swimSkill;
        this.runSkill = swimSkill*2;

    }

    public void infoPeople() {
        System.out.println(toString());
    }

    public String toString() {
        return "Имя: " + name + ", возраст: " + age + ", рост: " + height + "см, вес: " + weight + "кг";
    }

    public int getRunSkill() {
        return runSkill;
    }

    public int getSwimSkill() {
        return swimSkill;
    }

    public boolean isSuccessful(Course course) {
        return swimSkill >= course.getSwimmingCourse() && runSkill >= course.getRunningCourse();
        }

}

