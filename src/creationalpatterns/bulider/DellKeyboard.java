package creationalpatterns.bulider;

public class DellKeyboard extends Keyboard {
    @Override
    public String name() {
        return "DellKeyboard";
    }

    @Override
    public float price() {
        return 4.5f;
    }
}
