package decorator.abstract_decorator.concrete_component;

import decorator.abstract_decorator.component.Sweet;

/**
 * 具体组件
 * 也是被装饰的对象.
 * 该组件实现或继承组件的核心方法,完成某一个具体的业务逻辑.
 */
public class Cake extends Sweet {

    @Override
    public String getDescirption() {
        return "A Cake";
    }

    @Override
    public Double coast() {
        return 66.0;
    }
}
