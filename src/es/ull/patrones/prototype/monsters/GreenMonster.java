package es.ull.patrones.prototype.monsters;

import javax.swing.*;

public class GreenMonster extends Monster {

    public GreenMonster(String name) {
        setName(name);
    }


    @Override
    public MonsterPrototype clone() {
        MonsterPrototype monster = new GreenMonster(this.getName());
        return monster;
    }
}
