package me.cauadeveloper.learn_Jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    public static JTextField text;

    public Screen(){

        setTitle("Janela");

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setResizable(false); // Isso impede o redimencionamento de tela

        setLocationRelativeTo(null);
        setLayout(null);

        JButton jButton = new JButton("Clique aqui");
        jButton.setBounds(250, 200, 250, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 15));
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(2, 2, 2));

        add(jButton);
        jButton.addActionListener(this);

        text = new JTextField("Clique aqui");
        text.setBounds(100, 100, 400, 50);
        text.setFont(new Font("Arial", Font.ITALIC, 15));
        text.setText("texto");
        add(text);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, text.getText(), "Titulo",JOptionPane.ERROR_MESSAGE);
    }
}
