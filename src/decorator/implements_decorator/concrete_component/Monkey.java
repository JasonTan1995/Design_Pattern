package decorator.implements_decorator.concrete_component;

import decorator.implements_decorator.component.TheGreatSage;

/**
 * 具体组件
 * 具体组件实现了组件接口的核心方法.
 */
public class Monkey implements TheGreatSage {

    @Override
    public void move() {
        System.out.println("Monkey Move");
    }
}
