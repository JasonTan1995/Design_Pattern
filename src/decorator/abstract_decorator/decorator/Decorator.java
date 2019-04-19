package decorator.abstract_decorator.decorator;

import decorator.abstract_decorator.component.Sweet;

/**
 * 装饰者
 * 实现或继承组件接口.
 * 对于ConcreteComponent来说，不需要知道Decorator的存在，Decorator是一个接口或抽象类
 */
public abstract class Decorator extends Sweet {

    public abstract String getDescription();
}
