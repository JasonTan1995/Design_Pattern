package decorator.implements_decorator.decorator;

import decorator.implements_decorator.component.TheGreatSage;

/**
 * 装饰者
 * 实现或继承组件接口.
 * 对于ConcreteComponent来说，不需要知道Decorator的存在，Decorator是一个接口或抽象类
 */
public class Change implements TheGreatSage {

    private TheGreatSage theGreatSage;

    public Change(TheGreatSage theGreatSage) {
        this.theGreatSage = theGreatSage;
    }

    @Override
    public void move() {
        theGreatSage.move();
    }
}
