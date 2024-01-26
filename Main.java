import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Dogs dog = new Dogs("Pushok", LocalDate.of(2025, 1, 10), new Illness("Лешай"));
        System.out.println(dog);
        dog.fly();

        Fishes fish = new Fishes("Дори", LocalDate.of(2023, 7, 15), new Illness("Асцит"), "Гуппи");
        System.out.println(fish);
        fish.toGo();
        fish.fly();

        Reptiles snake = new Reptiles("Алиса", LocalDate.of(2012,5,11), new Illness("Сальмонеллёз"), null);
        System.out.println(snake);
        snake.toGo();

        Birds duck = new Birds("Ли-Ли", LocalDate.of(2017,9,12),new Illness("Холера"), "да");
        Birds sparrow = new Birds("Жан Батист", LocalDate.of(2020,2,2), new Illness("Лейкоз"), "нет");
        System.out.println(duck);
        duck.swim();
        System.out.println(sparrow);
        sparrow.swim();


    }

}