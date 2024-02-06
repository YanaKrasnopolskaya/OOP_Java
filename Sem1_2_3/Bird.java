package Sem1_2_3;

import Sem1_2_3.Interface.Flyable;
import Sem1_2_3.Interface.Goable;
import Sem1_2_3.Interface.Swimable;

import java.time.LocalDate;

public class Bird extends Animal implements Flyable, Goable, Swimable {
    private String flippers;

    public Bird(String name, LocalDate birthday, Illness illness, String flippers) {
        super(name, birthday, illness);
        this.flippers = flippers;
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, flippers: %s", name, birthday, illness, flippers);
    }

    @Override
    public double fly() {
        return 40;
    }

    @Override
    public double go() {
        return 2;
    }

    @Override
    public double swim() {
        if(flippers == "нет"){
            return 0;
        }
        return 1;
    }
}
