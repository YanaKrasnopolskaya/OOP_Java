package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>{
    private String name;
    private List<Component> components;
    private int index;

    public Pharmacy(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public String getName(){
        return name;
    }

    public Pharmacy addComponent(Component component){
        components.add(component);
        return this;
    }

    public List<Component> getComponents(){
        return components;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, Компоненты: %s", name, components);

    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Pharmacy pharmacy) {
        int thisPower = 0;
        for (Component component : components) {
            thisPower += component.getPower();
        }

        int otherPower = 0;
        for (Component component : pharmacy.getComponents()) {
            otherPower += component.getPower();
        }

        return Integer.compare(thisPower, otherPower);
    }
}
