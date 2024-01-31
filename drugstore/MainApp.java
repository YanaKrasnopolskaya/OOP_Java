package drugstore;

import drugstore.components.Penicillin;
import drugstore.components.Salt;
import drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        Pharmacy pharm1 = new Pharmacy("Лекарство1");
        pharm1
                .addComponent(new Penicillin("penicillin", "2.0 mg", 5){})
                .addComponent(new Water("water","5.0 mg",10))
                .addComponent(new Salt("salt","3.0 mg",3));

        Pharmacy pharm2 = new Pharmacy("Лекарство2");
        pharm2
                .addComponent(new Penicillin("penicillin","3.0 mg", 7))
                .addComponent(new Water("water","3.0 mg",8))
                .addComponent(new Salt("salt","1.0 mg",1));

        Pharmacy pharm3 = new Pharmacy("Лекарство3");
        pharm3
                .addComponent(new Penicillin("penicillin", "4.0 mg", 10))
                .addComponent(new Salt("salt","2.0 mg",2))
                .addComponent(new Water("water","10.0 mg",20));

        ArrayList<Pharmacy> pharmacys = new ArrayList<>();
        pharmacys.add(pharm1);
        pharmacys.add(pharm2);
        pharmacys.add(pharm3);

        for (Pharmacy pharm: pharmacys) {
            System.out.println(pharm);
        }

        System.out.println();
        Collections.sort(pharmacys);

        for (Pharmacy pharm: pharmacys) {
            System.out.println(pharm);
        }

//        Component c1 = new Penicillin("p","5.0 mg",10);
//        Component c2 = new Water("w","2.0 mg",5);
//        Component c3 = new Salt("s","1.0 mg",3);
//
//        ArrayList<Component> components = new ArrayList<>();
//        components.add(c1);
//        components.add(c2);
//        components.add(c3);
//
//        System.out.println(components);
//
//        Collections.sort(components);
//
//        System.out.println(components);




    }
}
