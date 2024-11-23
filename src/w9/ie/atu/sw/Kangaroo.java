package w9.ie.atu.sw;

public class Kangaroo extends JumpingAnimal {
    private Pouch pouch = new Pouch();
    private int size = 7; // start life with a size of 7

    public Kangaroo(String name, int maxHeight) {
        super(name, maxHeight);
    }

    public Kangaroo(String name, int maxHeight, int lifeForce) {
        super(name, maxHeight, lifeForce);
    }

    @Override
    public void jump() throws Exception {
        System.out.println(this.getName() + " is jumping as a Kangaroo");
        super.move();
        this.eat();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(this.getClass().getName() + " is eating...");
        size++;
    }

    @Override
    public void sleep() {
        System.out.println(this.getClass().getName() + " is sleeping lying down...");
    }

    private class Pouch {
        // an inner class promotes encapsulation but not re-used
        // divide and concur
    }
}
