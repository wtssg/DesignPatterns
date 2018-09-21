package creationalpatterns.bulider;

public abstract class Keyboard implements Item{
    @Override
    public abstract String name();

    @Override
    public abstract float price();
}
