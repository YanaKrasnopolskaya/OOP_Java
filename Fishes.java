import java.time.LocalDate;

public class Fishes extends Animals {
    private String type;

    public Fishes(String name, LocalDate birthday, Illness illness, String type) {
        super(name, birthday, illness);
        this.type = type;
    }

    @Override
    public void toGo() {
        System.out.println("Рыбы не ходят!");
    }

    @Override
    public void fly() {
        System.out.println("Рыбы не летают!");
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, typeFish: %s", name, birthday, illness, type);
    }



}
