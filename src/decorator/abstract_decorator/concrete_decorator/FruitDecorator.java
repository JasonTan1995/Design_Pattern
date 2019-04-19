package decorator.abstract_decorator.concrete_decorator;

import decorator.abstract_decorator.component.Sweet;
import decorator.abstract_decorator.decorator.Decorator;

/**
 * 具体装饰者
 * 具体实现装饰的业务逻辑,即实现了被分离的各个增强功能点.
 * 蜡烛装饰器
 */
public class FruitDecorator extends Decorator {

    private Sweet sweet;

    public FruitDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getDescription() {
        return sweet.getDescirption() + ", fruit";
    }

    @Override
    public Double coast() {
        return sweet.coast() + 10;
    }
}
