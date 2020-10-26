package mapy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Key", 5);
        Integer value = map.get("Key");

        System.out.println(value);

        map.put("Key2", 10);
        map.put("Key3", 15);

        Integer value2 = map.get("Key3");

        System.out.println(value2);

        Map<String, String> ustawienia = new HashMap<>();
        ustawienia.put("serwer1", "http://10.101.10.100");
        ustawienia.put("serwer2", "http://10.101.10.104");
        ustawienia.put("serwer3", "http://10.101.10.130");
        ustawienia.put("connectionTimeout", "3000");

        System.out.println(ustawienia.get("serwer1"));
    }
}
