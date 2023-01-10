package es.ull.patrones.app;

import es.ull.patrones.gui.MainFrame;
import es.ull.patrones.prototype.manager.ManagerMonster;
import es.ull.patrones.prototype.monsters.BlueMonster;
import es.ull.patrones.prototype.monsters.GreenMonster;
import es.ull.patrones.prototype.monsters.MonsterPrototype;


public class App {

    public void run() {
        /*ManagerMonster man = new ManagerMonster();
        BlueMonster pr = (BlueMonster) man.getMonster("F_Blue").clone();
        System.out.println(pr.getName());*/

        MainFrame mainFrame = new MainFrame();
    }
}
