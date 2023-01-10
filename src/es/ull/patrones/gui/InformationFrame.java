package es.ull.patrones.gui;

import es.ull.patrones.prototype.monsters.Monster;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InformationFrame extends JFrame {

    JPanel firstPanel = new JPanel();
    JPanel topLeft;
    JPanel topRight;
    JPanel downLeft;
    JPanel downRight;

    public InformationFrame(ArrayList<Monster> orange, ArrayList<Monster> green, ArrayList<Monster> blue, ArrayList<Monster> purple) {
        setLocationRelativeTo(this);
        setTitle("Information about clones");
        setBounds(450, 200,1100, 700);
        setContentPane(setFirstPanel());

        topLeft = setSmallPanel(0,0,550, 335, 238,7,145, "orange");
        setInformationInPanel(topLeft, orange, "F_Orange", 238,7,145);
        firstPanel.add(topLeft);

        topRight =  setSmallPanel(550, 0, 550, 335, 195, 195, 195, "purple");
        setInformationInPanel(topRight, purple, "F_Purple", 195,195,195);
        firstPanel.add(topRight);

        downLeft = setSmallPanel(0, 335,550, 335, 195,195,195, "green");
        setInformationInPanel(downLeft, green, "F_Green", 195,195,195);
        firstPanel.add(downLeft);

        downRight =  setSmallPanel(550, 335, 550, 335, 238, 7, 145, "blue");
        setInformationInPanel(downRight, blue, "F_Blue", 238,7,145);
        firstPanel.add(downRight);

        setVisible(true);
    }

    public JPanel setFirstPanel() {
        firstPanel.setVisible(true);
        firstPanel.setBackground(Color.WHITE);
        firstPanel.setLayout(null);
        return firstPanel;
    }

    public JPanel setSmallPanel(int x, int y, int width, int height, int r, int g, int b, String text) {
        JPanel aux = new JPanel();
        //aux.setBackground(Color.BLACK);
        JPanel aux2 = new JPanel();
        aux2.setBounds(0,0, 120, 150); aux2.setVisible(true); aux2.setBackground(Color.WHITE);
        aux2.add(setLabelImage(text));
        aux2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        aux.add(aux2);
        aux.setBounds(x, y, width, height);
        aux.setVisible(true);
        aux.setBackground(new Color(r, g, b)); // Cambiar
        aux.setLayout(null);
        aux.setBorder(new BevelBorder(BevelBorder.RAISED));

        return aux;
    }

    public JLabel setLabelImage(String text) {
        ImageIcon image = new ImageIcon("img/" + text + ".png");
        JLabel label = new JLabel();
        label.setBounds(0, 0, 120, 150);

        label.setIcon(new ImageIcon(image.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT)));
        label.setVisible(true);
        return label;
    }

    public void setInformationInPanel(JPanel panel, ArrayList<Monster> array, String nameOfMonster, int r, int g, int b) {
        String msg = "Has been cloned " + array.size() + " monsters of " + nameOfMonster;
        JLabel aux = setLabel(msg, 90, 280, 40, 400,17);
        aux.setVisible(true);

        if (array.size() >= 1) {
            JTextArea textArea = new JTextArea();
            textArea.setBounds(120, 40, 400, 200);
            textArea.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 12));
            textArea.setBackground(new Color(r, g, b));
            textArea.setVisible(true);
            for (int i = 0; i < array.size(); ++i) {
                String textE = textArea.getText() + "\n";
                textArea.setText(textE + "     MONSTER [" + (i+1) + "] CLONED is called  --  " + array.get(i).getName());
            }
            panel.add(textArea);
        }

        panel.add(aux);

    }

    public JLabel setLabel(String text, int x, int y,int width, int height, int size) {
        JLabel label = new JLabel();
        label.setText(text);
        label.setVisible(true);
        label.setBounds(x, y, height, width);
        label.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, size));
        return label;
    }

}
