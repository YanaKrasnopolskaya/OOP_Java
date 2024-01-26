import java.time.LocalDate;

public class Reptiles extends Animals{
    private Integer limbCount;
    public Reptiles(String name, LocalDate birthDay, Illness illness, Integer limbCount){
        super(name, birthDay,illness);
        this.limbCount = limbCount;
    }

    @Override
    public void toGo() {
        if(limbCount == null){
            System.out.println(getType() + " " + getName() + " ползает");
        } else {
            System.out.println(getType() + " " + getName() + " ходит");
        }
    }

    @Override
    public void fly() {
        System.out.println("рептилии не летают!");
    }

    @Override
    public String toString() {
        return String.format(getType() + " name: %s, birthday: %s, illness: %s, limbCount: %d", name, birthday, illness, limbCount);
    }
}
