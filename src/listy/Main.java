package listy;

import ffinal.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();

        System.out.println(list.size());

        list.add(new Customer());
        list.add(new Customer());
        list.add(new Customer());

        System.out.println(list.size());

        list.remove(0);

        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list.get(1));

        m1(list);
        m2(list);
        m3(list);
    }

    public static void m1(List lista) {
        lista.size();
        lista.clear();

    }

    public static void m2(List lista) {
        lista.size();
        lista.clear();
    }

    public static void m3(List lista) {
        lista.size();
        lista.clear();
    }
}
