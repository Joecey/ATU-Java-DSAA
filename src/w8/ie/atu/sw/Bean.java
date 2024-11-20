package w8.ie.atu.sw;

public abstract class Bean extends Legume {
    public Bean(String name) {
        super(name);
    }
    public void grow(){
        System.out.println("This bean is growing!");
    };

}
