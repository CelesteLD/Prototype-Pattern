package es.ull.patrones.prototype.manager;

import es.ull.patrones.prototype.monsters.*;

import java.util.ArrayList;

public class ManagerMonster {
    ArrayList<Monster> listMonsters = new ArrayList<>();

    public ManagerMonster() {
        Monster blue = new BlueMonster("F_Blue");
        Monster green = new GreenMonster("F_Green");
        Monster orange = new OrangeMonster("F_Orange");
        Monster purple = new PurpleMonster("F_Purple");

        addMonster(blue);
        addMonster(green);
        addMonster(orange);
        addMonster(purple);
    }

    private void addMonster(Monster monster) {
        listMonsters.add(monster);
    }

    public Monster getMonster(String name) {
        for (int i = 0; i < listMonsters.size(); ++i) {
            if (listMonsters.get(i).getName() == name) {
                return listMonsters.get(i);
            }
        }
        return null;
    }

}
