package me.cauadeveloper.learn_Jframe;

import me.cauadeveloper.learn_java_timer.Milessimo;
import me.cauadeveloper.learn_java_timer.Minuto;
import me.cauadeveloper.learn_java_timer.Segundo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    public static JTextField txtMil, txtMin, txtSeg;

    Segundo segundo;
    Minuto minuto;
    Milessimo milessimo;

    Thread tMin, tSeg, tMil;


    public Screen(){

        //Screen
        setTitle("Janela");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //Chronometer
        minuto = new Minuto();
        tMin = new Thread(minuto);

        segundo = new Segundo();
        tSeg = new Thread(segundo);

        milessimo = new Milessimo();
        tMil = new Thread(milessimo);

        //Button
        JButton jButton = new JButton("Iniciar");
        jButton.setBounds(250, 200, 250, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 15));
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(2, 2, 2));
        add(jButton);
        jButton.addActionListener(this);

        //Text minuto
        txtMin = new JTextField();
        txtMin.setBounds(50, 50, 100, 50);
        txtMin.setFont(new Font("Arial", Font.ITALIC, 15));
        txtMin.setText("0");
        add(txtMin);

        //Text Segundo
        txtSeg = new JTextField();
        txtSeg.setBounds(300, 50, 100, 50);
        txtSeg.setFont(new Font("Arial", Font.ITALIC, 15));
        txtSeg.setText("0");
        add(txtSeg);

        //Text Milessimo
        txtMil = new JTextField();
        txtMil.setBounds(600, 50, 100, 50);
        txtMil.setFont(new Font("Arial", Font.ITALIC, 15));
        txtMil.setText("0");
        add(txtMil);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (!tMin.isAlive())
            tMin.start();
        if (!tSeg.isAlive())
            tSeg.start();
        if (!tMil.isAlive())
            tMil.start();

    }
}
