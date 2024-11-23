package w9.ie.atu.sw;

public interface Jumpator {
    public static final double MIN_HEIGHT = 1.00d;

    public enum Unit {Metric, Imperial}

    ;    // set of predefined constants

    public abstract void jump() throws Exception;

    // static methods used to add helper behaviour to an interface
    public static double getHeightAsMetres(double feet) {
        final double weight = 0.3048d;
        return feet * weight;
    }

    // default method used to retrofit and interface with new functional behaviour
    public default void jump(double height, Unit unit) throws Exception {
        if (unit == Unit.Imperial) {
            height = Jumpator.getHeightAsMetres(height);
        }

        jump(); // call jump() even though it hasn't been implemented yet
    }
}
