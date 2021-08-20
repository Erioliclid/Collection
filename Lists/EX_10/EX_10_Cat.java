package Lists.EX_10;

public class EX_10_Cat implements EX_10_Pet {

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public String food() {
        return "Mouses";
    }

    @Override
    public String move() {
        return "Sneak";
    }
}
