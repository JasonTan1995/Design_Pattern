package decorator.weapon_decorator.concrete_component;

import decorator.weapon_decorator.component.Weapon;

public class Sword extends Weapon {

    @Override
    public double attackPower() {
        return 10;
    }
}
