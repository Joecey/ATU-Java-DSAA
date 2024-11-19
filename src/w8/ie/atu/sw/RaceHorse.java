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
}
