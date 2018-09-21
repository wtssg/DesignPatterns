package creationalpatterns.bulider;

public class HpMouse extends Mouse {

    @Override
    public String name() {
        return "HpMouse";
    }

    @Override
    public float price() {
        return 3f;
    }
}
