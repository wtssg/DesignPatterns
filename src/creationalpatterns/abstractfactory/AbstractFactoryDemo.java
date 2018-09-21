package creationalpatterns.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstarctFactory HpFactory = new HpFactory();
        Mouse mouse = HpFactory.produceMouse();
        Keyboard keyboard = HpFactory.produceKeyboard();
        mouse.mouse();
        keyboard.keyboard();
    }
}
