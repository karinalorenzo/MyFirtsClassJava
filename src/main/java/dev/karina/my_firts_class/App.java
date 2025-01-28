package dev.karina.my_firts_class;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person jeremih = new Person("Jeremih", "Reyes L.", "56787894J", 2012);
        System.out.println(jeremih.name);
        System.out.println(jeremih.surname);
        System.out.println(jeremih.numDocument);
        System.out.println(jeremih.yearBirthday);
    }
}
