package Lists.EX_10;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EX_10_Test {
    static Map<String,EX_10_Pet> petsHub = new HashMap<>();

    public static void addAndShowPetsHub (){
        petsHub.put("Carrot",new EX_10_Parrot());
        petsHub.put("Rex",new EX_10_Dog());
        petsHub.put("Milly",new EX_10_Cat());
        petsHub.put("Rocky",new EX_10_Parrot());
        petsHub.put("Muhtar",new EX_10_Dog());
        petsHub.put("Monny",new EX_10_Cat());
        Set<String> names = new HashSet<>(petsHub.keySet());
        System.out.println(names);
    }

    public static void main(String[] args) {
        addAndShowPetsHub();
    }
}