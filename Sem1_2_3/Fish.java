package Sem1_2_3;

import Sem1_2_3.Interface.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    private String type;

    public Fish(String name, LocalDate birthday, Illness illness, String type) {
        super(name, birthday, illness);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, typeFish: %s", name, birthday, illness, type);
    }


    @Override
    public double swim() {
        return 20;
    }
}
