package me.cauadeveloper.learn_java_timer;

import me.cauadeveloper.learn_Jframe.Screen;

public class Milessimo implements Runnable{

    @Override
    public void run(){
        int i = Integer.parseInt(Screen.txtMil.getText());

        for(;;){
            Screen.txtMil.setText(i + "");
            i++;
            if(i == 1000){
                i=0;
                try {
                    Thread.sleep(1);
                }catch (Exception e){
                    System.out.println("Erro no run do milessimo: " + e.getMessage());
                }
            }
        }

    }

}
