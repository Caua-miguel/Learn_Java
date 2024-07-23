package me.cauadeveloper.learn_java_timer;

import me.cauadeveloper.learn_Jframe.Screen;

public class Segundo implements Runnable{

    @Override
    public void run() {

        int i = Integer.parseInt(Screen.txtSeg.getText());

        for (;;){
            Screen.txtSeg.setText(i + "");
            i++;
            if(i == 59){
                i = 0;
            }
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Erro no Segundo: " + e.getMessage());
            }
        }

    }
}
