package w8.ie.atu.sw;

public class Kangaroo extends JumpingAnimal{
    private Pouch pouch = new Pouch();

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

    private class Pouch {
        // an inner class promotes encapsulation but not re-used
        // divide and concur
    }
}
