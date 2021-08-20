package Lists;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox implements Comparable<HeavyBox> {
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox weight = " + weight + "\n";
    }

    public static void main(String[] args) {


//        1.a
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(15));
        boxes.add(new HeavyBox(59));
        boxes.add(new HeavyBox(24));
        boxes.add(new HeavyBox(23));
        boxes.add(new HeavyBox(2));
        boxes.add(new HeavyBox(9));
        boxes.add(new HeavyBox(16));
//        1.b
        for (HeavyBox box2 : boxes) {
            System.out.println(box2);
        }
//         1.c
        boxes.get(0).weight = 1;
//        1.d
        /*1.d.1*/

        HeavyBox[] box1 = new HeavyBox[boxes.size()];
        System.out.println("First array ");
        for (int i = 0; i < box1.length; i++) {
            box1[i] = boxes.get(i);
            System.out.println(box1[i]);
        }
        /*1.d.2*/

        /*HeavyBox[] box2 = (HeavyBox[]) boxes.toArray();
        System.out.println("Second array ");
        for(int i=0;i<box2.length;i++){
            System.out.println(box2[i]);
        } */

        /*1.d.3*/
        System.out.println("Third array ");
        HeavyBox[] box3 = boxes.stream().toArray(HeavyBox[]::new);
        for (int i = 0; i < box3.length; i++) {
            System.out.println(box3[i]);
        }


    }

    @Override
    public int compareTo(HeavyBox box) {
        if (this.weight == box.weight) {
            return 0;
        } else {
            return this.weight > box.weight ? 1 : -1;
        }
    }
}
