package Lists;

import java.util.Set;
import java.util.TreeSet;

public class EX_3{
   static Set<HeavyBox> againBox = new TreeSet<>();

    public static void main(String[] args) {


        againBox.add(new HeavyBox(15));
        againBox.add(new HeavyBox(59));
        againBox.add(new HeavyBox(23));
        againBox.add(new HeavyBox(2));
        againBox.add(new HeavyBox(9));
        againBox.add(new HeavyBox(16));


        for (HeavyBox box:againBox){
            System.out.println(box);
        }
    }



}
