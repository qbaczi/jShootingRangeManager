import java.util.LinkedList;
import java.util.Scanner;

public class Shooter {

    private String name;
    private String surename;
    private int age;
    private String idNumber;


    public Shooter(String name, String surname, int age, String idNumber) {
        this.name = name;
        this.surename = surname;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }//polecam poczytac o narzedzi LOMBOK ktory sam pisze dla nas getery i setery :)

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Shooter{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
