package w8.ie.atu.sw;

public class RaceHorse extends JumpingAnimal{
    private int speed;
    public RaceHorse(String name, int maxHeight) {
        super(name, maxHeight);
    }

    public RaceHorse(String name, int maxHeight, int lifeForce) {
        super(name, maxHeight, lifeForce);
    }

    public void gallop() throws Exception{
        System.out.println(super.getName() + " is galloping at " + speed + "km/hr");
        move();

    }
    @Override
    public void sleep() {
        System.out.println(this.getClass().getName() + " is sleeping standing up ...");
    }

    @Override
    public void eat() {
        System.out.println(this.getClass().getName() + " is eating...");
        int temp = speed;
        speed = 0;
        super.eat();
        speed = temp;
    }
}
