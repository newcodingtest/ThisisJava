package C14_람다식.함수적인터페이스;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args){
        IntSupplier intSupplier=()->{
            int num = (int)(Math.random()*6)+1;
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("랜덤수:"+num);

    }
}
