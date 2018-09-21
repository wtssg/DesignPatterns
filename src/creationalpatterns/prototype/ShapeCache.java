package creationalpatterns.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<>();

    /**
     * 获得缓冲表中的指定对象的复制
     * @param shapeId
     * 所需获得的形状是id，“1”代表圆形，“2”代表正方形
     * @return
     * 指定id对应形状的复制
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
