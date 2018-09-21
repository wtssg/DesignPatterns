package creationalpatterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 工厂模式
        ShapeFactory1 shapeFactory = new ShapeFactory1();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        // 多个工厂模式
        ShapeFactory2 shapeFactory2 = new ShapeFactory2();
        shape = shapeFactory2.prodeuceSquare();
        shape.draw();

        // 静态工厂模式，不需要实例化工厂类，大多数情况下使用
        shape = ShapeFactory3.produceRectangle();
        shape.draw();
    }
}
