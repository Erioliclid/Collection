package Lists;

import java.util.ArrayList;
import java.util.List;

public class EX_7 {
    static List<HeavyBox>boxList = new ArrayList<>();
    static List<HeavyBox>boxLite = new ArrayList<>();

    public static void addBoxList(){
        boxList.add(new HeavyBox(15));
        boxList.add(new HeavyBox(522));
        boxList.add(new HeavyBox(150));
        boxList.add(new HeavyBox(42));
        boxList.add(new HeavyBox(394));
        boxList.add(new HeavyBox(211));
    }

    public static void checkWeight(){
        for(int i=0; i<boxList.size();i++){
           HeavyBox box = boxList.get(i);
           if(box.weight<=100){
               boxLite.add(box);
               boxList.remove(i);
           }
        }
    }

    public static void main(String[] args) {
        addBoxList();
        checkWeight();
        System.out.println("BoxList");
        System.out.println(boxList);
        System.out.println();
        System.out.println("BoxLite");
        System.out.println(boxLite);
    }
}
