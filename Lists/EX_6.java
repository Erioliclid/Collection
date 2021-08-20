package Lists;

import java.util.ArrayDeque;
import java.util.Queue;

public class EX_6 {
    static Queue<HeavyBox> boxLine = new ArrayDeque<>();

    static public void addBoxLine(){
        boxLine.offer(new HeavyBox(101));
        boxLine.offer(new HeavyBox(15));
        boxLine.offer(new HeavyBox(11));
        boxLine.offer(new HeavyBox(1));
        boxLine.offer(new HeavyBox(151));
        boxLine.offer(new HeavyBox(8521));
        boxLine.offer(new HeavyBox(954));
    }

    static public void removeBoxLine(){
        boxLine.poll();
        boxLine.poll();
        boxLine.poll();
        boxLine.poll();
        boxLine.poll();
        boxLine.poll();
        boxLine.poll();
    }

    public static void main(String[] args) {
        addBoxLine();
        removeBoxLine();
        System.out.println(boxLine);

    }
}
