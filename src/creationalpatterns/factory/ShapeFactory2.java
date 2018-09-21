package creationalpatterns.factory;

/**
 * 多个工厂模式
 */
public class ShapeFactory2 {
    public Shape produceCircle() {
        return new Circle();
    }
    public Shape produceRectangle() {
        return new Rectangle();
    }
    public Shape prodeuceSquare() {
        return new Square();
    }
}
