package w9.ie.atu.sw;

import java.util.Random;
public abstract class Animal {
    private int lifeForce;
    private String name;

    public Animal(String name) {
        super();
        this.name = name;
        this.lifeForce = new Random().nextInt() >>> 1;  // shift bits by 1
    }

    public Animal(int lifeForce, String name) {
        super();
        this.name = name;
        this.lifeForce = lifeForce;
    }

    public abstract void sleep();   // an abstract / deferred method

    // visible only to subtypes and co-packaged types
    protected String getName() {
        return name;
    }

    public void eat(){
        System.out.println(this.getClass().getName() + " is eating...");
        lifeForce++;
    }

    public void move() throws Exception{
        if (lifeForce < 0) throw new Exception("Cannot move because " + this.name + " is dead.");
        if (lifeForce <= 100) sleep();  // this works still even though it's not implemented
        lifeForce--;
    }
}
