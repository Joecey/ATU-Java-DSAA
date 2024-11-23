package w9.ie.atu.sw;

import java.io.Serial;
import java.io.Serializable;

public abstract class JumpingAnimal extends Animal implements Jumpator, Comparable<JumpingAnimal>, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
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

    public int getMaxHeight(){
        return this.maxHeight;
    }
    @Override
    public int compareTo(JumpingAnimal other) {
        if (this.maxHeight == other.getMaxHeight()) return 0;
        return (this.maxHeight > other.getMaxHeight()) ? 1 : -1;
    }
}
