package lesson1.homework;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<People> teammate;



    public Team (String teamName, ArrayList<People> teammate){
       this.teamName = teamName;
       this.teammate = teammate;

    }

    public void allInfoTeam(ArrayList<People> teammate) {
        System.out.println("----------------------");
        System.out.println(toString());
        System.out.println("Участники команды:");
        for (People people: teammate) {
            people.infoPeople();
        }
    }

    public String toString(){
        return "Название команды: " + teamName + ".";
    }

    public String getTeamName() {
        return teamName;
    }

    public void successInfoTeam(ArrayList<People> teammate, Course course) {
        System.out.println("----------------------");
        System.out.println(toString());
        System.out.println("Участники команды, успешно преодолевшие дистанцию:");
        for (People people: teammate) {
        if (people.isSuccessful(course)){
            people.infoPeople();
        } else  {
            System.out.print("");
            };
        }
    }

    public ArrayList<People> getTeammate() {
        return teammate;
    }
}



