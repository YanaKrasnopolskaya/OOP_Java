import java.time.LocalDate;

public class Dogs extends Animals{
    public Dogs(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    @Override
    public void fly() {
        System.out.println("Собаки не летают!");
    }
}
