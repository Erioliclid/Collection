package Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EX_8_Product {
    static Map<String, String> toyBox = new HashMap<>();

    public static void addToyBox() {
        toyBox.put("Jack", "Rabbit");
        toyBox.put("Bobby", "Car");
        toyBox.put("Jessica", "Doll");
        toyBox.put("Teddy", "Bear");
        toyBox.put("Lego", "Constructor");
        System.out.println(toyBox);
    }

    public static void keys(){
        Set<String> names = toyBox.keySet();
        System.out.println(names);
    }
    public static void values(){
        ArrayList<String> values = new ArrayList<>(toyBox.values());
        System.out.println(values);
    }

    public static void main(String[] args) {
        addToyBox();
        keys();
        values();
    }
}
