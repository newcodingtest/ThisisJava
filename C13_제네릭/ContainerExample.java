package C13_제네릭;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args){
        Container<String> container = new Container<String>();
        container.set("홍길동");
        String str = container.get();

        Container<Integer> container1 = new Container<Integer>();
        container1.set(6);
        int value = container1.get();
    }
}
