package decorator;

import decorator.abstract_decorator.concrete_component.Cake;
import decorator.abstract_decorator.concrete_decorator.CandleDecorator;
import decorator.abstract_decorator.concrete_decorator.FruitDecorator;
import decorator.implements_decorator.component.TheGreatSage;
import decorator.implements_decorator.concrete_component.Monkey;
import decorator.implements_decorator.concrete_decorator.Bird;
import decorator.implements_decorator.concrete_decorator.Fish;

import decorator.weapon_decorator.concrete_component.Sword;
import decorator.weapon_decorator.concrete_decorator.LongDecorator;
import decorator.weapon_decorator.concrete_decorator.SharpDecorator;
import org.junit.Test;


public class DecoratorMain {

    public static void main(String[] args) {
        Cake cake = new Cake();
        FruitDecorator fruitDecorator = new FruitDecorator(new CandleDecorator(cake));
        System.out.println(fruitDecorator.coast());
    }

    @Test
    public void function () {
        Monkey monkey = new Monkey();
        TheGreatSage theGreatSage = new Fish(new Bird(monkey));
        theGreatSage.move();
    }

    @Test
        public void weaponDecoratorTest() {
        Sword sword = new Sword();
        LongDecorator longDecorator = new LongDecorator(new SharpDecorator(sword));
        System.out.println("剑的攻击力为" + longDecorator.attackPower());
    }
}
