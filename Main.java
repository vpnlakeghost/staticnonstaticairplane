public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane();
        Airplane plane3 = new Airplane();

        plane1.land();

        System.out.println(plane1.haslanded());
        System.out.println(plane2.haslanded());
        System.out.println(plane3.haslanded());

    }
}
