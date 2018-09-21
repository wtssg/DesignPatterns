package creationalpatterns.abstractfactory;

public class DellFactory extends AbstarctFactory {
    @Override
    Mouse produceMouse() {
        return new DellMouse();
    }

    @Override
    Keyboard produceKeyboard() {
        return new DellKeyboard();
    }
}
