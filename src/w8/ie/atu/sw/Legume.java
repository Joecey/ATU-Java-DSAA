package w8.ie.atu.sw;

public abstract class Legume {
    private String name;
    public Legume(String name) {
        this.name = name;
    }
    protected String getName() {
        return name;
    }

    public abstract void grow();
}
