package Sem1_2_3;

import java.time.LocalDate;

public abstract class Animal {

    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animal(String name, LocalDate birthday, Illness illness) {
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }

    public Animal() {
        this("Pushok", LocalDate.now(), new Illness("Chumka"));
    }

    private void wakeUp() {
        System.out.println(getType() + " " + getName() + " проснулся");
    }

    private void hunt() {
        System.out.println(getType() + " " + getName() + " охотится");
    }

    private void eat(){
        System.out.println(getType() + " " + getName() + " ест");
    };

    private void sleep() {
        System.out.println(getType() + " " + getName() + " спит");
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
