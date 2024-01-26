import Interface.Flyable;
import Interface.Goable;

import java.time.LocalDate;

public class Squirrel extends Animal implements Goable,Flyable{
    private String type;
    public Squirrel(String name, LocalDate birthday, Illness illness, String type) {
        super(name, birthday, illness);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, type: %s", name, birthday, illness, type);
    }

    @Override
    public double fly() {
        if(type == "flying squirrel"){
            return 4;
        }
        return 0;
    }

    @Override
    public double go() {
        return 0;
    }
}
