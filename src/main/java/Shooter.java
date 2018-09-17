import lombok.Data;

@Data
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

    protected boolean canEqual(Object other) {
        return other instanceof Shooter;
    }
}
