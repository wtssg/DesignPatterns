package creationalpatterns.abstractfactory;

public class HpFactory extends AbstarctFactory {
    @Override
    Mouse produceMouse() {
        return new HpMouse();
    }

    @Override
    Keyboard produceKeyboard() {
        return new HpKeyboard();
    }
}
