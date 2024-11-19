package w8.ie.atu.sw;

public class JumpingAnimal extends Animal{
    private int maxHeight;

    public JumpingAnimal(String name, int maxHeight) {
        super(name);
        this.maxHeight = maxHeight;
    }

    public JumpingAnimal( String name, int maxHeight, int lifeForce){
        super(lifeForce, name);
        this.maxHeight = maxHeight;

    }

    public void jump() throws Exception{
        System.out.println(this.getName() + " is jumping to a height of " + this.maxHeight);
        this.move();    // these all work cus it extends
        super.move();   // inherited one
        System.out.println(super.getName() + " is finished jumping " );

    }

}
