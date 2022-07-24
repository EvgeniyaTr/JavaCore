package lesson1.homework;

/*Добавить класс Course (полоса препятствий), в котором будут находиться:
массив препятствий;
метод, который будет просить команду пройти всю полосу.
внутри метода отвечающего за прохождение полосы - добавить проверку возможностей людей на преодаление этой полосы
 */

public class Course {
    private int runningCourse;
    private int swimmingCourse;
    private Team team1;
    private Team team2;
    private int result1 = 0;
    private int result2 = 0;

    public Course(int runningCourse, int swimmingCourse){
        this.runningCourse = runningCourse;
        this.swimmingCourse = swimmingCourse;
    }

    public void courseStart(Team team1, Team team2, Course course) {
        System.out.println("----------------------");
        System.out.println("Соревнования для команд: " + team1.getTeamName() + " и " + team2.getTeamName() + " начались!");
        //подсчет баллов за соревнование и проверка возможностей участников
        for (int i = 0; i < team1.getTeammate().size(); i++) {
            if (team1.getTeammate().get(i).isSuccessful(course)
            ) {
                result1++;
            } else {
                result1 = result1;
            }
        }
        System.out.println(team1.getTeamName() + " - количество баллов: " + result1);
        for (int i = 0; i < team2.getTeammate().size(); i++) {
            if (team2.getTeammate().get(i).isSuccessful(course)
            ) {
                result2++;
            } else {
                result2 = result2;
            }
        }
        System.out.println(team2.getTeamName() + " - количество баллов: " + result2);
    }

    public void showResults(Team team1, Team team2, Course course) {
        if (result1 > result2){
            System.out.println("Победитель соревнований - команда " + team1.getTeamName());
        } else {
            if (result2 > result1){
                System.out.println("Победитель соревнований - команда " + team2.getTeamName());
            } else {
                System.out.println("Ничья");
            }
        }
        }


    public String toString() {
        return "Полоса препятствий: бег - " + runningCourse + "м, плавание - " + swimmingCourse + "м.";
    }

    public int getRunningCourse() {
        return runningCourse;
    }

    public int getSwimmingCourse() {
        return swimmingCourse;
    }
}
