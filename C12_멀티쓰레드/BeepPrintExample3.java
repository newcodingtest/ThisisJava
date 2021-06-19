package C12_멀티쓰레드;

//BeepPrintExample2 와는 다르게 Runnable 생성이 아닌 Thread 하위 클래스로 작업 스레드를 정의
//메인쓰레드 작업쓰레드 동시에 실행
public class BeepPrintExample3 {
    public static void main(String[] args){
        Thread thread = new BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
