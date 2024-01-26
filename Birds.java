import java.time.LocalDate;

public class Birds extends Animals {
    private String flippers;

    public Birds(String name, LocalDate birthday, Illness illness, String flippers) {
        super(name, birthday, illness);
        this.flippers = flippers;
    }

    @Override
    public void swim() {
        if(flippers.equals("нет")){
            System.out.println(getType() + " " + getName() + " не умеет плавать");
        } else {
            System.out.println(getType() + " " + getName() + " плавает");
        }
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, flippers: %s", name, birthday, illness, flippers);
    }
}
