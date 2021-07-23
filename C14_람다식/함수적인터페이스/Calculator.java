package C14_람다식.함수적인터페이스;

public class Calculator {

    //정적 메소드
    public static int staticMethod(int x, int y){
        return x+y;
    }
    //인스턴스 메소드
    public int instanceMethod(int x, int y){
        return x+y;
    }
}
