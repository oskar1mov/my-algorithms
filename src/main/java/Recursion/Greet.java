package Recursion;

public class Greet {
    public static void greet2(String name) {
        System.out.println("how are you, " + name + "?");
    }

    public static void bye() {
        System.out.println("ok, bye!");
    }

    public static void greet(String name) {
        System.out.println("hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }
}
