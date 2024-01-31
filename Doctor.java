import java.util.ArrayList;
import java.util.Date;

public class Doctor{
    private String name;
    private int age;
    private String specialization;
    private int cabinetNumber;

    public Doctor(String name,int age, String specialization, int cabinetNumber){

        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.cabinetNumber = cabinetNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSpecialization(){
        return specialization;
    }

    public int getCabinetNumber(){
        return cabinetNumber;
    }


    public void terapyPatient(String patient){
        System.out.println("Доктор " + getName() + " лечит пациента " + patient);
    }

    @Override
    public String toString() {
        return String.format("name: %s, age: %d, specialization: %s, cabinet: %d", name, age, specialization, cabinetNumber);
    }
}
