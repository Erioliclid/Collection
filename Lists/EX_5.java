package Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EX_5 {
    static Set<Integer> boxes2 = new HashSet<>();
    static Set<Integer> boxes3 = new HashSet<>();
    static List<Integer> boxes4 = new ArrayList<>();
    static List<Integer> boxes5 = new ArrayList<>();

    public static void addBoxes2() {
       boxes2.add(15);
       boxes2.add(25);
       boxes2.add(4);
       boxes2.add(21);
       boxes2.add(3);
       boxes2.add(83);
       boxes2.add(12);
       boxes2.add(66);
    }

    public static void addBoxes3() {
        boxes2.add(15);
        boxes2.add(25);
        boxes2.add(4);
        boxes2.add(21);
        boxes2.add(3);
        boxes2.add(83);
        boxes2.add(12);
        boxes2.add(66);
    }
    public static void addBoxes4() {
        boxes4.add(15);
        boxes4.add(25);
        boxes4.add(4);
        boxes4.add(21);
        boxes4.add(3);
        boxes4.add(83);
        boxes4.add(12);
        boxes4.add(66);
    }

    public static void addBoxes5() {
        boxes5.add(16);
        boxes5.add(23);
        boxes5.add(4);
        boxes5.add(29);
        boxes5.add(5);
        boxes5.add(83);
        boxes5.add(13);
        boxes5.add(67);
    }

    public static void union(Set<Integer> boxes2, Set<Integer> boxes3){
        boxes2.addAll(boxes3);
    }
//    Не работает из-за отсутствия упорядоченности(Null)

    public static void intersect(Set<Integer> boxes2, Set<Integer> boxes3){
        boxes2.retainAll(boxes3);
    }

//

    public static void intersect2(List<Integer> boxes4, List<Integer> boxes5){
        boxes4.retainAll(boxes5);
    }

    public static void main(String[] args) {
        addBoxes4();
        addBoxes5();
        intersect2(boxes4,boxes5);
        System.out.println(boxes4);

    }
}
