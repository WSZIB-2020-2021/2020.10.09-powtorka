package ffinal;

public class Main {
    public static void main(String[] args) {
        final int a = 5;

        final Customer c = new Customer();

        System.out.println(c.name);

        c.name = "Janusz";

        System.out.println(c.name);
    }
}
