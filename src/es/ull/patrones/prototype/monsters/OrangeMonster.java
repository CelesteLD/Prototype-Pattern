package es.ull.patrones.prototype.monsters;

import javax.swing.*;


public class OrangeMonster extends Monster {

    public OrangeMonster(String name) {
        setName(name);
    }

    @Override
    public MonsterPrototype clone() {
        MonsterPrototype monster = new OrangeMonster(this.getName());
        return monster;
    }
}
