public class Airplane {

    private int;

    private static boolean landed;

    public void takeOff() {
        landed = false;
    }

    public void land() {
        landed = true;
    }

    public boolean hasLanded() {
        return landed;
    }
}
