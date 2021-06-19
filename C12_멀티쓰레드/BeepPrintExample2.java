package C12_멀티쓰레드;

import javax.tools.Tool;
import java.awt.*;

//메인쓰레드와 작업쓰레드가 동시에 실행하는 경우
public class BeepPrintExample2 {
    public static void main(String[] args){
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        //6~7라인 대체가능
/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                       thread.sleep();
                    }catch (Exception e){}
                }
            }
        })*/

        /*       Thread thread = new Thread(() -> {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                       thread.sleep();
                    }catch (Exception e){}
                }
            }
        })*/



        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }

    }
}
