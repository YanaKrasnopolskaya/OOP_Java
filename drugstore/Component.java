package drugstore;

public abstract class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower(){
        return power;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weight: %s, Power: %d", name, weight, power);
    }

    @Override
    public int compareTo(Component component){
//        if(this.power > component.power) return 1;
//        else if (this.power < component.power) return -1;
//        else return 0;
        return Integer.compare(this.power, component.power);
    }
}
