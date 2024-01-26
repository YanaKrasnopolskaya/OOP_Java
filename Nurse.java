public class Nurse {
    private String name;
    private int age;
    private int experience;

    public Nurse(String name, int age, int experience){
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public void patientCare(String patient){
        System.out.println("Медсестра " + getName() + " ухаживает за пациентом " + patient);
    }

    @Override
    public String toString() {
        return String.format("name: %s, age: %d, experience: %d", name, age, experience);
    }
}
