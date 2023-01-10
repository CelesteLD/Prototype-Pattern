package es.ull.patrones.prototype.monsters;

import javax.swing.*;

public class PurpleMonster extends Monster {

    public PurpleMonster(String name) {
        setName(name);
    }

    @Override
    public MonsterPrototype clone() {
        MonsterPrototype monster = new PurpleMonster(this.getName());
        return monster;
    }
}
