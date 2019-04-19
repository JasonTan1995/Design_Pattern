package decorator.weapon_decorator.concrete_decorator;

import decorator.weapon_decorator.component.Weapon;
import decorator.weapon_decorator.decorator.StrengthenDecorator;

public class LongDecorator extends Weapon {

    private Weapon weapon;

    public LongDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public double attackPower() {
        return weapon.attackPower() + 10;
    }
}
