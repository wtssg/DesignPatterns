package creationalpatterns.factory;

/**
 * 静态工厂模式
 */
public class ShapeFactory3 {
    public static Shape produceCircle() {
        return new Circle();
    }
    public static Shape produceRectangle() {
        return new Rectangle();
    }
    public static Shape prodeuceSquare() {
        return new Square();
    }
}
