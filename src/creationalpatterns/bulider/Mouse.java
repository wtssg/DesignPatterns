package creationalpatterns.bulider;

public abstract class Mouse implements Item {
    @Override
    public abstract String name();

    @Override
    public abstract float price();
}
