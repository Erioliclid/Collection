package Lists;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EX_11 implements Comparable{
    static Map<String,Integer> products = new HashMap();
    public static void addProduct(){
        products.put("juice",15);
        products.put("water",45);
        products.put("meat",22);
        products.put("oil",48);
        products.put("fruits",45);
        products.put("vegetables",16);
        products.put("bread",14);
        products.put("fish",10);

    }

    public static void main(String[] args) {
        addProduct();
        System.out.println(products);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}