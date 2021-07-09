package C14_람다식.함수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args){

        Consumer<String> consumer = t-> System.out.println(t+"8");
        consumer.accept("java");

        BiConsumer<String,String>bi = (t,u)-> System.out.println(t+u);
        bi.accept("test1","test2");

        DoubleConsumer dsc= d-> System.out.println("java"+d);
        dsc.accept(8.0);

        ObjIntConsumer<String>oi=(t,i)-> System.out.println(t+i);
        oi.accept("java",8);
    }
}
