package w9.ie.atu.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws Exception{
        System.out.println("Week 9 - Specialisation Inheritance");
        Jumpator a = new RaceHorse("shep", 32);
        a.jump();

        List<Jumpator> jumpers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int random = (int)(Math.random() * 100);
            if (random > 50){
                jumpers.add(new RaceHorse("Arkle", 12));
            } else{
                jumpers.add(new Kangaroo("Skippy", 12));
            }
        }
        visit(jumpers);

    }

    public static void visit(Collection<Jumpator> col) throws Exception{
        for (Jumpator j: col){
            j.jump();   // behaviour depends on type of JumpingAnimal = POLYMORPHISM - swapping animal type, and what happens here depends on conditional
        }

    }
}
