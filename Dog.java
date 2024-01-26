import Interface.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }


    @Override
    public double go() {
        return 5;
    }
}
