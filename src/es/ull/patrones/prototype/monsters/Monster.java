package es.ull.patrones.prototype.monsters;

import javax.swing.*;

public abstract class Monster implements MonsterPrototype {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract MonsterPrototype clone();

}
