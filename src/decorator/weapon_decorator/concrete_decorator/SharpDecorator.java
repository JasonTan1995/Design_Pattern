package decorator.weapon_decorator.concrete_decorator;

import decorator.weapon_decorator.component.Weapon;
import decorator.weapon_decorator.decorator.StrengthenDecorator;

public class SharpDecorator extends Weapon {

    private Weapon weapon;

    public SharpDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public double attackPower() {
        return weapon.attackPower() + 20;
    }
}
