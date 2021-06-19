package C12_멀티쓰레드;

import java.awt.*;

//메인 쓰레드만 이용하는 경우
public class BeepPrintExample1 {
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //툴킷 객체얻기
        for (int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try {Thread.sleep(500);
        }catch(Exception e){}


        }
    }
}
