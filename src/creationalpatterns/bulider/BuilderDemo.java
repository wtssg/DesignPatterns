package creationalpatterns.bulider;

/**
 * 建造者模式使用多个简单的对象一步步构建成一个复杂的对象
 * 一些基本部件不会变，而其组合经常变化的时候使用
 */
public class BuilderDemo {
    public static void main(String[] args) {
        OrderBuilder builder = new OrderBuilder();
        Order order = builder.MixOrder();
        order.showItems();
        order.showCost();
    }
}
