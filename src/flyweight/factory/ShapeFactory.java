package flyweight.factory;

import flyweight.bean.shape.Circle;
import flyweight.bean.shape.Shape;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 * 用以创建具体享元类,维护相同的享元对象.
 * Color 是内部状态.
 * X Y Radius 是 外部状态.
 */
public class ShapeFactory {

    private static final ConcurrentHashMap<String, Shape> pool = new ConcurrentHashMap<>();

    public static Shape getCircle(String color) {
        if (!pool.containsKey(color)) {
            pool.put(color, new Circle(color));
            System.out.println("Creating circle of color :" + color);
        }
        return pool.get(color);
    }

}
