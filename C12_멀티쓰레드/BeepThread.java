package C12_멀티쓰레드;

import java.awt.*;

//BeepPrintExample2 와는 다르게 Runnable 생성이 아닌 Thread 하위 클래스로 작업 스레드를 정의
public class BeepThread extends Thread {
    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }


}
