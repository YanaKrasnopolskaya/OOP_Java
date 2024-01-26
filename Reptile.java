import Interface.Goable;
import Interface.Swimable;

import java.time.LocalDate;

public class Reptile extends Animal implements Goable, Swimable {
    private Integer limbCount;
    public Reptile(String name, LocalDate birthDay, Illness illness, Integer limbCount){
        super(name, birthDay,illness);
        this.limbCount = limbCount;
    }


    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, limbCount: %d", name, birthday, illness, limbCount);
    }

    @Override
    public double go() {
        return 3;
    }

    @Override
    public double swim() {
        return 3;
    }
}
