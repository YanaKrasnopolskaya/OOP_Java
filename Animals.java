import java.time.LocalDate;

public class Animals {

    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animals(String name, LocalDate birthday, Illness illness) {
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }

    public Animals() {
        this("Pushok", LocalDate.now(), new Illness("Chumka"));
    }

    private void wakeUp() {
        System.out.println(getType() + " " + getName() + " проснулся");
    }

    private void hunt() {
        System.out.println(getType() + " " + getName() + " охотится");
    }

    private void eat() {
        System.out.println(getType() + " " + getName() + " кушает");
    }

    private void sleep() {
        System.out.println(getType() + " " + getName() + " спит");
    }

    public void toGo(){
        System.out.println(getType() + " " + getName() + " ходит");
    }

    public void swim(){
        System.out.println(getType() + " " + getName() + " плавает");
    }

    public void fly(){
        System.out.println(getType() + " " + getName() + " летает");
    }

    public void lifeCycle() {
        wakeUp();
        hunt();
        eat();
        sleep();
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthday;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s", name, birthday, illness);
    }


}
