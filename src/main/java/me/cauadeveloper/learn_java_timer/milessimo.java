package me.cauadeveloper.learn_java_timer;

import me.cauadeveloper.learn_Jframe.Screen;

import javax.swing.*;

public class milessimo implements Runnable{

    @Override
    public void run(){
        int i = Integer.parseInt(Screen.text.getText());

        while(i == 1000){
            Screen.text.setText(i + "");
            i++;
        }

    }

}
