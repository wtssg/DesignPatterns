package creationalpatterns.bulider;

public class HpKeyboard extends Keyboard {

    @Override
    public String name() {
        return "HpKeyboard";
    }

    @Override
    public float price() {
        return 5f;
    }
}
