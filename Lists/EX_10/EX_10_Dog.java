package Lists.EX_10;

public class EX_10_Dog implements EX_10_Pet {

    @Override
    public int legs() {
        return 4;
    }
    @Override
    public String food() {
        return "cats";
    }

    @Override
    public String move() {
        return "Run";
    }
}
