package lesson1.homework;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //информация об участниках команд
        ArrayList<People> teammates1 = new ArrayList<People>(4);
        teammates1.add(new People("Алексей", 23, 180, 90, 1790));
        teammates1.add(new People("Антонина", 28, 165, 55, 600));
        teammates1.add(new People("Надежда", 21, 163, 57, 1500));
        teammates1.add(new People("Вячеслав", 32, 181, 84, 2000));

        ArrayList<People> teammates2 = new ArrayList<People>(4);
        teammates2.add(new People("Александр", 29, 174, 68, 1900));
        teammates2.add(new People("Дмитрий", 27, 182, 90, 1400));
        teammates2.add(new People("Ольга", 18, 171, 54, 1500));
        teammates2.add(new People("Анастасия", 30, 164, 60, 3060));

        //создание команд
        Team team1 = new Team("Winners", teammates1);
        Team team2 = new Team("BestWinners", teammates2);

        //вывод информации о всех участниках команды
        team1.allInfoTeam(teammates1);
        team2.allInfoTeam(teammates2);

        //создание полосы преепятствий
        Course course = new Course(1200, 1400);

        //вывод инфо об участниках, которые прошли дистанцию
        team1.successInfoTeam(teammates1, course);
        team2.successInfoTeam(teammates2, course);

        //прохождение полосы препятствий и подсчет результатов
        course.courseStart(team1, team2, course);

        //вывод результатов
        course.showResults(team1, team2, course);
    }
}

