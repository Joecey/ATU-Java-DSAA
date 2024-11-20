package w8.ie.atu.sw;

public class Pea extends Legume{
    public Pea(String name) {
        super(name);
    }
    @Override
    public void grow() {
        System.out.println("the Pea has decided to grow");
    }

    public void mush(){
        System.out.println("Mega ouch ouch owie - get MASHED");
    }
}
