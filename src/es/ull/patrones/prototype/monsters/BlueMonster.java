package es.ull.patrones.prototype.monsters;

import javax.swing.*;

public class BlueMonster extends Monster {

    public BlueMonster(String name) {
        setName(name);
    }

    @Override
    public MonsterPrototype clone() {
        MonsterPrototype monster = new BlueMonster(this.getName());

        return monster;
    }
}
