package sety;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(10);
        set.add(0);
        set.add(7);
        set.add(2);
        set.add(2);
        set.add(100);
        set.add(44);

        System.out.println(set.size());

        System.out.println(set);

        /*for(Integer liczba : set) {
            if(liczba == 2) {
                set.remove(liczba);
            }
        }*/

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer liczba = iterator.next();
            if(liczba == 2) {
                iterator.remove();
            }
        }

    }
}
