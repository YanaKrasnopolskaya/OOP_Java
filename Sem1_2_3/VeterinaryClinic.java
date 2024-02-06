package Sem1_2_3;

import Sem1_2_3.Interface.Flyable;
import Sem1_2_3.Interface.Goable;
import Sem1_2_3.Interface.Swimable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class VeterinaryClinic extends Animal{
    private String name;
    private String address;
    private HashMap<Animal, LocalDateTime> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Flyable> flyables;
    private ArrayList<Goable> goables;
    private ArrayList<Swimable> swimables;

    public VeterinaryClinic(String name, String address){
        this.name = name;
        this.address = address;
        this.patients = new HashMap<>();
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
        this.flyables = new ArrayList<>();
        this.goables = new ArrayList<>();
        this.swimables = new ArrayList<>();
    }

    public void addPatient(Animal patient){
        var time = LocalDateTime.now();
        patients.put(patient, time);
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse){
        nurses.add(nurse);
    }

    public void addFlyingAnimals(Flyable animal){

        flyables.add(animal);

    }
    public void addGoingAnimals(Goable animal){
        goables.add(animal);
    }

    public void addSwimingAnimals(Swimable animal){
        swimables.add(animal);
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return String.format("name: %s, address: %s", name, address);
    }

    public void getPatients(){
        System.out.println("Пациенты клиники:");
        for (Animal patient : patients.keySet()){
            var date = patients.get(patient);
            System.out.println("Пациент: " + patient.getName() + ". Дата поступления: " + date);
        }
    }

    public void getDoctors(){
        System.out.println("Доктора клиники:");
        for (Doctor doc: doctors) {
            System.out.println(doc);
        }
    }
    public void getNurses(){
        System.out.println("Медсёстры клиники:");
        for (Nurse nurse: nurses) {
            System.out.println(nurse);
        }
    }
    public void getFlyingAnimals(){
        System.out.println("Летающие животные:");
        for (Flyable animal: flyables) {
            System.out.println(animal);
        }
    }
    public void getGoingAnimals(){
        System.out.println("Бегающие животные:");
        for (Goable animal: goables) {
            System.out.println(animal);
        }
    }
    public void getSwimingAnimals(){
        System.out.println("Плавающие животные:");
        for (Swimable animal: swimables) {
            System.out.println(animal);
        }
    }
}
