package flyweight;

import flyweight.bean.shape.Circle;
import flyweight.bean.web.User;
import flyweight.bean.web.WebSite;
import flyweight.factory.ShapeFactory;
import flyweight.factory.WebSiteFactory;
import org.junit.Test;

/**
 * 内部状态 : COLOR, KEY
 * 外部状态 : X,Y,RADIUS,USER
 * (ConcreteFlyWeight)内部状态 : 在享元对象内部不随外界环境改变而改变的共享部分
 * (UnsharedConcreteFlyWeight)外部状态 : 随着环境的改变而改变 , 不能够共享的状态就是外部状态
 */
public class FlyWeightMain {

    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite fx1 = factory.getWebSiteCategory("产品展示");
        fx1.use(new User("BOB"));
        WebSite fx2 = factory.getWebSiteCategory("产品展示");
        fx2.use(new User("Dennis"));
        WebSite fx3 = factory.getWebSiteCategory("blog");
        fx3.use(new User("David"));
        System.out.println(factory.getWebSiteSize());
    }

    @Test
    public void fun2() {
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
