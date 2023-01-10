package es.ull.patrones.gui;

import es.ull.patrones.prototype.manager.ManagerMonster;
import es.ull.patrones.prototype.monsters.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    JPanel firstPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel leftPanel = new JPanel();
    
    JLabel leftIcon = new JLabel();
    JLabel textTop;

    JLabel orangeMonster;
    JButton orangeButton;
    JLabel greenMonster;
    JButton greenButton;
    JLabel purpleMonster;
    JButton purpleButton;
    JLabel blueMonster;
    JButton blueButton;

    JButton seeClones;
    ManagerMonster man = new ManagerMonster();
    ArrayList<Monster> listOfClonesOrange = new ArrayList<>();
    ArrayList<Monster> listOfClonesGreen = new ArrayList<>();
    ArrayList<Monster> listOfClonesBlue = new ArrayList<>();
    ArrayList<Monster> listOfClonesPurple = new ArrayList<>();
    JLabel name = new JLabel();

    public MainFrame() {
        setLocationRelativeTo(this);
        setTitle("Application");
        setBounds(450, 200,1100, 700);
        setContentPane(setFirstPanel());

        textTop = setLabel("Choose the monster you want to clone", 480, 30, 50, 700, 25);
        firstPanel.add(textTop);

        orangeMonster = setLabelsImage("img/orange.png", 440, 150, 150, 120);
        orangeButton = setButton("Clone", 465, 300, 100, 30, 16);
        orangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrangeMonster auxMonster = (OrangeMonster) man.getMonster("F_Orange").clone();

                JDialog dialog = new JDialog();
                dialog.setLocation(830,350);
                dialog.setLayout(null);
                dialog.setSize(400, 300);
                dialog.add(setLabelsImage("img/orange.png", 20, 20, 150, 120));
                dialog.add(setLabel("Monster Cloned!", 200, 10, 100, 150, 15));
                name = setLabel("NAME : F_Orange", 40, 140, 50, 150, 12);
                dialog.add(name);
                JButton changeName = setButton("Change Name", 200, 90, 130, 40, 13);
                changeName.addActionListener(e1 -> {
                    dialog.dispose();
                    JDialog dialog1 = new JDialog();
                    dialog1.setLocation(830,350);
                    dialog1.setLayout(null);
                    dialog1.setSize(400, 200);
                    JLabel text = setLabel("Enter the new name for the monster", 40, 20, 30, 400, 15);
                    JTextField textField = new JTextField();
                    textField.setBounds(120, 60, 150, 30);
                    JButton change = new JButton();
                    change = setButton("Change", 150, 100, 100, 40, 17);
                    change.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e1) {
                            auxMonster.setName(textField.getText());
                            listOfClonesOrange.add(auxMonster);
                            dialog1.dispose();
                        }
                    });
                    dialog1.add(change);
                    dialog1.add(text);
                    dialog1.add(textField);
                    dialog1.setVisible(true);
                });
                dialog.add(changeName);
                JButton continueB = setButton("Continue", 150, 200, 130, 40, 16);
                continueB.addActionListener(e12 -> {
                    listOfClonesOrange.add(auxMonster);
                    dialog.dispose();
                });
                dialog.add(continueB);
                dialog.setVisible(true);
            }
        });
        firstPanel.add(orangeMonster); firstPanel.add(orangeButton);

        greenMonster = setLabelsImage("img/green.png", 440, 410, 150, 120);
        greenButton = setButton("Clone", 465, 560, 100, 30, 16);
        greenButton.addActionListener(e -> {
            GreenMonster auxMonster = (GreenMonster) man.getMonster("F_Green").clone();

            JDialog dialog = new JDialog();
            dialog.setLocation(830,350);
            dialog.setLayout(null);
            dialog.setSize(400, 300);
            dialog.add(setLabelsImage("img/green.png", 20, 20, 150, 120));
            dialog.add(setLabel("Monster Cloned!", 200, 10, 100, 150, 15));
            name = setLabel("NAME : F_Green", 40, 140, 50, 150, 12);
            dialog.add(name);
            JButton changeName = setButton("Change Name", 200, 90, 130, 40, 13);
            changeName.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                    JDialog dialog1 = new JDialog();
                    dialog1.setLocation(830,350);
                    dialog1.setLayout(null);
                    dialog1.setSize(400, 200);
                    JLabel text = setLabel("Enter the new name for the monster", 40, 20, 30, 400, 15);
                    JTextField textField = new JTextField();
                    textField.setBounds(120, 60, 150, 30);
                    JButton change = new JButton();
                    change = setButton("Change", 150, 100, 100, 40, 17);
                    change.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            auxMonster.setName(textField.getText());
                            listOfClonesGreen.add(auxMonster);
                            dialog1.dispose();
                        }
                    });
                    dialog1.add(change);
                    dialog1.add(text);
                    dialog1.add(textField);
                    dialog1.setVisible(true);
                }
            });
            dialog.add(changeName);
            JButton continueB = setButton("Continue", 150, 200, 130, 40, 16);
            continueB.addActionListener(e13 -> {
                listOfClonesGreen.add(auxMonster);
                dialog.dispose();
            });
            dialog.add(continueB);
            dialog.setVisible(true);
        });
        firstPanel.add(greenMonster); firstPanel.add(greenButton);

        purpleMonster = setLabelsImage("img/purple.png", 780, 130, 150, 140);
        purpleButton = setButton("Clone", 805, 300, 100, 30, 16);
        purpleButton.addActionListener(e -> {
            PurpleMonster auxMonster = (PurpleMonster) man.getMonster("F_Purple").clone();

            JDialog dialog = new JDialog();
            dialog.setLocation(830,350);
            dialog.setLayout(null);
            dialog.setSize(400, 300);
            dialog.add(setLabelsImage("img/purple.png", 20, 20, 150, 120));
            dialog.add(setLabel("Monster Cloned!", 200, 10, 100, 150, 15));
            name = setLabel("NAME : F_Purple", 40, 140, 50, 150, 12);
            dialog.add(name);
            JButton changeName = setButton("Change Name", 200, 90, 130, 40, 13);
            changeName.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                    JDialog dialog1 = new JDialog();
                    dialog1.setLocation(830,350);
                    dialog1.setLayout(null);
                    dialog1.setSize(400, 200);
                    JLabel text = setLabel("Enter the new name for the monster", 40, 20, 30, 400, 15);
                    JTextField textField = new JTextField();
                    textField.setBounds(120, 60, 150, 30);
                    JButton change = new JButton();
                    change = setButton("Change", 150, 100, 100, 40, 17);
                    change.addActionListener(e14 -> {
                        auxMonster.setName(textField.getText());
                        listOfClonesPurple.add(auxMonster);
                        dialog1.dispose();
                    });
                    dialog1.add(change);
                    dialog1.add(text);
                    dialog1.add(textField);
                    dialog1.setVisible(true);
                }
            });
            dialog.add(changeName);
            JButton continueB = setButton("Continue", 150, 200, 130, 40, 16);
            continueB.addActionListener(e15 -> {
                listOfClonesPurple.add(auxMonster);
                dialog.dispose();
            });
            dialog.add(continueB);
            dialog.setVisible(true);
        });
        firstPanel.add(purpleMonster); firstPanel.add(purpleButton);

        blueMonster = setLabelsImage("img/blue.png", 780, 400, 150, 140);
        blueButton = setButton("Clone", 805, 560, 100, 30,16);
        blueButton.addActionListener(e -> {
            BlueMonster auxMonster = (BlueMonster) man.getMonster("F_Blue").clone();

            JDialog dialog = new JDialog();
            dialog.setLocation(830,350);
            dialog.setLayout(null);
            dialog.setSize(400, 300);
            dialog.add(setLabelsImage("img/blue.png", 20, 20, 150, 120));
            dialog.add(setLabel("Monster Cloned!", 200, 10, 100, 150, 15));
            name = setLabel("NAME : F_Blue", 40, 140, 50, 150, 12);
            dialog.add(name);
            JButton changeName = setButton("Change Name", 200, 90, 130, 40, 13);
            changeName.addActionListener(e17 -> {
                dialog.dispose();
                JDialog dialog1 = new JDialog();
                dialog1.setLocation(830,350);
                dialog1.setLayout(null);
                dialog1.setSize(400, 200);
                JLabel text = setLabel("Enter the new name for the monster", 40, 20, 30, 400, 15);
                JTextField textField = new JTextField();
                textField.setBounds(120, 60, 150, 30);
                JButton change = new JButton();
                change = setButton("Change", 150, 100, 100, 40, 17);
                change.addActionListener(e16 -> {
                    auxMonster.setName(textField.getText());
                    listOfClonesBlue.add(auxMonster);
                    dialog1.dispose();
                });
                dialog1.add(change);
                dialog1.add(text);
                dialog1.add(textField);
                dialog1.setVisible(true);
            });
            dialog.add(changeName);
            JButton continueB = setButton("Continue", 150, 200, 130, 40, 16);
            continueB.addActionListener(e18 -> {
                listOfClonesBlue.add(auxMonster);
                dialog.dispose();
            });
            dialog.add(continueB);
            dialog.setVisible(true);
        });
        firstPanel.add(blueMonster); firstPanel.add(blueButton);

        seeClones = setButton("See Clones", 90, 70, 150, 30, 16);
        seeClones.addActionListener(e -> {
            new InformationFrame(listOfClonesOrange, listOfClonesGreen, listOfClonesBlue, listOfClonesPurple);
        });
        firstPanel.add(seeClones);

        firstPanel.add(setLeftPanel());
        firstPanel.add(setTopPanel());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JPanel setFirstPanel() {
        firstPanel.setVisible(true);
        firstPanel.setBackground(Color.WHITE);
        firstPanel.setLayout(null);
        return firstPanel;
    }

    public JLabel setLabel(String text, int x, int y,int width, int height, int size) {
        JLabel label = new JLabel();
        label.setText(text);
        label.setVisible(true);
        label.setBounds(x, y, height, width);
        label.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, size));
        return label;
    }

    public JPanel setTopPanel(){
        topPanel.setBounds(430, 20, 700, 70);
        topPanel.setVisible(true);
        topPanel.setBackground(new Color(238,7,145));
        topPanel.setLayout(null);

        return topPanel;
    }

    public JPanel setLeftPanel() {
        leftPanel.setVisible(true);
        leftPanel.setBackground(Color.BLUE);
        leftPanel.setLayout(null);
        leftPanel.setBounds(0, 0, 340, 700);
        leftPanel.add(setLabelLeftIcon());
        return leftPanel;
    }

    public JLabel setLabelLeftIcon() {
        ImageIcon image = new ImageIcon("img/play.jpg");
        leftIcon.setBounds(0,0,340, 700);

        leftIcon.setIcon(new ImageIcon(image.getImage().getScaledInstance(leftIcon.getWidth(),leftIcon.getHeight(), Image.SCALE_DEFAULT)));
        leftIcon.setVisible(true);
        return leftIcon;
    }

    public JLabel setLabelsImage(String text, int x, int y, int height, int width) {
        ImageIcon image = new ImageIcon(text);
        JLabel label = new JLabel();
        label.setBounds(x, y, height, width);

        label.setIcon(new ImageIcon(image.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT)));
        label.setVisible(true);
        return label;
    }

    public JButton setButton(String text, int x, int y, int width, int height, int size) {
        JButton aux = new JButton();
        aux.setVisible(true);
        aux.setText(text);
        aux.setFont(new Font("Lucida Sans Typewriter", Font.BOLD , size));
        aux.setBackground(Color.BLACK);
        aux.setForeground(new Color(238,7,145));
        aux.setBounds(x, y, width, height);
        return aux;
    }

}
