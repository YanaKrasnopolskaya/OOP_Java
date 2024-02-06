package Sem1_2_3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        VeterinaryClinic vetClinic = new VeterinaryClinic("Зооклиника", "ул. Пушкина 12");

        Doctor doctor1 = new Doctor("Петров Николай Иванович",30,"терапевт",10);
        Doctor doctor2 = new Doctor("Иванов Алексей Петрович",36,"хирург",13);
        Nurse nurse1 = new Nurse("Сидорова Анна Николаевна", 27,5);
        Nurse nurse2 = new Nurse("Филатова Юлия Александровна", 34,10);

        vetClinic.addDoctor(doctor1);
        vetClinic.addNurse(nurse1);
        vetClinic.addNurse(nurse2);
        vetClinic.addDoctor(doctor2);

        vetClinic.getDoctors();
        vetClinic.getNurses();

        Dog dog = new Dog("Собака",LocalDate.of(2022,3,28),new Illness("Лишай"));
        Bird duck = new Bird("Утка",LocalDate.of(2020,5,12),new Illness("Холера"),"да");
        Fish fish = new Fish("Акула",LocalDate.of(2000,1,2),new Illness("Лейкемия"),"shark");
        Bird crow = new Bird("Ворона",LocalDate.of(2015,5,15),new Illness("Лишай"),"нет");
        Reptile snake = new Reptile("Змея",LocalDate.of(2002,10,10),new Illness("Сальмонелёз"),0);
        Reptile lizard = new Reptile("Ящерица",LocalDate.of(2000,9,1),new Illness("Грибок"),4);
        Squirrel squirrel = new Squirrel("Белка",LocalDate.of(2017,3,30),new Illness("Бешенство"),"flying squirrel");

        vetClinic.addPatient(dog);
        vetClinic.addPatient(duck);
        vetClinic.addPatient(fish);

        vetClinic.getPatients();


        vetClinic.addFlyingAnimals(duck);
        vetClinic.addFlyingAnimals(crow);
        vetClinic.addFlyingAnimals(squirrel);
        vetClinic.addGoingAnimals(dog);
        vetClinic.addGoingAnimals(duck);
        vetClinic.addGoingAnimals(crow);
        vetClinic.addGoingAnimals(lizard);
        vetClinic.addGoingAnimals(squirrel);
        vetClinic.addSwimingAnimals(duck);
        vetClinic.addSwimingAnimals(fish);
        vetClinic.addSwimingAnimals(snake);
        vetClinic.addSwimingAnimals(lizard);


        vetClinic.getFlyingAnimals();
        vetClinic.getGoingAnimals();
        vetClinic.getSwimingAnimals();

        System.out.println("Скорость " + lizard.getType() + ": " + lizard.go());

        doctor1.terapyPatient("Собака");
    }

}