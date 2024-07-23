package me.cauadeveloper.learn_java_timer;

import me.cauadeveloper.learn_Jframe.Screen;

public class Minuto implements Runnable{

    @Override
    public void run() {

        int i = Integer.parseInt(Screen.txtMin.getText());

        for (;;){
            Screen.txtMin.setText(i + "");
            i++;
            if(i == 59){
                i = 0;
            }
            try {
                Thread.sleep(60000);
            }catch (Exception e){
                System.out.println("Erro no Minuto: " + e.getMessage());
            }
        }

    }
}
