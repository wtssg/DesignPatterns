package creationalpatterns.bulider;

public class DellMouse extends Mouse {

    @Override
    public String name() {
        return "DellMouse";
    }

    @Override
    public float price() {
        return 4f;
    }
}
