package decorator.implements_decorator.concrete_decorator;

import decorator.implements_decorator.component.TheGreatSage;
import decorator.implements_decorator.decorator.Change;

/**
 * 具体装饰者
 */
public class Fish extends Change {

    public Fish(TheGreatSage theGreatSage) {
        super(theGreatSage);
    }

    @Override
    public void move() {
        System.out.println("Fish move");
    }
}
