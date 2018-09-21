package creationalpatterns.prototype;

/**
 * 原型模式是用来创建重复的对象，同时又保持性能。
 * 这种模式实现了一个原型接口，该接口用于创建当前对象的克隆。当直接
 * 创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个
 * 高代价的数据库操作之后被创建。我们可以缓存该对象，在下一次请求返
 * 回它的克隆，在需要的时候更新数据库，以此减少数据库调用。
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        shape.draw();
        Shape shape2 = ShapeCache.getShape("2");
        shape2.draw();
    }
}
